package pekan2_2511532025;

import java.util.ArrayList;
import java.util.Scanner;

public class Playlist_2511532025 {
	
	    // Method menu
	    public static void tampilkanMenu() {
	        System.out.println("\n=== Playlist Musik NIM: 2511532025 ===");
	        System.out.println("1. Tambah Lagu");
	        System.out.println("2. Lihat Playlist");
	        System.out.println("3. Hapus Lagu");
	        System.out.println("4. Cek Jumlah Lagu");
	        System.out.println("5. Keluar");
	    }

	    // Tambah lagu
	    public static void tambahLagu(ArrayList<Musik_2511532025> playlist, Scanner sc) {
	        System.out.print("Masukkan Judul: ");
	        String judul = sc.nextLine();

	        System.out.print("Masukkan Penyanyi: ");
	        String penyanyi = sc.nextLine();

	        System.out.print("Masukkan Durasi (detik): ");
	        int durasi = sc.nextInt();
	        sc.nextLine();

	        playlist.add(new Musik_2511532025(judul, penyanyi, durasi));
	        System.out.println("Data berhasil ditambahkan!");
	    }

	    // Lihat playlist
	    public static void lihatPlaylist(ArrayList<Musik_2511532025> playlist) {
	        if (playlist.isEmpty()) {
	            System.out.println("Playlist kosong.");
	        } else {
	            System.out.println("\nDaftar Lagu:");
	            for (int i = 0; i < playlist.size(); i++) {
	                System.out.println((i + 1) + ". " + playlist.get(i));
	            }
	        }
	    }

	    // Hapus lagu
	    public static void hapusLagu(ArrayList<Musik_2511532025> playlist, Scanner sc) {
	        lihatPlaylist(playlist);

	        if (!playlist.isEmpty()) {
	            System.out.print("Masukkan nomor lagu yang ingin dihapus: ");
	            int index = sc.nextInt();
	            sc.nextLine();

	            if (index > 0 && index <= playlist.size()) {
	                playlist.remove(index - 1);
	                System.out.println("Lagu berhasil dihapus.");
	            } else {
	                System.out.println("Nomor tidak valid.");
	            }
	        }
	    }

	    // Cek jumlah lagu
	    public static void cekJumlahLagu(ArrayList<Musik_2511532025> playlist) {
	        System.out.println("Jumlah lagu dalam playlist: " + playlist.size());
	    }

	    public static void main(String[] args) {
	        ArrayList<Musik_2511532025> playlist = new ArrayList<>();
	        Scanner sc = new Scanner(System.in);
	        int pilihan;

	        do {
	            tampilkanMenu();
	            System.out.print("Pilihan: ");
	            pilihan = sc.nextInt();
	            sc.nextLine();

	            switch (pilihan) {
	                case 1:
	                    tambahLagu(playlist, sc);
	                    break;
	                case 2:
	                    lihatPlaylist(playlist);
	                    break;
	                case 3:
	                    hapusLagu(playlist, sc);
	                    break;
	                case 4:
	                    cekJumlahLagu(playlist);
	                    break;
	                case 5:
	                    System.out.println("Keluar dari program.");
	                    break;
	                default:
	                    System.out.println("Pilihan tidak valid.");
	            }

	        } while (pilihan != 5);

	        sc.close();
	    }
}
