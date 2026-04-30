package pekan4_2511532025;

import java.util.Scanner;

public class AntrianLoket_2511532025 {
		
	    // deklarasi variabel
	    private String queue_2025[];
	    private int front_2025;
	    private int rear_2025;
	    private int max_2025;

	    // konstruktor
	    public AntrianLoket_2511532025(int kapasitas) {
	        max_2025 = kapasitas;
	        queue_2025 = new String[max_2025];
	        front_2025 = -1;
	        rear_2025 = -1;
	    }

	    // cek kosong
	    public boolean isEmpty_2025() {
	        return (front_2025 == -1);
	    }

	    // cek penuh
	    public boolean isFull_2025() {
	        return (rear_2025 == max_2025 - 1);
	    }

	    // enqueue
	    public void enqueue_2025(String data) {
	        if (isFull_2025()) {
	            System.out.println("Antrian penuh!");
	        } else {
	            if (isEmpty_2025()) {
	                front_2025 = 0;
	            }
	            rear_2025++;
	            queue_2025[rear_2025] = data;
	            System.out.println("Data berhasil ditambahkan ke antrian");
	        }
	    }

	    // dequeue
	    public void dequeue_2025() {
	        if (isEmpty_2025()) {
	            System.out.println("Antrian kosong!");
	        } else {
	            System.out.println(queue_2025[front_2025] + " telah dilayani");

	            if (front_2025 == rear_2025) {
	                front_2025 = -1;
	                rear_2025 = -1;
	            } else {
	                front_2025++;
	            }
	        }
	    }

	    // display
	    public void display_2025() {
	        if (isEmpty_2025()) {
	            System.out.println("Antrian kosong!");
	        } else {
	            System.out.println("Isi antrian:");
	            int no = 1;
	            for (int i = front_2025; i <= rear_2025; i++) {
	                System.out.println(no + ". " + queue_2025[i]);
	                no++;
	            }
	        }
	    }

	    // reverse
	    public void reverse_2025() {
	        if (isEmpty_2025()) {
	            System.out.println("Antrian kosong!");
	        } else {
	            int i = front_2025;
	            int j = rear_2025;

	            while (i < j) {
	                String temp = queue_2025[i];
	                queue_2025[i] = queue_2025[j];
	                queue_2025[j] = temp;
	                i++;
	                j--;
	            }
	            System.out.println("Antrian berhasil dibalik");
	        }
	    }

	    // main program
	    public static void main(String[] args) {
	        Scanner input_2025 = new Scanner(System.in);
	        AntrianLoket_2511532025 antrian_2025 = new AntrianLoket_2511532025(10);

	        int pilihan_2025;

	        do {
	            System.out.println("\n=== PROGRAM ANTRIAN LOKET ===");
	            System.out.println("1. Tambah Antrian");
	            System.out.println("2. Hapus Antrian");
	            System.out.println("3. Tampilkan Antrian");
	            System.out.println("4. Reverse");
	            System.out.println("5. Keluar");
	            System.out.print("Pilih menu: ");
	            pilihan_2025 = input_2025.nextInt();
	            input_2025.nextLine();

	            switch (pilihan_2025) {
	                case 1:
	                    System.out.print("Masukkan nama pelanggan: ");
	                    String nama_2025 = input_2025.nextLine();
	                    antrian_2025.enqueue_2025(nama_2025);
	                    break;

	                case 2:
	                    antrian_2025.dequeue_2025();
	                    break;

	                case 3:
	                    antrian_2025.display_2025();
	                    break;

	                case 4:
	                    antrian_2025.reverse_2025();
	                    antrian_2025.display_2025();
	                    break;

	                case 5:
	                    System.out.println("Program selesai");
	                    break;

	                default:
	                    System.out.println("Pilihan tidak valid!");
	            }

	        } while (pilihan_2025 != 5);

	        input_2025.close();
	    }

}
