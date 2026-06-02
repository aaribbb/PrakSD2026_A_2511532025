package pekan8_2511532025;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import java.util.LinkedList;
import java.util.Queue;

public class MergeSortGUI_2511532025 extends JFrame {

	private static final long serialVersionUID = 1L;
	private int[] array_2025;
	private JLabel[] labelArray_2025;
	private JButton stepButton_2025, resetButton_2025, setButton_2025;
	private JTextField inputField_2025;
	private JPanel panelArray_2025;
	private JTextArea stepArea_2025;

	private Queue<int[]> mergeQueue_2025 = new LinkedList<>();
	private int stepCount_2025 = 1;
	private boolean isMerging_2025 = false;
	private boolean copying_2025 = false;

	private int[] temp_2025;
	private int left_2025, mid_2025, right_2025;
	private int i_2025, j_2025, k_2025;

	public MergeSortGUI_2511532025() {
		setTitle("Merge Sort Langkah per Langkah");
		setSize(750, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());

		// panel input
		JPanel inputPanel_2025 = new JPanel(new FlowLayout());
		inputField_2025 = new JTextField(30);
		setButton_2025 = new JButton("Set Array");
		inputPanel_2025.add(new JLabel("Masukan angka (pisahkan dengan koma)"));
		inputPanel_2025.add(inputField_2025);
		inputPanel_2025.add(setButton_2025);

		// panel array visual
		panelArray_2025 = new JPanel();
		panelArray_2025.setLayout(new FlowLayout());

		// panel kontrol
		JPanel controlPanel_2025 = new JPanel();
		stepButton_2025 = new JButton("Langkah selanjutnya");
		resetButton_2025 = new JButton("Reset");
		controlPanel_2025.add(stepButton_2025);
		controlPanel_2025.add(resetButton_2025);

		// area text untuk log langkah langkah
		stepArea_2025 = new JTextArea(8, 60);
		stepArea_2025.setEditable(false);
		stepArea_2025.setFont(new Font("Monospaced", Font.PLAIN, 14));
		JScrollPane scrollPane_2025 = new JScrollPane(stepArea_2025);

		// tambahkan panel ke frame
		add(inputPanel_2025, BorderLayout.NORTH);
		add(panelArray_2025, BorderLayout.CENTER);
		add(controlPanel_2025, BorderLayout.SOUTH);
		add(scrollPane_2025, BorderLayout.EAST);

		// event set array
		setButton_2025.addActionListener(e -> setArrayFromInput_2025());

		// event selanjutnya
		stepButton_2025.addActionListener(e -> performStep_2025());

		// event reset
		resetButton_2025.addActionListener(e -> reset_2025());
	}

	private void setArrayFromInput_2025() {
		String text_2025 = inputField_2025.getText().trim();
		if (text_2025.isEmpty()) return;
		String[] parts_2025 = text_2025.split(",");
		array_2025 = new int[parts_2025.length];
		try {
			for (int k = 0; k < parts_2025.length; k++) {
				array_2025[k] = Integer.parseInt(parts_2025[k].trim());
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this, "Masukkan hanya angka dengan koma!",
					"Error", JOptionPane.ERROR_MESSAGE);
			return;
		}

		labelArray_2025 = new JLabel[array_2025.length];
		panelArray_2025.removeAll();
		for (int k = 0; k < array_2025.length; k++) {
			labelArray_2025[k] = new JLabel(String.valueOf(array_2025[k]));
			labelArray_2025[k].setFont(new Font("Arial", Font.BOLD, 24));
			labelArray_2025[k].setOpaque(true);
			labelArray_2025[k].setBackground(Color.WHITE);
			labelArray_2025[k].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			labelArray_2025[k].setPreferredSize(new Dimension(50, 50));
			labelArray_2025[k].setHorizontalAlignment(SwingConstants.CENTER);
			panelArray_2025.add(labelArray_2025[k]);
		}

		mergeQueue_2025.clear();
		generateMergeSteps_2025(0, array_2025.length - 1);
		stepButton_2025.setEnabled(true);
		stepArea_2025.setText("");
		stepCount_2025 = 1;
		isMerging_2025 = false;

		panelArray_2025.revalidate();
		panelArray_2025.repaint();
	}

