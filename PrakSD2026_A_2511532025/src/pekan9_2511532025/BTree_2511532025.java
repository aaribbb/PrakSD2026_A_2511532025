package pekan9_2511532025;

public class BTree_2511532025 {
	private Node_2511532025 root_2025;
	private Node_2511532025 currentNode_2025;
	public BTree_2511532025() {
		root_2025 = null;
	}
	public boolean search(int data_2025) {
		return search_2025(root_2025, data_2025);
	}
	private boolean search_2025(Node_2511532025 node_2025, int data_2025) {
		if (node_2025.getData_2025() == data_2025)
			return true;
		if (node_2025.getLeft_2025() != null)
			if (search_2025(node_2025.getLeft_2025(), data_2025))
				return true;
		if (node_2025.getRight_2025() != null)
			if (search_2025(node_2025.getRight_2025(), data_2025))
				return true;
		return false;
	}
	public void printInorder_2025() {
		root_2025.printInorder_2025(root_2025);
	}
	public void printPreorder_2025() {
		root_2025.printPreorder_2025(root_2025);
	}
	public void printPostorder_2025() {
		root_2025.printPostorder_2025(root_2025);	
	}
	public Node_2511532025 getRoot_2025() {
		return root_2025;
	}
	public boolean isEmpty_2025() {
		return root_2025 == null;
	}
	public int countNodes_2025() {
		return countNodes_2025(root_2025);
	}
	private int countNodes_2025(Node_2511532025 node_2025) {
		int count_2025 = 1;
		if (node_2025 == null) {
			return 0;
		} else {
			count_2025 += countNodes_2025(node_2025.getLeft_2025());
			count_2025 += countNodes_2025(node_2025.getRight_2025());
			return count_2025;
		}
	}
	public void print_2025() {
		root_2025.print_2025();
	}
	public Node_2511532025 getCurrent_2025() {
		return currentNode_2025;
	}
	public void setCurrent_2025(Node_2511532025 node_2025) {
		this.currentNode_2025 = node_2025;
	}
	public void setRoot_2025(Node_2511532025 root_2025) {
		this.root_2025 = root_2025;
	}

}
