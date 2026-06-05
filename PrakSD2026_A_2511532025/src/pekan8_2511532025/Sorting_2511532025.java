package pekan8_2511532025;

class Lagu_2025 {
    String judul_2025;
    String penyanyi_2025;
    int durasi_2025;

    public Lagu_2025(String judul_2025, String penyanyi_2025, int durasi_2025) {
        this.judul_2025 = judul_2025;
        this.penyanyi_2025 = penyanyi_2025;
        this.durasi_2025 = durasi_2025;
    }
}

public class Sorting_2511532025 {

    Lagu_2025[] dataLagu_2025 = new Lagu_2025[20];
    int jumlahData_2025 = 0;

    public void inputData_2025() {
        dataLagu_2025[jumlahData_2025++] =
        		new Lagu_2025("Risk It All", "Bruno Mars", 233);

        dataLagu_2025[jumlahData_2025++] =
        		new Lagu_2025("Never Let Go", "Cortis", 215);

        dataLagu_2025[jumlahData_2025++] =
        		new Lagu_2025("Superpower", "Daniel Caesar", 248);

        dataLagu_2025[jumlahData_2025++] =
                new Lagu_2025("Perfect", "Ed Sheeran", 263);

        dataLagu_2025[jumlahData_2025++] =
                new Lagu_2025("Photograph", "Ed Sheeran", 258);

        dataLagu_2025[jumlahData_2025++] =
                new Lagu_2025("Yellow", "Coldplay", 269);

        dataLagu_2025[jumlahData_2025++] =
        		new Lagu_2025("Let Me Go", "Daniel Caesar", 221);
    }

    public int partition_2025(int low_2025, int high_2025) {

        int pivot_2025 = dataLagu_2025[high_2025].durasi_2025;
        int i_2025 = low_2025 - 1;

        for (int j_2025 = low_2025; j_2025 < high_2025; j_2025++) {

            if (dataLagu_2025[j_2025].durasi_2025 < pivot_2025) {

                i_2025++;

                Lagu_2025 temp_2025 = dataLagu_2025[i_2025];
                dataLagu_2025[i_2025] = dataLagu_2025[j_2025];
                dataLagu_2025[j_2025] = temp_2025;
            }
        }

        Lagu_2025 temp_2025 = dataLagu_2025[i_2025 + 1];
        dataLagu_2025[i_2025 + 1] = dataLagu_2025[high_2025];
        dataLagu_2025[high_2025] = temp_2025;

        return i_2025 + 1;
    }

    public void quickSort_2025(int low_2025, int high_2025) {

        if (low_2025 < high_2025) {

            int pi_2025 = partition_2025(low_2025, high_2025);

            quickSort_2025(low_2025, pi_2025 - 1);
            quickSort_2025(pi_2025 + 1, high_2025);
        }
    }

    public void tampilData_2025() {

        for (int i_2025 = 0; i_2025 < jumlahData_2025; i_2025++) {

            System.out.println(
                    (i_2025 + 1) + ". "
                    + dataLagu_2025[i_2025].judul_2025
                    + " - "
                    + dataLagu_2025[i_2025].durasi_2025
                    + " detik");
        }
    }

    public static void main(String[] args) {

        Sorting_2511532025 obj_2025 =
                new Sorting_2511532025();

        obj_2025.inputData_2025();

        System.out.println("=== Sorting Playlist NIM: 2511532025 ===");

        System.out.println("\nData Sebelum Sorting:");
        obj_2025.tampilData_2025();

        obj_2025.quickSort_2025(
                0,
                obj_2025.jumlahData_2025 - 1);

        System.out.println(
                "\nData Setelah Quick Sort (Durasi Asc):");

        obj_2025.tampilData_2025();
    }
}
