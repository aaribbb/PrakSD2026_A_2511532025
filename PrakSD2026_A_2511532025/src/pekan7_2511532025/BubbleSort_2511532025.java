package pekan7_2511532025;

public class BubbleSort_2511532025 {
	public static void bubleSort_2025(int[] arr_2025) {
		int n_2025 = arr_2025.length;
		for(int i_2025 = 0; i_2025 < n_2025; i_2025++) {
			for (int j_2025 = 0; j_2025 < n_2025 - i_2025 - 1; j_2025++) {
				if (arr_2025[j_2025] > arr_2025[j_2025 + 1]) {
					int temp_2025 = arr_2025[j_2025];
						arr_2025[j_2025] = arr_2025[j_2025 + 1];
						arr_2025[j_2025 + 1] = temp_2025;
						// System.out.println("data: " +arr[j_2025]+" "+arr[j_2025+1]);
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr_2025[] = { 23, 78, 45, 8, 32, 56, 1 };
		int n_2025 = arr_2025.length;
		System.out.print ("array yang belum terurut:");
		for (int i_2025 = 0; i_2025 < n_2025; i_2025++)
			System.out.print (arr_2025[i_2025] + " ");
		System.out.println("");
		bubleSort_2025(arr_2025);
		System.out.print ("array yang terurut menggunakan BubleSort:");
		for (int i_2025 = 0; i_2025 < n_2025; i_2025++)
			System.out.print (arr_2025[i_2025] + " ");
		System.out.println("");
	}
}
