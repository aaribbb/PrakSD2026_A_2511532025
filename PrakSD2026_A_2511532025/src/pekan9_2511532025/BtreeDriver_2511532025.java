package pekan9_2511532025;

public class BtreeDriver_2511532025 {
	public static void main(String[] args) {
		// Membuat Pohon
		BTree_2511532025 tree_2025 = new BTree_2511532025();
		System.out.print("Jumlah simpul awal pohon: ");
		System.out.println(tree_2025.countNodes_2025());
		// Menambahkan simpul data 1
		Node_2511532025 root_2025 = new Node_2511532025(1);
		// Menjadikan simpul 1 sebagai root
		tree_2025.setRoot_2025(root_2025);
		System.out.println("Jumlah simpul jika hanya ada root");
		System.out.println(tree_2025.countNodes_2025());
		Node_2511532025 node2_2025 = new Node_2511532025(2);
		Node_2511532025 node3_2025 = new Node_2511532025(3);
		Node_2511532025 node4_2025 = new Node_2511532025(4);
		Node_2511532025 node5_2025 = new Node_2511532025(5);
		Node_2511532025 node6_2025 = new Node_2511532025(6);
		Node_2511532025 node7_2025 = new Node_2511532025(7);
		Node_2511532025 node8_2025 = new Node_2511532025(8);
		Node_2511532025 node9_2025 = new Node_2511532025(9);
		root_2025.setLeft_2025(node2_2025);
		node2_2025.setLeft_2025(node4_2025);
		node2_2025.setRight_2025(node5_2025);
		node4_2025.setRight_2025(node8_2025);
		root_2025.setRight_2025(node3_2025);
		node3_2025.setLeft_2025(node6_2025);
		node3_2025.setRight_2025(node7_2025);
		node6_2025.setLeft_2025(node9_2025);
		// Set root
		tree_2025.setCurrent_2025(tree_2025.getRoot_2025());
		System.out.println("menampilkan simpul terakhir: ");
		System.out.println(tree_2025.getCurrent_2025().getData_2025());
		System.out.println("Jumlah simpul; setelah simpul 7 ditambahkan");
		System.out.println(tree_2025.countNodes_2025());
		System.out.println("InOrder: ");
		tree_2025.printInorder_2025();
		System.out.println("\nPreorder: ");
		tree_2025.printPostorder_2025();
		System.out.println("\nMenampilkan simpul dalam bentuk pohon");
		tree_2025.print_2025();
	}

}
