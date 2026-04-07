package pekan2_2511532025;

public class DaftarKataDriver_2511532025 {

	public static void main(String[] args) {
		DaftarKata_2511532025 al = new DaftarKata_2511532025();
		
		// Menambah elemen (akhir)
		al.tambah_2511532025("Kami");
		al.tambah_2511532025("informatika");
		
		// Menyisipkan elemen pada indeks 1
		al.tambahPada_2511532025(1, "Mahasiswa");
		
		// Cetak isi awal
		System.out.println("Awal: " + al);
		
		// Mengubah elemen (indeks 1)
		al.ubahElemen_2511532025(1, "Departemen");
		System.out.println("Setelah Ubah: " + al);
		
		// Menghapus elemen (hapus index 0)
		String terhapus = al.hapusElement_2511532025(0);
		System.out.println("Terhapus: " + terhapus);
		System.out.println("Setelah Hapus: " + al);
		
		// Iterasi pada ArrayList (cetak setiap elemen)
		System.out.print("Iterasi: ");
		al.iterasiCetak_2511532025();
		System.out.println();
	}

}
