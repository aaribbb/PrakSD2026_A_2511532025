package pekan7_2511532025;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class MahasiswaGUI_2511532025 extends JFrame {

	private static final long serialVersionUID = 1L;
	
	 // arraylist mahasiswa
    private ArrayList<Mahasiswa_2511532025> dataMhs_2025;

    // komponen GUI
    private JTextField txtNama_2025;
    private JTextField txtNim_2025;
    private JTextField txtProdi_2025;

    private JButton btnTambah_2025;
    private JButton btnSorting_2025;
    private JButton btnReset_2025;

    private JComboBox<String> comboSorting_2025;

    private JTable table_2025;
    private DefaultTableModel model_2025;

    private JTextArea stepArea_2025;
    
    // constructor
    public MahasiswaGUI_2511532025() {

        setTitle("Sorting Nama Mahasiswa GUI");
        setSize(1000, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        dataMhs_2025 = new ArrayList<>();
        
        // panel input
        JPanel inputPanel_2025 = new JPanel(new FlowLayout());

        txtNama_2025 = new JTextField(10);
        txtNim_2025 = new JTextField(10);
        txtProdi_2025 = new JTextField(10);

        btnTambah_2025 = new JButton("Tambah Data");

        inputPanel_2025.add(new JLabel("Nama"));
        inputPanel_2025.add(txtNama_2025);
        
        inputPanel_2025.add(new JLabel("NIM"));
        inputPanel_2025.add(txtNim_2025);

        inputPanel_2025.add(new JLabel("Prodi"));
        inputPanel_2025.add(txtProdi_2025);

        inputPanel_2025.add(btnTambah_2025);
        
        // tabel mahasiswa
        model_2025 = new DefaultTableModel();

        model_2025.addColumn("Nama Mahasiswa");
        model_2025.addColumn("NIM");
        model_2025.addColumn("Program Studi");

        table_2025 = new JTable(model_2025);

        JScrollPane scrollTable_2025 = new JScrollPane(table_2025);

        // panel kontrol
        JPanel controlPanel_2025 = new JPanel();

        comboSorting_2025 = new JComboBox<>();

        comboSorting_2025.addItem("Insertion Sort");
        comboSorting_2025.addItem("Selection Sort");
        comboSorting_2025.addItem("Bubble Sort");

        btnSorting_2025 = new JButton("Mulai Sorting");
        btnReset_2025 = new JButton("Reset");

        controlPanel_2025.add(new JLabel("Pilih Sorting"));
        controlPanel_2025.add(comboSorting_2025);
        controlPanel_2025.add(btnSorting_2025);
        controlPanel_2025.add(btnReset_2025);
        
        // textarea langkah sorting
        stepArea_2025 = new JTextArea(15, 40);
        stepArea_2025.setEditable(false);
        stepArea_2025.setFont(
                new Font("Monospaced", Font.PLAIN, 14));

        JScrollPane scrollStep_2025 = new JScrollPane(stepArea_2025);
         
        // panel kanan
        JPanel panelKanan_2025 = new JPanel();
        panelKanan_2025.setLayout(new BorderLayout());

        JLabel lblLangkah_2025 = new JLabel("Visualisasi Sorting");

        lblLangkah_2025.setHorizontalAlignment(SwingConstants.CENTER);

        lblLangkah_2025.setFont(new Font("Arial", Font.BOLD, 16));
        
        panelKanan_2025.add(lblLangkah_2025, BorderLayout.NORTH);

        panelKanan_2025.add(scrollStep_2025,BorderLayout.CENTER);

        // tambahkan ke frame
        add(inputPanel_2025, BorderLayout.NORTH);
        add(scrollTable_2025, BorderLayout.CENTER);
        add(controlPanel_2025, BorderLayout.SOUTH);
        add(panelKanan_2025, BorderLayout.EAST);

        // event tambah data
        btnTambah_2025.addActionListener(e -> tambahData_2025());

        // event sorting
        btnSorting_2025.addActionListener(e -> mulaiSorting_2025());

        // event reset
        btnReset_2025.addActionListener(e -> resetData_2025());
    }
    
    // method tambah data
    private void tambahData_2025() {
        String nama_2025 = txtNama_2025.getText().trim();
        String nim_2025 = txtNim_2025.getText().trim();
        String prodi_2025 = txtProdi_2025.getText().trim();

        if (nama_2025.isEmpty() || nim_2025.isEmpty() || prodi_2025.isEmpty()) {
            JOptionPane.showMessageDialog(this,"Data tidak boleh kosong!");
            return;
        }
        
        Mahasiswa_2511532025 mhs_2025 = new Mahasiswa_2511532025(nama_2025, nim_2025, prodi_2025);
        dataMhs_2025.add(mhs_2025);
        model_2025.addRow(new Object[]{nama_2025, nim_2025, prodi_2025});
        txtNama_2025.setText("");
        txtNim_2025.setText("");
        txtProdi_2025.setText("");
    }
    // method reset
    private void resetData_2025() {
        dataMhs_2025.clear();
        model_2025.setRowCount(0);
        stepArea_2025.setText("");
    }
    // tampilkan nama
    private String tampilNama_2025() {
        String hasil_2025 = "[";
        for (int i_2025 = 0; i_2025 < dataMhs_2025.size(); i_2025++) {
            hasil_2025 += dataMhs_2025.get(i_2025).getNama_2025();
            if (i_2025 != dataMhs_2025.size() - 1) {
                hasil_2025 += ", ";
            }
        }
        hasil_2025 += "]";
        return hasil_2025;
    }
    // method sorting
    private void mulaiSorting_2025() {
        if (dataMhs_2025.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Data mahasiswa kosong!");
            return;
        }
        stepArea_2025.setText("");
        String pilihan_2025 = comboSorting_2025.getSelectedItem().toString();
        if (pilihan_2025.equals("Insertion Sort")) {
            stepArea_2025.append("=== INSERTION SORT ===\n");
            insertionSort_2025();
                } else if (pilihan_2025.equals("Selection Sort")) {
                    stepArea_2025.append( "=== SELECTION SORT ===\n");
                    selectionSort_2025();
                } else {
                	stepArea_2025.append("=== BUBBLE SORT ===\n");
                	bubbleSort_2025();
                        }
        tampilTable_2025();
                    }
    // tampil ulang table
    private void tampilTable_2025() {
    	model_2025.setRowCount(0);
    	for (Mahasiswa_2511532025 mhs_2025 : dataMhs_2025) {
    		model_2025.addRow(new Object[]{mhs_2025.getNama_2025(),mhs_2025.getNim_2025(),mhs_2025.getProdi_2025()});
    		}
    	}
    // insertion sort
    private void insertionSort_2025() {
    	for (int i_2025 = 1; i_2025 < dataMhs_2025.size(); i_2025++) {
    		Mahasiswa_2511532025 key_2025 = dataMhs_2025.get(i_2025);
    		int j_2025 = i_2025 - 1;
            while (j_2025 >= 0 && dataMhs_2025.get(j_2025).getNama_2025().compareToIgnoreCase(key_2025.getNama_2025()) > 0) {
            	dataMhs_2025.set(j_2025 + 1,dataMhs_2025.get(j_2025));
            	j_2025--;
            	}
            dataMhs_2025.set(j_2025 + 1, key_2025);
            stepArea_2025.append("Langkah " + i_2025 + " : " + tampilNama_2025() + "\n");                         
            }
    	}
    // selection sort
    private void selectionSort_2025() {
    	for (int i_2025 = 0; i_2025 < dataMhs_2025.size() - 1;i_2025++) {
    		int minIndex_2025 = i_2025; 
    		for (int j_2025 = i_2025 + 1; j_2025 < dataMhs_2025.size(); j_2025++) {
    			if (dataMhs_2025.get(j_2025).getNama_2025().compareToIgnoreCase(dataMhs_2025.get(minIndex_2025).getNama_2025()) < 0) {
    				minIndex_2025 = j_2025;
    				}
    			}
    		Mahasiswa_2511532025 temp_2025 = dataMhs_2025.get(i_2025);
    		dataMhs_2025.set(i_2025, dataMhs_2025.get(minIndex_2025));
    		dataMhs_2025.set(minIndex_2025, temp_2025);
    		stepArea_2025.append("Pass " + (i_2025 + 1) + " : " + tampilNama_2025() + "\n");
    		}
    	}
    // bubble sort
    private void bubbleSort_2025() {
    	for (int i_2025 = 0; i_2025 < dataMhs_2025.size() - 1; i_2025++) {
    		for (int j_2025 = 0;j_2025 < dataMhs_2025.size() - i_2025 - 1; j_2025++) {
    			if (dataMhs_2025.get(j_2025).getNama_2025().compareToIgnoreCase(dataMhs_2025.get(j_2025 + 1).getNama_2025()) > 0) {
    				Mahasiswa_2511532025 temp_2025 = dataMhs_2025.get(j_2025);
    				dataMhs_2025.set(j_2025,dataMhs_2025.get(j_2025 + 1));
    				dataMhs_2025.set(j_2025 + 1, temp_2025);
    				}
    			}
    		stepArea_2025.append("Pass " + (i_2025 + 1) + " : " + tampilNama_2025() + "\n");
    		}
    	}
    // main
    public static void main(String[] args) {
    	SwingUtilities.invokeLater(() -> {
    		MahasiswaGUI_2511532025 gui_2025 = new MahasiswaGUI_2511532025 ();
    		gui_2025.setVisible(true);
    		});
    	}
       }          
                    
 