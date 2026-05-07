package pekan5_2511532025;

public class Pasien_2511532025 {

 // atribut data pasien
 String namaPasien_2025;
 String penyakit_2025;
 int nomorAntrian_2025;

 // pointer ke pasien berikutnya
 Pasien_2511532025 next_2025;

 // konstruktor untuk menginisialisasi data pasien
 public Pasien_2511532025(String namaPasien_2025,
                          String penyakit_2025,
                          int nomorAntrian_2025) {

     this.namaPasien_2025 = namaPasien_2025;
     this.penyakit_2025 = penyakit_2025;
     this.nomorAntrian_2025 = nomorAntrian_2025;

     // node berikutnya masih kosong
     this.next_2025 = null;
 }

 // getter nama pasien
 public String getNamaPasien_2025() {
     return namaPasien_2025;
 }

 // setter nama pasien
 public void setNamaPasien_2025(String namaPasien_2025) {
     this.namaPasien_2025 = namaPasien_2025;
 }

 // getter penyakit
 public String getPenyakit_2025() {
     return penyakit_2025;
 }

 // setter penyakit
 public void setPenyakit_2025(String penyakit_2025) {
     this.penyakit_2025 = penyakit_2025;
 }

 // getter nomor antrian
 public int getNomorAntrian_2025() {
     return nomorAntrian_2025;
 }

 // setter nomor antrian
 public void setNomorAntrian_2025(int nomorAntrian_2025) {
     this.nomorAntrian_2025 = nomorAntrian_2025;
 }

 // getter pointer next
 public Pasien_2511532025 getNext_2025() {
     return next_2025;
 }

 // setter pointer next
 public void setNext_2025(Pasien_2511532025 next_2025) {
     this.next_2025 = next_2025;
 }
}
