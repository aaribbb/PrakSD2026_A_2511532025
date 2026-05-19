package pekan7_2511532025;

public class SelectionSort_2511532025 {
	public static void SelectionSort_2511532025 (int[] arr) {
		int n_2025 = arr.length;
		for (int i_2025 = 0; i_2025 < n_2025; i_2025++) {
			int minIndex = i_2025;
			for (int j_2025 = i_2025 + 1; j_2025 < n_2025; j_2025++) {
				if (arr[j_2025] < arr[minIndex]) {
					minIndex = j_2025;
				}
			}
			int temp_2025 = arr[i_2025];
			arr[i_2025] = arr[minIndex];
			arr[minIndex] = temp_2025;
		}
	}
	public static void main (String[] args) {
			int arr[] = { 23, 78, 45, 8, 32, 56, 1 };
			int n_2025 = arr. length;
			System.out.printf ("array yang belum terurut: \n");
			for (int i_2025 = 0; i_2025 < n_2025; i_2025++)
				System.out.print(arr[i_2025] + " ");
			System.out.println("") ;
			SelectionSort_2511532025(arr);
			System.out.printf ("array yang terurut: \n");
			for (int i_2025 = 0; i_2025 < n_2025; i_2025++)
				System.out.print(arr[i_2025] + " ");
			System.out.println("");
	}
}
