package pekan3_2511532025;
import java.util.Scanner;
import java.util.Stack;
public class stackPostfix_2511532025 {

		public static int postfixEvaluate_2025(String expression) {
			Stack<Integer> s_2025 = new Stack<Integer>();
			Scanner input_2025 = new Scanner(expression);
			while (input_2025.hasNext()) {
				if (input_2025.hasNextInt()) {
					s_2025.push(input_2025.nextInt());
			} else {
				String operator_2025 = input_2025.next();
				int operand2_2025 = s_2025.pop();
				int operand1_2025 = s_2025.pop();
				if (operator_2025.equals("+")) {
					s_2025.push(operand1_2025 + operand2_2025);
				} else if (operator_2025.equals("-")) {
					s_2025.push(operand1_2025 - operand2_2025);
				} else if (operator_2025.equals("*")) {
					s_2025.push(operand1_2025 * operand2_2025);
				} else {
					s_2025.push(operand1_2025 / operand2_2025);
				}
			}
		}
		input_2025.close();
		return s_2025.pop();
	}
	public static void main(String[] args) {
		System.out.println("hasil postfix = " + postfixEvaluate_2025("5 2 4 * + 7 -"));
	}
}
