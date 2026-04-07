package pekan2_2511532025;

import java.util.ArrayList;

public class DaftarKata_2511532025 {
	
	private final ArrayList<String> data;
	
	// Kontruktor: inisialisasi list kosong
	public DaftarKata_2511532025() {
		this.data = new ArrayList<>();
		
	}
	/** Menambahkan elemen di akhir list. */
	public void tambah_2511532025(String elemen) {
		data.add(elemen);
		
	}
	/** Menambahkan elemen pada indeks tertentu (menyisipkan). */
	public void tambahPada_2511532025(int index, String elemen) {
		data.add(index, elemen);
		
	}
	/**
	 * Mengubah elemen pada posisi 'index' menjadi 'nilaiBaru'.
	 * Bertindak sebagai "Setter" untuk elemen tertentu.
	 */
	public void ubahElemen_2511532025(int index, String nilaiBaru) {
		data.set(index, nilaiBaru);
		
	}
	
	public String hapusElement_2511532025(int index) {
		return data.remove(index);
		
	}
	
	public void iterasiCetak_2511532025() {
		for (int i = 0; i < data.size(); i++) {
			System.out.print(data.get(i)+" ");
			
		}
	}
	
	public String get(int index) {
		return data.get(index);
		
	}
	// Representasi string agar mudah dicetak
	@Override
	public String toString() {
		return data.toString();
	}

}