	private void generateMergeSteps_2025(int left, int right) {
		if (left >= right) return;
		int mid = (left + right) / 2;
		generateMergeSteps_2025(left, mid);
		generateMergeSteps_2025(mid + 1, right);
		mergeQueue_2025.add(new int[]{left, mid, right});
	}

	private void performStep_2025() {
		resetHighlights_2025();

		if (!isMerging_2025 && !mergeQueue_2025.isEmpty()) {
			int[] range_2025 = mergeQueue_2025.poll();
			left_2025 = range_2025[0];
			mid_2025 = range_2025[1];
			right_2025 = range_2025[2];
			temp_2025 = new int[right_2025 - left_2025 + 1];
			i_2025 = left_2025;
			j_2025 = mid_2025 + 1;
			k_2025 = 0;
			copying_2025 = false;
			isMerging_2025 = true;
			stepArea_2025.append("Langkah " + stepCount_2025++ +
					": Mulai merge dari " + left_2025 + " ke " + right_2025 + "\n");
			return;
		}

		if (isMerging_2025 && !copying_2025) {
			if (i_2025 <= mid_2025 && j_2025 <= right_2025) {
				labelArray_2025[i_2025].setBackground(Color.CYAN);
				labelArray_2025[j_2025].setBackground(Color.CYAN);
				if (array_2025[i_2025] <= array_2025[j_2025]) {
					temp_2025[k_2025++] = array_2025[i_2025++];
				} else {
					temp_2025[k_2025++] = array_2025[j_2025++];
				}
				stepArea_2025.append("Langkah " + stepCount_2025++ + ": Bandingkan dan salin elemen\n");
				return;
			} else if (i_2025 <= mid_2025) {
				temp_2025[k_2025++] = array_2025[i_2025++];
				stepArea_2025.append("Langkah " + stepCount_2025++ + ": Salin sisa kiri\n");
				return;
			} else if (j_2025 <= right_2025) {
				temp_2025[k_2025++] = array_2025[j_2025++];
				stepArea_2025.append("Langkah " + stepCount_2025++ + ": Salin sisa kanan\n");
				return;
			} else {
				copying_2025 = true;
				k_2025 = 0;
				return;
			}
		}

		if (copying_2025 && k_2025 < temp_2025.length) {
			array_2025[left_2025 + k_2025] = temp_2025[k_2025];
			labelArray_2025[left_2025 + k_2025].setText(String.valueOf(temp_2025[k_2025]));
			labelArray_2025[left_2025 + k_2025].setBackground(Color.GREEN);
			k_2025++;
			stepArea_2025.append("Langkah " + stepCount_2025++ + ": Tempelkan ke array utama\n");
			return;
		}

		if (copying_2025 && k_2025 == temp_2025.length) {
			isMerging_2025 = false;
			copying_2025 = false;
		}

		if (mergeQueue_2025.isEmpty() && !isMerging_2025) {
			stepArea_2025.append("Selesai.\n");
			stepButton_2025.setEnabled(false);
			JOptionPane.showMessageDialog(this, "Merge Sort selesai!");
		}
	}

	private void resetHighlights_2025() {
		if (labelArray_2025 == null) return;
		for (JLabel label : labelArray_2025) {
			label.setBackground(Color.WHITE);
		}
	}

	private void reset_2025() {
		inputField_2025.setText("");
		panelArray_2025.removeAll();
		panelArray_2025.revalidate();
		panelArray_2025.repaint();
		stepArea_2025.setText("");
		stepButton_2025.setEnabled(false);
		mergeQueue_2025.clear();
		isMerging_2025 = false;
		stepCount_2025 = 1;
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			MergeSortGUI_2511532025 gui = new MergeSortGUI_2511532025();
			gui.setVisible(true);
		});
	}
}