package pekan7_2511532025;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
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
import javax.swing.border.EmptyBorder;

public class InsertionSortGUI_2511532025 extends JFrame {

	private static final long serialVersionUID = 1L;
	private int[] array_2025;
	private JLabel[] labelArray_2025;
	private JButton stepButton_2025, resetButton_2025, setButton_2025;
	private JTextField inputField_2025; 
	private JPanel panelArray_2025;
	private JTextArea stepArea_2025;
	
	private int i_2025 = 1, j_2025;
	private boolean sorting_2025 = false;
	private int stepCount_2025 = 1;

	/**
	 * Create the frame.
	 */
	public InsertionSortGUI_2511532025() {
		setTitle("Insertion Sort Langkah per Langkah");
		setSize(750, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		// Panel input
		JPanel inputPanel_2025 = new JPanel(new FlowLayout());
		inputField_2025 = new JTextField(30);
		setButton_2025 = new JButton("Set Array");
		inputPanel_2025.add(new JLabel("Masukkan angka (pisahkan dengan koma):"));
		inputPanel_2025.add(inputField_2025);
		inputPanel_2025.add(setButton_2025);
		
		// Panel array visual
		panelArray_2025 = new JPanel();
		panelArray_2025 .setLayout(new FlowLayout());
		
		// Panel kontrol
		JPanel controlPanel_2025  = new JPanel();
		stepButton_2025 = new JButton("Langkah Selanjutnya");
		resetButton_2025  = new JButton("Reset");
		stepButton_2025 .setEnabled(false);
		controlPanel_2025 .add(stepButton_2025 );
		controlPanel_2025 .add(resetButton_2025 );
		
		// Area teks untuk log langkah-langkah
		stepArea_2025  = new JTextArea(8, 60);
		stepArea_2025 .setEditable(false);
		stepArea_2025 .setFont(new Font("Monospaced", Font.PLAIN, 14));
		JScrollPane scrollPane_2025  = new JScrollPane(stepArea_2025 );
		
		// Tambahkan panel ke frame
		add(inputPanel_2025 , BorderLayout.NORTH);
		add(panelArray_2025 , BorderLayout.CENTER);
		add(controlPanel_2025 , BorderLayout.SOUTH);
		add(scrollPane_2025 , BorderLayout.EAST);
		
		// Event Set Array
		setButton_2025.addActionListener(e -> setArrayFromInput_2025());
		
		// Event Langkah Selanjutnya
		stepButton_2025.addActionListener(e -> performStep_2025());
		
		// Event Reset
		resetButton_2025.addActionListener(e -> reset_2025());

	}
	
	private void setArrayFromInput_2025() {
		String text_2025 = inputField_2025.getText().trim();
		if (text_2025.isEmpty()) return;
		String[] parts_2025 = text_2025.split(",");
		array_2025 = new int[parts_2025.length];
		try {
			for(int k_2025 = 0; k_2025 < parts_2025.length; k_2025++) {
				array_2025[k_2025] = Integer.parseInt(parts_2025[k_2025].trim());
			}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(this, "Masukkan hanya angka yang dipisahkan " + "dengan koma!", "Error", JOptionPane.ERROR_MESSAGE);
				return;
			}
		i_2025 = 1;
		stepCount_2025 = 1;
		sorting_2025 = true;
		stepButton_2025.setEnabled(true);
		stepArea_2025.setText("");
		panelArray_2025.removeAll();
		labelArray_2025 = new JLabel[array_2025.length];
		for (int k_2025 = 0; k_2025 < array_2025.length; k_2025++) {
			labelArray_2025[k_2025] = new JLabel(String.valueOf(array_2025[k_2025]));
			labelArray_2025[k_2025].setFont (new Font ("Arial", Font.BOLD, 24));
			labelArray_2025[k_2025].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			labelArray_2025[k_2025].setPreferredSize (new Dimension(50, 50));
			labelArray_2025[k_2025].setHorizontalAlignment(SwingConstants.CENTER);
			panelArray_2025.add (labelArray_2025[k_2025]);
		}
		panelArray_2025.revalidate();
		panelArray_2025.repaint();
		}
		private void performStep_2025() {
			if (i_2025 < array_2025.length && sorting_2025) {
				int key_2025 = array_2025[i_2025];
				j_2025 = i_2025 - 1;

				StringBuilder stepLog = new StringBuilder();
				stepLog.append("Langkah ").append(stepCount_2025).append(": Memasukkan ").append(key_2025).append("\n");

				while (j_2025 >= 0 && array_2025[j_2025] > key_2025) {
					array_2025[j_2025 + 1] = array_2025[j_2025];
					j_2025--;
	        }
			array_2025[j_2025 + 1] = key_2025;

	        updateLabels_2025();
	        stepLog.append("Hasil: ").append(arrayToString_2025(array_2025)).append("\n\n");
	        stepArea_2025.append(stepLog.toString());

	        i_2025++;
	        stepCount_2025++;

	        if (i_2025 == array_2025.length) {
	        	sorting_2025 = false;
	        	stepButton_2025.setEnabled(false);
	        	JOptionPane.showMessageDialog(this,"Sorting selesai!");
	        }
	    }
	}
		private void updateLabels_2025() {
			for (int k_2025 = 0; k_2025 < array_2025.length; k_2025++) {
				labelArray_2025[k_2025].setText(String.valueOf(array_2025[k_2025]));
			}
		}
		private void reset_2025() {
			inputField_2025.setText("");
			panelArray_2025.removeAll();
			panelArray_2025.revalidate();
			panelArray_2025.repaint();
			stepArea_2025.setText("");
			stepButton_2025.setEnabled(false);
			sorting_2025 = false;
			i_2025 = 1;
			stepCount_2025 = 1;
		}
		private String arrayToString_2025(int[] arr) {
			StringBuilder sb_2025 = new StringBuilder();
			for (int k_2025 = 0; k_2025 < arr.length; k_2025++) {
				sb_2025.append(arr[k_2025]);
				if (k_2025 < arr.length - 1) sb_2025.append(", ");   
			}
			return sb_2025.toString();
		}
		public static void main(String[] args) {
			SwingUtilities.invokeLater(() -> {
				InsertionSortGUI_2511532025 gui = new InsertionSortGUI_2511532025();
				gui.setVisible(true);
	    });
	}
}
