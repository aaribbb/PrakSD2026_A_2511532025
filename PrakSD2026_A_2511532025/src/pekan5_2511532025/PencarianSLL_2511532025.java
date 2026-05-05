package pekan5_2511532025;

public class PencarianSLL_2511532025 {
	static boolean searchKey(NodeSLL_2511532025 head_2025, int key_2025) {
		NodeSLL_2511532025 curr_2025 = head_2025;
		while (curr_2025 != null) {
				if (curr_2025.data == key_2025)
					return true;
				curr_2025 = curr_2025.next;}
		return false;
	}
public static void traversal (NodeSLL_2511532025 head_2025) {
	//mulai dari head
	NodeSLL_2511532025 curr_2025 = head_2025;
	//telusuri sampai pointer null
	while (curr_2025 != null) {
		System.out.print(" " + curr_2025.data);
		curr_2025 = curr_2025.next;
	}
	System.out.println();
}
	public static void main(String[] args) {
		NodeSLL_2511532025 head_2025 = new NodeSLL_2511532025(14);
		head_2025.next = new NodeSLL_2511532025(21);
		head_2025.next.next = new NodeSLL_2511532025(13);
		head_2025.next.next.next = new NodeSLL_2511532025(30);
		head_2025.next.next.next.next = new NodeSLL_2511532025(10);
		System.out.print("Penelusuran SLL : ");
		traversal(head_2025);
		// data yang akan dicari
		int key_2025 = 30;
		System.out.print("cari data " +key_2025+ " = ");
		if (searchKey(head_2025, key_2025))
			System.out.println("ketemu");
		else
			System.out.println("tidak ada");
	}
}
