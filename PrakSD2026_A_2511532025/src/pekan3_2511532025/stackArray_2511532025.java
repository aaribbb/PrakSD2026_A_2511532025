package pekan3_2511532025;

public class stackArray_2511532025 {
	static final int MAX_2025 = 1000;
	int top_2025;
	int a_2025[] = new int[MAX_2025];
	boolean isEmpty_2025()
	{
		return (top_2025 < 0);
	}
	stackArray_2511532025()
	{
		top_2025 = -1;
	}
	boolean push_2025(int x)
	{
		if (top_2025 >= (MAX_2025 -1)) {
			System.out.println("Stack Overflow");
			return false;
		}
		else {
			a_2025[++top_2025] = x;
			System.out.println(x + " dimasukkan dalam stack");
			return true;
		}
	}
	int pop_2025()
	{
		if (top_2025 < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int x = a_2025[top_2025--];
			return x;
		}
	}
	int peek_2025()
	{
		if (top_2025 < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int x = a_2025[top_2025];
			return x;
		}
	}
	void print_2025() {
		for (int i = top_2025; i>-1; i--) {
			System.out.print(" " + a_2025 [i]);
		}
	}
}
