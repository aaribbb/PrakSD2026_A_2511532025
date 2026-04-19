package pekan2_2511532025;

public class Musik_2511532025 {
	    
	    // Atribut 
	    private String judul_2025;
	    private String penyanyi_2025;
	    private int durasi_2025;

	    // Constructor
	    public Musik_2511532025(String judul, String penyanyi, int durasi) {
	        this.judul_2025 = judul;
	        this.penyanyi_2025 = penyanyi;
	        this.durasi_2025 = durasi;
	    }

	    // Getter
	    public String getJudul_2025() {
	        return judul_2025;
	    }

	    public String getPenyanyi_2025() {
	        return penyanyi_2025;
	    }

	    public int getDurasi_2025() {
	        return durasi_2025;
	    }

	    // Setter
	    public void setJudul_2025(String judul) {
	        this.judul_2025 = judul;
	    }

	    public void setPenyanyi_2025(String penyanyi) {
	        this.penyanyi_2025 = penyanyi;
	    }

	    public void setDurasi_2025(int durasi) {
	        this.durasi_2025 = durasi;
	    }

	    // toString untuk tampilkan data
	    @Override
	    public String toString() {
	        return "Judul: " + judul_2025 +
	               ", Penyanyi: " + penyanyi_2025 +
	               ", Durasi: " + durasi_2025 + " detik";
	    }
}
