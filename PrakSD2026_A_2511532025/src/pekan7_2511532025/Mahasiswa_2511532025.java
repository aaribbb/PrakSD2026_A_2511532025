package pekan7_2511532025;

public class Mahasiswa_2511532025 {

    private String nama_2025;
    private String nim_2025;
    private String prodi_2025;

    // constructor
    public Mahasiswa_2511532025(String nama_2025, String nim_2025, String prodi_2025) {
        this.nama_2025 = nama_2025;
        this.nim_2025 = nim_2025;
        this.prodi_2025 = prodi_2025;
    }
    // getter
    public String getNama_2025() {
    	return nama_2025;
    }
    public String getNim_2025() {
        return nim_2025;
    }
    public String getProdi_2025() {
        return prodi_2025;
    }
    // setter
    public void setNama_2025(String nama_2025) {
        this.nama_2025 = nama_2025;
    }
    public void setNim_2025(String nim_2025) {
        this.nim_2025 = nim_2025;
    }
    public void setProdi_2025(String prodi_2025) {
        this.prodi_2025 = prodi_2025;
    }
    @Override
    public String toString() {
        return nama_2025 + " - " + nim_2025 + " - " + prodi_2025;
    }
}
