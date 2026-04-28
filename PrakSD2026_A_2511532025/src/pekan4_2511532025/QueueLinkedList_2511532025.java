package pekan4_2511532025;

import java.util.Queue;
import java.util.LinkedList;

public class QueueLinkedList_2511532025 {

	public static void main(String[] args) {
		Queue<Integer> q_2025 = new LinkedList<>();
		//tambah elemen {0, 1, 2, 3, 4, 5} ke antrian
		for (int i_2025 = 0; i_2025 < 6; i_2025++)
			q_2025.add(i_2025);
		//menampilkan isi antrian.
		System.out.println("Elemen Antrian " + q_2025);
		//untuk menghapus kepala antrian.
		int hapus_2025 = q_2025.remove();
		System.out.println("Hapus elemen = " + hapus_2025);
		System.out.println(q_2025);
		//untuk melihat antrian terdepan
		int depan_2025 = q_2025.peek();
		System.out.println("Kepala antrian = " + depan_2025);
		
		int banyak_2025 = q_2025.size();
		System.out.println("Size antrian = " + banyak_2025);	
	}

}
