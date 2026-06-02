package pekan8_2511532025;

public class MergeSort_2511532025 {
	void merge_2025(int arr_2025[], int l_2025, int m_2025, int r_2025) {
		// Find sizes of two subarrays to be merged
		int n1_2025 = m_2025 - l_2025 + 1;
		int n2_2025 = r_2025 - m_2025;
		/* Create temp arrays */
		int L_2025[] = new int[n1_2025];
		int R_2025[] = new int[n2_2025];
		/* Copy data to temp arrays */
		for (int i_2025 = 0; i_2025 < n1_2025; ++i_2025)
			L_2025[i_2025]= arr_2025[l_2025 + i_2025];
		for (int j_2025 = 0; j_2025 < n2_2025; ++j_2025)
			R_2025[j_2025] = arr_2025[m_2025 + 1 + j_2025];
		int i_2025 = 0, j_2025 = 0;
		// Initial index of merged subarray array
		int k_2025 = l_2025;
		while (i_2025 < n1_2025 && j_2025 < n2_2025) {
			if (L_2025[i_2025] <= R_2025[j_2025]) {
				arr_2025[k_2025] = L_2025[i_2025];
				i_2025++;
			} else {
				arr_2025[k_2025] = R_2025[j_2025];
				j_2025++;			
		}
		k_2025++;
	}
	/* Copy remaining elements of L[] if any */
	while (i_2025 < n1_2025) {
		arr_2025[k_2025] = L_2025[i_2025];
		i_2025++;
		k_2025++;
	}
	/* Copy remaining elements of R[] any */
	while (j_2025 < n2_2025) {
		arr_2025[k_2025] = R_2025[j_2025];
		j_2025++;
		k_2025++;
	}
}
	void sort_2025(int arr_2025[], int l_2025, int r_2025) {
		if (l_2025 < r_2025) {
			// Find the middle point
			int m_2025 = (l_2025 + r_2025)/2;
			// Sort first and second halves
			sort_2025 (arr_2025, l_2025, m_2025);
			sort_2025 (arr_2025, m_2025 + 1, r_2025);
			merge_2025(arr_2025, l_2025, m_2025, r_2025);
		}
	}
		static void printArray_2025(int arr_2025[]) {
			int n_2025 = arr_2025.length;
			for (int i_2025 = 0; i_2025 < n_2025; ++i_2025)
				System.out.print(arr_2025[i_2025] + " ");
				System.out.println();
	}
	public static void main(String[] args) {
		int arr_2025[] = { 12, 11, 13, 5, 6, 7 };
		System.out.println("Sebelum terurut");
		printArray_2025(arr_2025);
		MergeSort_2511532025 ob_2025 = new MergeSort_2511532025();
		ob_2025.sort_2025(arr_2025, 0, arr_2025.length - 1);
		System.out.println("\nSesudah Terurut menggunakan merge sort");
		printArray_2025(arr_2025);
	}

}
