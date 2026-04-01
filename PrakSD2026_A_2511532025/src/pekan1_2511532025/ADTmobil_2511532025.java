package pekan1_2511532025;

import java.util.ArrayList;

public class ADTmobil_2511532025 {
	private String nama;
	private int tahun;
	private int cc;
	private double harga;
	private String merk;
	
	public ADTmobil_2511532025(String nama, int tahun, int cc, double harga, String merk) {
		this.nama = nama;
		this.tahun = tahun;
		this.cc = cc;
		this.harga = harga;
		this.merk = merk;
	}
	public String getNama() { return nama; }
	public int getTahun() { return tahun; }
	public int getCc() { return cc; }
	public double getHarga() { return harga; }
	public String getmerk() { return merk;}
	
	public void setNama(String nama) { this.nama = nama; }
	public void setTahun(int tahun) { this.tahun = tahun; }
	public void setCc(int cc) { this.cc = cc; }
	public void setHarga(double harga) { this.harga = harga; }
	public void setMerk(String merk) { this.merk = merk; }
	
	public static void tambahMobil(ArrayList<ADTmobil_2511532025> list, ADTmobil_2511532025 m) {
		list.add(m);
	}
	public static void hapusMobil(ArrayList<ADTmobil_2511532025> list, int index) {
		list.remove(index);
	}
	public String toString() {
		return String.format("Nama: %s, Tahun: %d, CC: %d, Harga: %.0f, Merk: %s", nama, tahun, cc, harga, merk);
 	}
}

	
	
