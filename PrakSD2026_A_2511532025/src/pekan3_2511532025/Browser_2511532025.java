package pekan3_2511532025;

import java.util.Scanner;
import java.util.Stack;

public class Browser_2511532025 {
	
	public static void main(String[] args) {
		Stack<Website_2511532025> history_2025 = new Stack<>();
		Scanner input_2025 = new Scanner(System.in);

	    int pilihan;

	    do {
	    	System.out.println("\n=== Browser History NIM: 2511532025 ===");
	        System.out.println("1. Kunjungi Website (Push)");
	        System.out.println("2. Tombol Back (Pop)");
	        System.out.println("3. Lihat Halaman Aktif (Peek)");
	        System.out.println("4. Cek Status History");
	        System.out.println("5. Keluar");
	        System.out.print("Pilihan: ");
	        pilihan = input_2025.nextInt();
	        input_2025.nextLine(); // buang newline

	        switch (pilihan) {
	        case 1:
	        	System.out.print("Masukkan Judul: ");
	            String judul = input_2025.nextLine();

	            System.out.print("Masukkan URL: ");
	            String url = input_2025.nextLine();

	            Website_2511532025 web = new Website_2511532025(judul, url);
	            history_2025.push(web);

	            System.out.println("Berhasil mengunjungi halaman!");
	            break;
	            
	        case 2:
	        	if (history_2025.isEmpty()) {
	        		System.out.println("History kosong, tidak bisa kembali!");
	        		} else {
	        			Website_2511532025 keluar = history_2025.pop();
	        			System.out.println("Kembali dari: " + keluar.getJudul_2025());
	                    }
	        	break;
	        	
	        case 3:
	        	if (history_2025.isEmpty()) {
	        		System.out.println("Tidak ada halaman aktif!");
	        		} else {
	                	System.out.println("Halaman aktif:");
	                    System.out.println(history_2025.peek());
	                    }
	        	break;
	        	
	        case 4:
	        	if (history_2025.isEmpty()) {
	        		System.out.println("History kosong");
	        		} else {
	        			System.out.println("Jumlah history: " + history_2025.size());
	        			}
	        	break;
	        	
	        case 5:
	        	System.out.println("Keluar dari program...");
	        	break;
	        	
	        default:
	        	System.out.println("Pilihan tidak valid!");
	        	}
	        
	    } while (pilihan != 5);
	    
	    input_2025.close();
	    
	}

}
