package pekan4_2511532025;

import java.util.Iterator;
import java.util.Queue;
import java.util.LinkedList;

public class IterasiQueue_2511532025 {

	public static void main(String[] args) {
		Queue<String> q_2025 = new LinkedList<>();
		
		q_2025.add("Praktikum");
		q_2025.add("Struktur");
		q_2025.add("Data");
		q_2025.add("Dan");
		q_2025.add("Algoritma");
		Iterator<String> iterator = q_2025.iterator(); 
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}

}
