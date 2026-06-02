package pekan8_2511532025;

public class QuickSort_2511532025 {
	static void swap_2025(int[] arr_2025, int i_2025, int j_2025) {
		int temp_2025 = arr_2025[i_2025];
		arr_2025[i_2025] = arr_2025[j_2025];
		arr_2025[j_2025] = temp_2025;
	}
	// Metode tambahan untuk mengatur pivot_2025 menggunakan Median-of-Three
	static void medianOfThree_2025(int[] arr_2025, int low_2025, int high_2025) {
		int mid_2025 = low_2025 + (high_2025 - low_2025)/2;
		
		// Urutkan elemen low, mid dan high
		if (arr_2025[low_2025] > arr_2025[mid_2025]) {
			swap_2025(arr_2025, low_2025, mid_2025);
		}
		if (arr_2025[low_2025] > arr_2025[high_2025]) {
			swap_2025(arr_2025, low_2025, high_2025);
		}
		if (arr_2025[mid_2025] > arr_2025[high_2025]) {
			swap_2025(arr_2025, mid_2025, high_2025);
		}
		swap_2025(arr_2025, mid_2025, high_2025);
	}
	static int partition_2025(int[] arr_2025, int low_2025, int high_2025) {
		
		// Panggil fungsi medianOfThree sebelum menentukan pivot_2025
		medianOfThree_2025(arr_2025, low_2025, high_2025);
		
		int pivot_2025 = arr_2025[high_2025]; // Sekarang arr_2025[high] sudah berisi nilai median
		int i_2025 = (low_2025- 1);
		
		for (int j_2025 = low_2025; j_2025 <= high_2025 - 1; j_2025++) {
			// Jika elemen saat ini lebih kecildari atau sama dengan pivot_2025
			if (arr_2025[j_2025] < pivot_2025) {
				// Increment indeks elemen yang lebih kecil
				i_2025++;
				swap_2025(arr_2025, i_2025, j_2025);
			}
		}
		swap_2025(arr_2025, i_2025 + 1, high_2025);
		return (i_2025 + 1);
	}
	static void quicksort_2025(int[] arr_2025, int low_2025, int high_2025) {
		if (low_2025 < high_2025) {
			int pi_2025 = partition_2025(arr_2025, low_2025, high_2025);
			quicksort_2025(arr_2025, low_2025, pi_2025 - 1);
			quicksort_2025(arr_2025, pi_2025 + 1, high_2025);
		}
	}
	public static void printArr_2025(int[] arr_2025) {
		for(int i_2025 = 0; i_2025 < arr_2025.length; i_2025++) {
			System.out.print(arr_2025[i_2025] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] arr_2025 = { 10, 7, 8, 9, 1, 5 };
		int N_2025 = arr_2025.length;
		System.out.print("Data sebelum diurutkan: ");
		printArr_2025(arr_2025);
		
		quicksort_2025(arr_2025, 0, N_2025 - 1);
		
		System.out.print("Data terurut quicksort: ");
		printArr_2025(arr_2025);
	}
}
