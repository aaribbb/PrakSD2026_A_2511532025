package pekan6_2511532025;

public class PenelusuranDLL_2511532025 {
	// fungsi penelusuran maju
	static void forwardTraversal_2025(NodeDLL_2511532025 head_2025) {
		// memulai penelusuran dari head
		NodeDLL_2511532025 curr_2025 = head_2025;
		// lanjutkan sampai akhir
		while (curr_2025 != null ) {
			// print data
			System.out.print(curr_2025.data_2025 + " <-> ");
			// pindah ke node berikutnya
			curr_2025 = curr_2025.next_2025;
		}
		// print spasi
		System.out.println();
	}
	// fungsi penelusuran mundur
	static void backwardTraversal_2025(NodeDLL_2511532025 tail_2025) {
		// mulai dari akhir 
		NodeDLL_2511532025 curr_2025 = tail_2025;
		// lanjut sampai head
		while (curr_2025 != null) {
			// cetak data
			System.out.print(curr_2025.data_2025 + " <-> ");
			// pindah ke node sebelumnya
			curr_2025 = curr_2025.prev_2025;
		}
		// cetak spasi
		System.out.println();
	}
	public static void main(String[] args) {
		// cetak DLL
		NodeDLL_2511532025 head_2025 = new NodeDLL_2511532025(1);
		NodeDLL_2511532025 second_2025 = new NodeDLL_2511532025(2);
		NodeDLL_2511532025 third_2025 = new NodeDLL_2511532025(3);
		
		head_2025.next_2025 = second_2025;
		second_2025.prev_2025 = head_2025;
		second_2025.next_2025 = third_2025;
		third_2025.prev_2025 = second_2025;
		
		System.out.println("Penelusuran maju: ");
		forwardTraversal_2025(head_2025);
		
		System.out.println("Penelusuran mundur: ");
		backwardTraversal_2025(third_2025);
	}

}
