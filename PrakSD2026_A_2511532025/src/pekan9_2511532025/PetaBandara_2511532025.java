package pekan9_2511532025;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class PetaBandara_2511532025 extends JFrame {

    private HashMap<String, ArrayList<String>> graph_2025 = new HashMap<>();

    private JComboBox<String> start_2025;
    private JComboBox<String> goal_2025;

    private JButton bfsButton_2025;
    private JButton dfsButton_2025;
    private JButton resetButton_2025;

    private JTextArea hasil_2025;
    private JTextArea areaGraph_2025;

    private ArrayList<String> visitedNodes_2025 = new ArrayList<>();
    private ArrayList<String> path_2025 = new ArrayList<>();

    public PetaBandara_2511532025() {

        createGraph_2025();

        setTitle("Pencarian Jalur Menggunakan BFS dan DFS");
        setSize(1000, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel title_2025 = new JLabel("PETA BANDARA", SwingConstants.CENTER);
        title_2025.setFont(new Font("Arial", Font.BOLD, 22));
        title_2025.setOpaque(true);
        title_2025.setBackground(new Color(25, 55, 109));
        title_2025.setForeground(Color.WHITE);
        title_2025.setPreferredSize(new Dimension(1000, 50));
        add(title_2025, BorderLayout.NORTH);

        JPanel controlPanel_2025 = new JPanel();

        start_2025 = new JComboBox<>(graph_2025.keySet().toArray(new String[0]));
        goal_2025 = new JComboBox<>(graph_2025.keySet().toArray(new String[0]));

        bfsButton_2025 = new JButton("BFS");
        dfsButton_2025 = new JButton("DFS");
        resetButton_2025 = new JButton("RESET");

        bfsButton_2025.setBackground(Color.GREEN);
        dfsButton_2025.setBackground(Color.ORANGE);
        resetButton_2025.setBackground(Color.RED);

        controlPanel_2025.add(new JLabel("Start"));
        controlPanel_2025.add(start_2025);
        controlPanel_2025.add(new JLabel("Goal"));
        controlPanel_2025.add(goal_2025);
        controlPanel_2025.add(bfsButton_2025);
        controlPanel_2025.add(dfsButton_2025);
        controlPanel_2025.add(resetButton_2025);

        add(controlPanel_2025, BorderLayout.SOUTH);

        areaGraph_2025 = new JTextArea();
        areaGraph_2025.setEditable(false);
        areaGraph_2025.setFont(new Font("Monospaced", Font.BOLD, 16));
        displayGraph_2025();

        add(new JScrollPane(areaGraph_2025), BorderLayout.CENTER);

        hasil_2025 = new JTextArea();
        hasil_2025.setEditable(false);
        hasil_2025.setFont(new Font("Monospaced", Font.PLAIN, 14));

        JScrollPane scroll_2025 = new JScrollPane(hasil_2025);
        scroll_2025.setPreferredSize(new Dimension(500, 0));
        add(scroll_2025, BorderLayout.EAST);

        bfsButton_2025.addActionListener(e -> BFS_2025());
        dfsButton_2025.addActionListener(e -> DFS_2025());
        resetButton_2025.addActionListener(e -> resetGraph_2025());

        setVisible(true);
    }

    private void createGraph_2025() {

        String[] lokasi_2025 = {
                "Terminal1","Terminal2","Terminal3",
                "Parkir","Skytrain","StasiunKA",
                "CheckIn","Imigrasi","GateKeberangkatan",
                "Bagasi"
        };

        for (String s : lokasi_2025) {
            graph_2025.put(s, new ArrayList<>());
        }

        addEdge_2025("Terminal1", "Terminal2");
        addEdge_2025("Terminal2", "Terminal3");
        addEdge_2025("Terminal1", "Parkir");
        addEdge_2025("Terminal2", "Skytrain");
        addEdge_2025("Terminal3", "StasiunKA");
        addEdge_2025("Parkir", "Skytrain");
        addEdge_2025("Skytrain", "StasiunKA");
        addEdge_2025("Parkir", "CheckIn");
        addEdge_2025("Skytrain", "Imigrasi");
        addEdge_2025("StasiunKA", "GateKeberangkatan");
        addEdge_2025("CheckIn", "Imigrasi");
        addEdge_2025("Imigrasi", "GateKeberangkatan");
        addEdge_2025("CheckIn", "Bagasi");
        addEdge_2025("GateKeberangkatan", "Bagasi");
        addEdge_2025("Bagasi", "Imigrasi"); // edge ke-15
    }

    private void addEdge_2025(String a, String b) {
        graph_2025.get(a).add(b);
        graph_2025.get(b).add(a);
    }

    private void displayGraph_2025() {

        areaGraph_2025.setText(
                " Terminal1 ------- Terminal2 ------- Terminal3\n" +
                "     |                |                 |\n" +
                "     |                |                 |\n" +
                "   Parkir -------- Skytrain ------- StasiunKA\n" +
                "     |                |                 |\n" +
                "     |                |                 |\n" +
                "  CheckIn ------- Imigrasi ------ GateKeberangkatan\n" +
                "      \\                                 /\n" +
                "       \\                               /\n" +
                "           -------- Bagasi --------"
        );
    }

    private String displayPath_2025() {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < path_2025.size(); i++) {
            sb.append(path_2025.get(i));
            if (i < path_2025.size() - 1) sb.append(" -> ");
        }

        return sb.toString();
    }

    private void BFS_2025() {

        String start = start_2025.getSelectedItem().toString();
        String goal = goal_2025.getSelectedItem().toString();

        visitedNodes_2025.clear();
        path_2025.clear();

        Queue<String> q = new LinkedList<>();
        HashSet<String> visited = new HashSet<>();
        HashMap<String, String> parent = new HashMap<>();

        q.add(start);
        visited.add(start);

        while (!q.isEmpty()) {

            String cur = q.poll();
            visitedNodes_2025.add(cur);

            if (cur.equals(goal)) break;

            for (String next : graph_2025.get(cur)) {

                if (!visited.contains(next)) {
                    visited.add(next);
                    parent.put(next, cur);
                    q.add(next);
                }
            }
        }

        buildPath_2025(goal, parent);
        tampilkanHasil_2025("BFS");
    }

    private void DFS_2025() {

        String start = start_2025.getSelectedItem().toString();
        String goal = goal_2025.getSelectedItem().toString();

        visitedNodes_2025.clear();
        path_2025.clear();

        Stack<String> st = new Stack<>();
        HashSet<String> visited = new HashSet<>();
        HashMap<String, String> parent = new HashMap<>();

        st.push(start);

        while (!st.isEmpty()) {

            String cur = st.pop();

            if (visited.contains(cur)) continue;

            visited.add(cur);
            visitedNodes_2025.add(cur);

            if (cur.equals(goal)) break;

            for (String next : graph_2025.get(cur)) {

                if (!visited.contains(next)) {
                    parent.put(next, cur);
                    st.push(next);
                }
            }
        }

        buildPath_2025(goal, parent);
        tampilkanHasil_2025("DFS");
    }

    private void buildPath_2025(String goal, HashMap<String, String> parent) {

        String step = goal;

        while (step != null) {
            path_2025.add(0, step);
            step = parent.get(step);
        }
    }

    private void tampilkanHasil_2025(String metode) {

        hasil_2025.setText(
                "Metode: " + metode +
                "\n\nJalur:\n" + displayPath_2025() +
                "\n\nNode Dikunjungi:\n" + visitedNodes_2025 +
                "\n\nJumlah Node: " + visitedNodes_2025.size()
        );
    }

    private void resetGraph_2025() {

        visitedNodes_2025.clear();
        path_2025.clear();
        hasil_2025.setText("");
        start_2025.setSelectedIndex(0);
        goal_2025.setSelectedIndex(0);

        displayGraph_2025();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->
                new PetaBandara_2511532025());
    }
}