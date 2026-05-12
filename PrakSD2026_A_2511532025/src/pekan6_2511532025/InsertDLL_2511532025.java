package pekan6_2511532025;

public class InsertDLL_2511532025 {
	// menambahkan kode di awal DLL
	static NodeDLL_2511532025 insertBegin_2025(NodeDLL_2511532025 head_2025, int data_2025) {
		// buat node baru
		NodeDLL_2511532025 new_node_2025 = new NodeDLL_2511532025(data_2025);
		// jadikan pointer nextnya head
		new_node_2025.next_2025 =  head_2025;
		// jadikan pointer prev head ke new_node
		if (head_2025 != null) {
			head_2025.prev_2025 = new_node_2025;
		}
		return new_node_2025;
	}
	// fungsi menambahkan node di akhir
	public static NodeDLL_2511532025 insertEnd_2025(NodeDLL_2511532025 head_2025, int newData_2025) {
		// buat node baru
		NodeDLL_2511532025 newNode_2025 = new NodeDLL_2511532025(newData_2025);
		// jika dll null jadikan head
		if (head_2025 == null) {
			head_2025 = newNode_2025;
		}
		else {
			NodeDLL_2511532025 curr_2025 = head_2025;
			while (curr_2025.next_2025 != null) {
				curr_2025 = curr_2025.next_2025;
			}
			curr_2025.next_2025 = newNode_2025;
			newNode_2025.prev_2025 = curr_2025;
		}
		return head_2025;
	}
	// fungsi menambahkan node di posisi tertentu
	public static NodeDLL_2511532025 insertAtPosition_2025(NodeDLL_2511532025 head_2025, int pos_2025, int new_data_2025) {
		// buat node baru
		NodeDLL_2511532025 new_node_2025 = new NodeDLL_2511532025(new_data_2025);
		if (pos_2025 == 1) {
			new_node_2025.next_2025 = head_2025;
			if (head_2025 != null) {
				head_2025.prev_2025 = new_node_2025;
			}
			head_2025 = new_node_2025;
			return head_2025;
		}
		NodeDLL_2511532025 curr_2025 = head_2025;
		for (int i_2025 = 1; i_2025 < pos_2025 - 1 && curr_2025 != null; ++i_2025) {
			curr_2025 = curr_2025.next_2025;
		}
		if (curr_2025 == null) {
			System.out.println("Posisi tidak ada");
			return head_2025;
		}
		new_node_2025.prev_2025 = curr_2025;
		new_node_2025.next_2025 = curr_2025.next_2025;
		curr_2025.next_2025 = new_node_2025;
		if (new_node_2025.next_2025 != null) {
			new_node_2025.next_2025.prev_2025 = new_node_2025;
		}
		return head_2025;
	}
	public static void printList_2025(NodeDLL_2511532025 head_2025) {
		NodeDLL_2511532025 curr_2025 = head_2025;
		while (curr_2025 != null) {
			System.out.print(curr_2025.data_2025 + " <-> ");
			curr_2025 = curr_2025.next_2025;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// membuat dll 2 <-> 3 <-> 5
		NodeDLL_2511532025 head_2025 = new NodeDLL_2511532025(2);
		head_2025.next_2025 = new NodeDLL_2511532025(3);
		head_2025.next_2025.prev_2025 = head_2025;
		head_2025.next_2025.next_2025 = new NodeDLL_2511532025(5);
		head_2025.next_2025.next_2025.prev_2025 = head_2025.next_2025;
		// cetak dll awal
		System.out.print("DLL awal: ");
		printList_2025(head_2025);
		// tambah 1 di awal
		head_2025 = insertBegin_2025(head_2025, 1);
		System.out.print("simpul 1 ditambah di awal: ");
		printList_2025(head_2025);
		// tambah 6 di akhir
		System.out.print("simpul 6 ditambah di akhir: ");
		int data_2025 = 6;
		head_2025 = insertEnd_2025(head_2025, data_2025);
		printList_2025(head_2025);
		// menambah node 4 di posisi 4
		System.out.print("tambah node 4 di posisi 4: ");
		int data2_2025 = 4;
		int pos_2025 = 4;
		head_2025 = insertAtPosition_2025(head_2025, pos_2025, data2_2025);
		printList_2025(head_2025);
	}

}
