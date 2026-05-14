package pekan6_2511532025;

import java.util.Scanner;

public class Musik_2511532025 {
	
	Lagu_2511532025 head_2025;
	Lagu_2511532025 tail_2025;
	
	// method tambah lagu di akhir
	public void tambahLagu_2025(String judul_2025, String penyanyi_2025) {
		Lagu_2511532025 laguBaru_2025 = new Lagu_2511532025(judul_2025, penyanyi_2025);
		
		// jika playlist kosong
		if (head_2025 == null) {
			head_2025 = laguBaru_2025;
			tail_2025 = laguBaru_2025;
		}
		else {
			tail_2025.next_2025 = laguBaru_2025;
			laguBaru_2025.prev_2025 = tail_2025;
			tail_2025 = laguBaru_2025;
		}
		
		System.out.println("Lagu berhasil ditambahkan!");
	}
	
	// method hapus lagu awal
	public void hapusLaguAwal_2025() {
		if (head_2025 == null) {
			System.out.println("Playlist kosong!");
			return;
		}
		
		System.out.println("Lagu \"" + head_2025.judul_2025 + "\" berhasil dihapus");
		
		head_2025 = head_2025.next_2025;
		
		if (head_2025 != null) {
			head_2025.prev_2025 = null;
		}
		else {
			tail_2025 = null;
		}
	}
	
	// tampil playlist maju
	public void tampilMaju_2025() {
		if (head_2025 == null) {
			System.out.println("Playlist kosong!");
			return;
		}
		
		Lagu_2511532025 curr_2025 = head_2025;
		
		System.out.println("=== Playlist Maju ===");
		
		while (curr_2025 != null) {
			System.out.println(curr_2025.judul_2025 + " - " + curr_2025.penyanyi_2025);
			curr_2025 = curr_2025.next_2025;
		}
	}
	
	// tampil playlist mundur
	public void tampilMundur_2025() {
		if (tail_2025 == null) {
			System.out.println("Playlist kosong!");
			return;
		}
		
		Lagu_2511532025 curr_2025 = tail_2025;
		
		System.out.println("=== Playlist Mundur ===");
		
		while (curr_2025 != null) {
			System.out.println(curr_2025.judul_2025 + " - " + curr_2025.penyanyi_2025);
			curr_2025 = curr_2025.prev_2025;
		}
	}
	
	// method cari lagu
	public void cariLagu_2025(String judulCari_2025) {
		if (head_2025 == null) {
			System.out.println("Playlist kosong!");
			return;
		}
		
		Lagu_2511532025 curr_2025 = head_2025;
		boolean ketemu_2025 = false;
		
		while (curr_2025 != null) {
			if (curr_2025.judul_2025.equalsIgnoreCase(judulCari_2025)) {
				System.out.println("Lagu ditemukan!");
				System.out.println("Judul : " + curr_2025.judul_2025);
				System.out.println("Penyanyi : " + curr_2025.penyanyi_2025);
				ketemu_2025 = true;
				break;
			}
			
			curr_2025 = curr_2025.next_2025;
		}
		
		if (!ketemu_2025) {
			System.out.println("Lagu tidak ditemukan!");
		}
	}
	
	public static void main(String[] args) {
		Scanner input_2025 = new Scanner(System.in);
		
		Musik_2511532025 playlist_2025 = new Musik_2511532025();
		
		int pilihan_2025;
		
		do {
			System.out.println("\n=== Playlist Musik NIM: 2511532025 ===");
			System.out.println("1. Tambah Lagu");
			System.out.println("2. Hapus Lagu Pertama");
			System.out.println("3. Lihat Playlist (Maju)");
			System.out.println("4. Lihat Playlist (Mundur)");
			System.out.println("5. Cari Lagu");
			System.out.println("6. Keluar");
			System.out.print("Pilihan: ");
			pilihan_2025 = input_2025.nextInt();
			input_2025.nextLine();
			
			switch (pilihan_2025) {
			
			case 1:
				System.out.print("Judul Lagu: ");
				String judul_2025 = input_2025.nextLine();
				
				System.out.print("Penyanyi: ");
				String penyanyi_2025 = input_2025.nextLine();
				
				playlist_2025.tambahLagu_2025(judul_2025, penyanyi_2025);
				break;
				
			case 2:
				playlist_2025.hapusLaguAwal_2025();
				break;
				
			case 3:
				playlist_2025.tampilMaju_2025();
				break;
				
			case 4:
				playlist_2025.tampilMundur_2025();
				break;
				
			case 5:
				System.out.print("Masukkan judul lagu: ");
				String cari_2025 = input_2025.nextLine();
				
				playlist_2025.cariLagu_2025(cari_2025);
				break;
				
			case 6:
				System.out.println("Program selesai.");
				break;
				
			default:
				System.out.println("Pilihan tidak valid!");
			}
			
		} while (pilihan_2025 != 6);
		
		input_2025.close();
	}
}