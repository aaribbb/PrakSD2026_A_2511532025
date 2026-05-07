package pekan5_2511532025;

import java.util.Scanner;

// class driver rumah sakit
public class RumahSakit_2511532025 {

    // head linked list
    static Pasien_2511532025 head_2025 = null;

    // counter nomor antrian
    static int counter_2025 = 0;

    // method menambahkan pasien di akhir linked list
    public static void daftarkanPasien_2025(String nama_2025,
                                            String penyakit_2025) {

        // nomor antrian bertambah otomatis
        counter_2025++;

        // membuat node pasien baru
        Pasien_2511532025 pasienBaru_2025 =
                new Pasien_2511532025(
                        nama_2025,
                        penyakit_2025,
                        counter_2025);

        // jika linked list kosong
        if (head_2025 == null) {
            head_2025 = pasienBaru_2025;
        } else {

            // traversal ke node terakhir
            Pasien_2511532025 temp_2025 = head_2025;

            while (temp_2025.next_2025 != null) {
                temp_2025 = temp_2025.next_2025;
            }

            // hubungkan node terakhir ke pasien baru
            temp_2025.next_2025 = pasienBaru_2025;
        }

        System.out.println(
                "Pasien berhasil didaftarkan! Nomor Antrian: "
                        + counter_2025);
    }

    // method memanggil pasien pertama
    public static void panggilPasien_2025() {

        // cek apakah antrian kosong
        if (head_2025 == null) {
            System.out.println("Antrian kosong");
            return;
        }

        // tampilkan pasien yang dipanggil
        System.out.println("\nPasien dipanggil:");
        System.out.println(
                "Nomor Antrian : "
                        + head_2025.nomorAntrian_2025);

        System.out.println(
                "Nama Pasien   : "
                        + head_2025.namaPasien_2025);

        System.out.println(
                "Keluhan       : "
                        + head_2025.penyakit_2025);

        // hapus head
        head_2025 = head_2025.next_2025;
    }

    // method menampilkan seluruh antrian
    public static void tampilkanAntrian_2025() {

        // cek linked list kosong
        if (head_2025 == null) {
            System.out.println("Antrian kosong");
            return;
        }

        // traversal linked list
        Pasien_2511532025 temp_2025 = head_2025;

        System.out.println("\n=== Daftar Antrian Pasien ===");

        while (temp_2025 != null) {

            System.out.println(
                    "No Antrian : "
                            + temp_2025.nomorAntrian_2025);

            System.out.println(
                    "Nama       : "
                            + temp_2025.namaPasien_2025);

            System.out.println(
                    "Keluhan    : "
                            + temp_2025.penyakit_2025);

            System.out.println("----------------------");

            temp_2025 = temp_2025.next_2025;
        }
    }

    // method mencari pasien berdasarkan nama
    public static void cariPasien_2025(String namaCari_2025) {

        // cek linked list kosong
        if (head_2025 == null) {
            System.out.println("Antrian kosong");
            return;
        }

        Pasien_2511532025 temp_2025 = head_2025;

        boolean ditemukan_2025 = false;

        while (temp_2025 != null) {

            // pencarian case insensitive
            if (temp_2025.namaPasien_2025
                    .equalsIgnoreCase(namaCari_2025)) {

                System.out.println("\nPasien ditemukan");
                System.out.println(
                        "Nomor Antrian : "
                                + temp_2025.nomorAntrian_2025);

                System.out.println(
                        "Nama Pasien   : "
                                + temp_2025.namaPasien_2025);

                System.out.println(
                        "Keluhan       : "
                                + temp_2025.penyakit_2025);

                ditemukan_2025 = true;
                break;
            }

            temp_2025 = temp_2025.next_2025;
        }

        // jika pasien tidak ditemukan
        if (!ditemukan_2025) {
            System.out.println("Pasien tidak ditemukan");
        }
    }

    // method cek status antrian
    public static void cekStatusAntrian_2025() {

        // cek linked list kosong
        if (head_2025 == null) {
            System.out.println("Antrian kosong");
            return;
        }

        int jumlah_2025 = 0;

        Pasien_2511532025 temp_2025 = head_2025;

        // menghitung jumlah pasien
        while (temp_2025 != null) {
            jumlah_2025++;
            temp_2025 = temp_2025.next_2025;
        }

        System.out.println("\n=== Status Antrian ===");

        System.out.println(
                "Jumlah Pasien : "
                        + jumlah_2025);

        System.out.println(
                "Pasien Terdepan : "
                        + head_2025.namaPasien_2025);
    }

    // method utama program
    public static void main(String[] args) {

        Scanner input_2025 = new Scanner(System.in);

        int pilihan_2025;

        do {

            // menu program
            System.out.println(
                    "\n=== Antrian Rumah Sakit NIM: 2511532025 ===");

            System.out.println("1. Daftarkan Pasien");
            System.out.println("2. Panggil Pasien");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Cari Pasien");
            System.out.println("5. Cek Status Antrian");
            System.out.println("6. Keluar");

            System.out.print("Pilihan : ");
            pilihan_2025 = input_2025.nextInt();
            input_2025.nextLine();

            switch (pilihan_2025) {

                case 1:

                    // input data pasien
                    System.out.print("Masukkan Nama Pasien : ");
                    String nama_2025 =
                            input_2025.nextLine();

                    System.out.print("Masukkan Keluhan : ");
                    String keluhan_2025 =
                            input_2025.nextLine();

                    // memanggil method daftar pasien
                    daftarkanPasien_2025(
                            nama_2025,
                            keluhan_2025);

                    break;

                case 2:

                    // memanggil pasien
                    panggilPasien_2025();

                    break;

                case 3:

                    // menampilkan antrian
                    tampilkanAntrian_2025();

                    break;

                case 4:

                    // input nama pasien
                    System.out.print(
                            "Masukkan nama pasien yang dicari : ");

                    String cari_2025 =
                            input_2025.nextLine();

                    // mencari pasien
                    cariPasien_2025(cari_2025);

                    break;

                case 5:

                    // cek status antrian
                    cekStatusAntrian_2025();

                    break;

                case 6:

                    System.out.println("Program selesai");
                    break;

                default:

                    System.out.println("Pilihan tidak valid");
            }

        } while (pilihan_2025 != 6);

        input_2025.close();
    }
}
