package pekan9_2511532025;

public class Node_2511532025 {
	int data_2025;
	Node_2511532025 left_2025;
	Node_2511532025 right_2025;
	public Node_2511532025(int data_2025) {
		this.data_2025 = data_2025;
		left_2025 = null;
		right_2025 = null;
	}
	public void setLeft_2025(Node_2511532025 node_2025) {
		if (left_2025 == null)
			left_2025 = node_2025;
	}
	public void setRight_2025(Node_2511532025 node_2025) {
		if (right_2025 == null)
			right_2025 = node_2025;
	}
	public Node_2511532025 getLeft_2025() {
		return left_2025;
	}
	public Node_2511532025 getRight_2025() {
		return right_2025;
	}
	public int getData_2025() {
		return data_2025;
	}
	public void setData_2025(int data_2025) {
		this.data_2025 = data_2025;
	}
	void printPreorder_2025(Node_2511532025 node_2025) {
		if (node_2025 == null)
			return;
		System.out.print(node_2025.data_2025 + " ");
		printPreorder_2025(node_2025.left_2025);
		printPreorder_2025(node_2025.right_2025);
	}
	void printPostorder_2025(Node_2511532025 node_2025) {
		if (node_2025 == null)
			return;
		printPostorder_2025(node_2025.left_2025);
		printPostorder_2025(node_2025.right_2025);
		System.out.print(node_2025.data_2025 + " ");
	}
	void printInorder_2025(Node_2511532025 node_2025) {
		if (node_2025 == null)
			return;
		printInorder_2025(node_2025.left_2025);
		System.out.print(node_2025.data_2025 + " ");
		printInorder_2025(node_2025.right_2025);
	}
	public String print_2025() {
		return this.print_2025("", true, "");
	}
	public String print_2025(String prefix_2025, boolean isTail_2025, String sb_2025) {
		if (right_2025 != null) {
			right_2025.print_2025(prefix_2025 + (isTail_2025 ? "| ":" "), false, sb_2025);
		}
		System.out.println(prefix_2025 + (isTail_2025 ? "\\-- ":"/-- ") + data_2025);
		if (left_2025 != null) {
			left_2025.print_2025(prefix_2025 + (isTail_2025 ? " ":"| "), true, sb_2025);
		}
		return sb_2025;
	}
}