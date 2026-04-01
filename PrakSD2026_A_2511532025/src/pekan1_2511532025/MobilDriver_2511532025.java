package pekan1_2511532025;

import java.util.ArrayList;

public class MobilDriver_2511532025 {

	public static void main(String[] args) {
		
		ArrayList<ADTmobil_2511532025> daftarMobil = new ArrayList<>();
		
		ADTmobil_2511532025 m1 = new ADTmobil_2511532025("Audi RS5", 2026, 2900, 258700000, "Audi");
		ADTmobil_2511532025 m2 = new ADTmobil_2511532025("Civic RS", 2025, 1999, 699000000, "Honda");
		
		daftarMobil.add(m1);
		daftarMobil.add(m2);
		
		System.out.println("=== DAFTAR MOBIL ===");
		for (ADTmobil_2511532025 m : daftarMobil) {
			System.out.println(m);
		}
		daftarMobil.remove(0);
	
		System.out.println("\n=== SETELAH DIHAPUS ===");
		for (ADTmobil_2511532025 m : daftarMobil) {
			System.out.println(m);
		}
	}

}
