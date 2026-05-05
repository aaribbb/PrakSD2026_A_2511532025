package pekan5_2511532025;

public class HapusSLL_2511532025 {
	//fungsi untuk menghapus head
	public static NodeSLL_2511532025 deleteHead_2025(NodeSLL_2511532025 head_2025)
	{
		// jika SLL kosong
		if (head_2025 == null)
			return null;
		// pindahkan head ke node berikutnya
		head_2025 = head_2025.next;
		// return head baru
		return head_2025;
	}
		// fungsi mengapus node terakhir SLL
		public static NodeSLL_2511532025 removeLastNode_2025(NodeSLL_2511532025 head_2025) {
			// jika list kosong, return null
			if (head_2025 == null) {
				return null;
			}
			// jika list satu node, hapus node dan return null
			if (head_2025.next == null) {
				return null;
			}
			// temukan node terakhir ke dua
			NodeSLL_2511532025 secondLast = head_2025;
			while (secondLast.next.next != null) {
				secondLast = secondLast.next;
			}
			// hapus node terakhir
			secondLast.next = null;
			return head_2025;
		}
	public static NodeSLL_2511532025 deleteNode_2025(NodeSLL_2511532025 head_2025, int position) {
		NodeSLL_2511532025 temp_2025 = head_2025;
		NodeSLL_2511532025 prev_2025 = null;
		// jika linked list null
		if (temp_2025 == null)
			return head_2025;
		// kasus 1: head dihapus
		if (position == 1) {
			head_2025 = temp_2025.next;
			return head_2025;
		}
		// kasus 2: menghapus node ditengah
		// telusuri node yang dihapus
		for (int i_2025 = 1; temp_2025 != null && i_2025 < position; i_2025++) {
			prev_2025 = temp_2025;
			temp_2025 = temp_2025.next;
		}
		// jika ditemukan, hapus node
		if (temp_2025 != null) {
			prev_2025.next = temp_2025.next;
		} else {
			System.out.println("Data tidak ada");
		}
		return head_2025;
		}
		
	// fungsi mencetak SLL
	public static void  printList_2025(NodeSLL_2511532025 head_2025) {
		NodeSLL_2511532025 curr_2025 = head_2025;
		while (curr_2025.next != null) {
			System.out.print(curr_2025.data + "-->");
			curr_2025 = curr_2025.next;
		}
		if (curr_2025.next == null) {
			System.out.println(curr_2025.data);
		}
		System.out.println();
		}
	// kelas main
	public static void main(String[] args) {
		// buat SLL 1->2->3->4->5->6->null
		NodeSLL_2511532025 head_2025 = new NodeSLL_2511532025(1);
		head_2025.next = new NodeSLL_2511532025(2);
		head_2025.next.next = new NodeSLL_2511532025(3);
		head_2025.next.next.next = new NodeSLL_2511532025(4);
		head_2025.next.next.next.next = new NodeSLL_2511532025(5);
		head_2025.next.next.next.next.next = new NodeSLL_2511532025(6);
		// cetak list awal 
		System.out.println("list  awal: ");
		printList_2025(head_2025);
		// hapus head
		head_2025 = deleteHead_2025(head_2025);
		System.out.println("Liat setelah head dihapus: ");
		printList_2025(head_2025);
		// hapus node terakhir 
		head_2025 = removeLastNode_2025(head_2025);
		System.out.println("List setelah simpul terkahir di hapus: ");
		printList_2025(head_2025);
		//deleting node at position 2
		int position = 2;
		head_2025 = deleteNode_2025(head_2025, position);
		// print list after deletion 
		System.out.println("List setelah posisi 2 dihapus: ");
		printList_2025(head_2025);
	}

}
