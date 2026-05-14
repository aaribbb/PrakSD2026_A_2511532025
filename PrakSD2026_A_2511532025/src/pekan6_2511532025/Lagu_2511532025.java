package pekan6_2511532025;

//class node lagu
public class Lagu_2511532025 {
	String judul_2025;
	String penyanyi_2025;
	
	Lagu_2511532025 next_2025;
	Lagu_2511532025 prev_2025;
	
	// konstruktor
	public Lagu_2511532025(String judul_2025, String penyanyi_2025) {
		this.judul_2025 = judul_2025;
		this.penyanyi_2025 = penyanyi_2025;
		this.next_2025 = null;
		this.prev_2025 = null;
	}
	
	// getter judul
	public String getJudul_2025() {
		return judul_2025;
	}
	
	// getter penyanyi
	public String getPenyanyi_2025() {
		return penyanyi_2025;
	}
	
	// setter judul
	public void setJudul_2025(String judul_2025) {
		this.judul_2025 = judul_2025;
	}
	
	// setter penyanyi
	public void setPenyanyi_2025(String penyanyi_2025) {
		this.penyanyi_2025 = penyanyi_2025;
	}
}