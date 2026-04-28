package pekan4_2511532025;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseData_2511532025 {

	public static void main(String[] args) {
		Queue<Integer> q_2025 = new LinkedList<Integer>();
		q_2025.add(1);
		q_2025.add(2);
		q_2025.add(3); // [i, 2, 3]
		System.out.println("sebelum reverse = " + q_2025);
		Stack<Integer> s_2025 = new Stack<Integer>();
		while (!q_2025.isEmpty()) { // Q -> S
			s_2025.push(q_2025.remove());
		}
		while (!s_2025.isEmpty()) { // S -> Q
			q_2025.add(s_2025.pop());
		}
		System.out.println("sesudah reverse = " + q_2025); // [3, 2, 1]
	}

}
