package pekan8_2511532025;

public class ShellSort_2511532025 {
	public static void ShellSort_2025(int[] A_2025) {
		int n_2025 = A_2025.length;
		int gap_2025 = n_2025/2;
		while (gap_2025 > 0) {
			for (int i_2025 = gap_2025; i_2025 < n_2025; i_2025++) {
				int temp_2025 = A_2025[i_2025];
				int j_2025 = i_2025;
				while (j_2025 >= gap_2025 && A_2025[j_2025 - gap_2025] > temp_2025) {
				    A_2025[j_2025] = A_2025[j_2025 - gap_2025];
				    j_2025 = j_2025 - gap_2025;
				}
				A_2025[j_2025] = temp_2025;
			}
			gap_2025 = gap_2025/2;
		}
	}

	public static void main(String[] args) {
		int[] data_2025 = {3, 10, 4, 6, 8, 9, 7, 2, 1, 5};
		System.out.print("Sebelum: ");
		printArray_2025(data_2025);
		
		ShellSort_2025(data_2025);
		
		System.out.print("Sesudah (Shell Sort): ");
		printArray_2025(data_2025);
	}
	public static void printArray_2025(int[] arr_2025) {
		for (int i_2025 : arr_2025) System.out.print(i_2025 + " ");
				System.out.println();
	}
}
