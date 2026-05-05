package pekan5_2511532025;

public class TambahSLL_2511532025 {
	public static NodeSLL_2511532025 insertAtFront (NodeSLL_2511532025 head_2025, int value) {
		NodeSLL_2511532025 new_node = new NodeSLL_2511532025(value);
		new_node.next = head_2025;
		return new_node;
	}
	// fungsi menambahkan node di akhir SLL
	public static NodeSLL_2511532025 insertAtEnd(NodeSLL_2511532025 head_2025, int value) {
		// buat sesudah node dengan sebuah nilai
		NodeSLL_2511532025 newNode = new NodeSLL_2511532025(value);
		// jika list kosong maka node jadi head
		if (head_2025 == null) {
			return newNode;
		}
		//simpan head ke variabel sementara
		NodeSLL_2511532025 last = head_2025;
		// telusuri ke kode akhir
		while (last.next != null) {
			last = last.next;
		}
		// ubah pointer
		last.next = newNode;
		return head_2025;
	}
	static NodeSLL_2511532025 GetNode(int data) {
		return new NodeSLL_2511532025(data);
	}
	static NodeSLL_2511532025 insertPos(NodeSLL_2511532025 headNode, int position, int value) {
		NodeSLL_2511532025 head = headNode;
		if (position < 1)
			System.out.print("Invalid position");
		if (position == 1) {
			NodeSLL_2511532025 new_node = new NodeSLL_2511532025(value);
			new_node.next = head;
			return new_node;
		} else {
			while (position -- != 0) {
				if (position == 1) {
					NodeSLL_2511532025 newNode = GetNode(value);
					newNode.next = headNode.next;
					headNode.next = newNode;
					break;
				}
				headNode = headNode.next;
			}
			if (position != 1)
				System.out.print("Posisi di luar jangkauan");
		}
			return head;
		}
		public static void printList (NodeSLL_2511532025 head) {
			NodeSLL_2511532025 curr_2025 = head;
			while (curr_2025.next != null) {
			System.out.print(curr_2025.data + "-->");
			curr_2025 = curr_2025.next;
			}
			if (curr_2025.next == null) {
				System.out.print(curr_2025.data);
		}
			System.out.println();
	}
		public static void main(String[] args) {
			// buat linked list 2->3->4->5->
			NodeSLL_2511532025 head_2025 = new NodeSLL_2511532025(2);
			head_2025.next = new NodeSLL_2511532025(3);
			head_2025.next.next = new NodeSLL_2511532025(5);
			head_2025.next.next.next = new NodeSLL_2511532025(6);
			// cetal list asli
			System.out.print("Senarai berantai awal: ");
			printList(head_2025);
			//tambahkan node baru di depan
			System.out.print("tambah 1 simpul di depan: ");
			int data_2025 = 1;
			head_2025 = insertAtFront(head_2025, data_2025);
			// cetak update list
			printList(head_2025);
			// tambahkan node baru di belakang
			System.out.print("tambah 1 simpul di belakang: ");
			int data2_2025 = 7;
			head_2025 = insertAtEnd(head_2025, data2_2025);
			// cetak update list
			printList(head_2025);
			System.out.print("tambah 1 simpul ke data 4: ");
			int data3_2025 = 4;
			int pos_2025 = 4;
			head_2025 = insertPos(head_2025, pos_2025, data3_2025);
			// cetak update list
			printList(head_2025);
		}
}
