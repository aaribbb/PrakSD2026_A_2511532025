package pekan3_2511532025;

public class Website_2511532025 {

	    private String judul_2025;
	    private String url_2025;

	    // Kontruktor
	    public Website_2511532025(String judul_2025, String url_2025) {
	        this.judul_2025 = judul_2025;
	        this.url_2025 = url_2025;
	    }

	    // Getter
	    public String getJudul_2025() {
	        return judul_2025;
	    }

	    public String getUrl_2025() {
	        return url_2025;
	    }

	    // Setter
	    public void setJudul_2025(String judul_2025) {
	        this.judul_2025 = judul_2025;
	    }

	    public void setUrl_2025(String url_2025) {
	        this.url_2025 = url_2025;
	    }

	    // ToString (biar gampang ditampilkan)
	    @Override
	    public String toString() {
	        return "Judul: " + judul_2025 + ", URL: " + url_2025;
	    }

}
