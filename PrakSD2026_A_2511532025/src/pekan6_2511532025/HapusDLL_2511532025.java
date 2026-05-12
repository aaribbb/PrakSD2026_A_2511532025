package pekan6_2511532025;

public class HapusDLL_2511532025 {
	// fungsi menghapus node awal
	public static NodeDLL_2511532025 delHead_2025(NodeDLL_2511532025 head_2025) {
		if (head_2025 == null) {
			return null;
		}
		NodeDLL_2511532025 temp_2025 = head_2025;
		head_2025 = head_2025.next_2025;
		if (head_2025 != null) {
			head_2025.prev_2025 = null;
		}
		return head_2025;
	}
	// fungsi menghapus diakhir
	public static NodeDLL_2511532025 delLast_2025(NodeDLL_2511532025 head_2025) {
		if (head_2025 == null) {
			return null;
		}
		NodeDLL_2511532025 curr_2025 = head_2025;
		while (curr_2025.next_2025 != null) {
			curr_2025 = curr_2025.next_2025;
		}
		//update pointer previous node
		if (curr_2025.prev_2025 != null) {
			curr_2025.prev_2025.next_2025 = null;
		}
		return head_2025;
	}
	// fungsi menghapus node posisi tertentu
	public static NodeDLL_2511532025 delPos_2025(NodeDLL_2511532025 head_2025, int pos_2025) {
		// jika DLL kosong
		if (head_2025 == null) {
			return head_2025;
		}
		NodeDLL_2511532025 curr_2025 = head_2025;
		// telusuri sampai ke node yang akan dihapus
		for (int i_2025 = 1; curr_2025 != null && i_2025 < pos_2025; ++i_2025) {
			curr_2025 = curr_2025.next_2025;
		}
			// jika posisi tidak ditemukan 
			if (curr_2025 == null) {
				return head_2025;
			}
			// update pointer
			if (curr_2025.prev_2025 != null) {
				curr_2025.prev_2025.next_2025 = curr_2025.next_2025;
			}
			if (curr_2025.next_2025 != null) {
				curr_2025.next_2025.prev_2025 = curr_2025.prev_2025;
			}
			// jika yang dihapus head
			if (head_2025 == curr_2025) {
				head_2025 = curr_2025.next_2025;
			}
			return head_2025;
		}
		// fungsi mencetak DLL
		public static void printList_2025(NodeDLL_2511532025 head_2025) {
			NodeDLL_2511532025 curr_2025 = head_2025;
			while (curr_2025 != null) {
				System.out.print(curr_2025.data_2025 + " <-> ");
				curr_2025 = curr_2025.next_2025;
			}
			System.out.println();
		}
	public static void main(String[] args) {
		// buat sebuah DLL
		NodeDLL_2511532025 head_2025 = new NodeDLL_2511532025(1);
		head_2025.next_2025 = new NodeDLL_2511532025(2);
		head_2025.next_2025.prev_2025 = head_2025;
		head_2025.next_2025.next_2025 = new NodeDLL_2511532025(3);
		head_2025.next_2025.next_2025.prev_2025 = head_2025.next_2025;
		head_2025.next_2025.next_2025.next_2025 = new NodeDLL_2511532025(4);
		head_2025.next_2025.next_2025.next_2025.prev_2025 = head_2025.next_2025.next_2025;
		head_2025.next_2025.next_2025.next_2025.next_2025 = new NodeDLL_2511532025(5);
		head_2025.next_2025.next_2025.next_2025.next_2025.prev_2025 = head_2025.next_2025.next_2025.next_2025;
		
		System.out.print("DLL awal: ");
		printList_2025(head_2025);
		
		System.out.print("Setelah head dihapus: ");
		head_2025 = delHead_2025(head_2025);
		printList_2025(head_2025);
		
		System.out.print("Setelah node terakhir dihapus: ");
		head_2025 = delLast_2025(head_2025);
		printList_2025(head_2025);
		
		System.out.print("menghapus node ke 2: ");
		head_2025 = delPos_2025(head_2025, 2);
		printList_2025(head_2025);
	}

}
