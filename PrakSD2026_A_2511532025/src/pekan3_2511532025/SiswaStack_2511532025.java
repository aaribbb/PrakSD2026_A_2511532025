package pekan3_2511532025;
import java.util.ArrayList;

class Siswa_2511532025 {
	String nama_2025;
	int nim_2025;
	
	public Siswa_2511532025(String nama_2025, int nim_2025) {
		this.nama_2025 = nama_2025;
		this.nim_2025 = nim_2025;
	}
	@Override
	public String toString() {
		return "Nim: " + nim_2025 + ", Nama: " + nama_2025;
	}
}

public class SiswaStack_2511532025 {
	private ArrayList<Siswa_2511532025> stack;
	public SiswaStack_2511532025() {
		stack = new ArrayList<>();
	}
public void push(Siswa_2511532025 mhs) {
		stack.add(mhs);
	}

public Siswa_2511532025 pop_2025() {
	if (!isEmpty()) {
		return stack.remove(stack.size() - 1);
	}
	return null;
}
public Siswa_2511532025 peek_2025() {
	if (!isEmpty()) {
		return stack.get(stack.size() - 1);
	}
	return null;
}
public boolean isEmpty() {
	return stack.isEmpty();
}
public void tampilkanSiswa_2025() {
	for (int i = stack.size() - 1; i >= 0; i--) {
		System.out.println(stack.get(i));
	}
}


public static void main (String[] args) {
	SiswaStack_2511532025 studentStack_2025 = new SiswaStack_2511532025();
	
	Siswa_2511532025 mhs1 = new Siswa_2511532025 ("Ali", 1);
	Siswa_2511532025 mhs2 = new Siswa_2511532025 ("Boby", 2);
	Siswa_2511532025 mhs3 = new Siswa_2511532025 ("Charles", 3);
	
	studentStack_2025.push(mhs1);
	studentStack_2025.push(mhs2);
	studentStack_2025.push(mhs3);
	
	System.out.println("Siswa di  dalam stack:");
	studentStack_2025.tampilkanSiswa_2025(); 
	
	System.out.println("Siswa teratas " + studentStack_2025.peek_2025());
	System.out.println("mengeluarkan siswa teratas dari stack: " + studentStack_2025.pop_2025());
	studentStack_2025.tampilkanSiswa_2025();
}
}
