package pekan3_2511532025;
import java.util.Stack;
public class NilaiMaximum_2511532025 {
	public static int max_2025 (Stack<Integer> s_2025) {
		Stack<Integer> backup = new Stack<Integer>();
		int maxValue = s_2025.pop();
		backup.push(maxValue);
		while (!s_2025.isEmpty()) {
			int next = s_2025.pop();
			backup.push(next);
			maxValue = Math.max(maxValue,  next);
		}
		while (!backup.isEmpty()) {
			s_2025.push(backup.pop());
		}
		return maxValue;
	}
	public static void main(String[] args) {
	Stack<Integer> s_2025 = new Stack<Integer>();
	s_2025.push(70);
	s_2025.push(12);
	s_2025.push(20);
	System.out.println("isi stack " + s_2025);
	System.out.println("Stack Teratas " + s_2025.peek());
	System.out.println("Nilai maksimum " + max_2025(s_2025));
	}

}
