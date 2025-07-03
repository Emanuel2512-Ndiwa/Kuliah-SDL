package SDL.SDL.array;

public class bandingArray {

    public static int binarysearch(int[] bacadata, int datacari) {
        int index_awal = 0;
        int index_akhir = bacadata.length - 1;
        while (index_awal <= index_akhir) {
            int indek_tengah = (index_awal + index_akhir) / 2;
            if (((Comparable) bacadata[indek_tengah]).compareTo(datacari) == 0) {
                System.out.println("\tHasil Index ke\t" + indek_tengah);
                return indek_tengah;
            } else if (bacadata[indek_tengah] < datacari) {
                index_awal = indek_tengah + 1;
            } else {
                index_akhir = indek_tengah - 1;
            }
        }
        return -1;
    }
    public static int interpolasi(int[] data, int cari) {
        int index_awal = 0;
        int index_akhir = data.length - 1;
        while (index_awal <= index_akhir && data[index_awal] <= cari && data[index_akhir] >= cari) {
            int nilai_tengah = index_awal
                    + ((cari - data[index_awal]) * (index_akhir - index_awal)) / (data[index_akhir] - data[index_awal]);
            if (((Comparable) data[nilai_tengah]).compareTo(cari) == 0) {
               
               
                System.out.println("\tHasil Index ke\t" + nilai_tengah);
                return nilai_tengah;
            } else if (data[nilai_tengah] < cari) {
                index_awal = nilai_tengah + 1;
            } else {
                index_akhir = nilai_tengah - 1;
            }
        }
        return -1;
    }

    public static int sequential(int[] larik, int kunci) {
        for (int a = 0; a < larik.length; a++) {
            if (((Comparable) larik[a]).compareTo(kunci) == 0) {

              
              
                System.out.println("\tHasil Index ke\t" + a);
                return a;
            }
        }
        return -1;
    }

    void cetak(int[] array) {
        System.out.println("Tabel Index & Nilai Array");
        System.out.println("____________________________");
        // format dibawah ini berfungsi agar kita bisa membuat tabel dengan rapih unutk
        // mencetak index dan
        // nilai array secara terpisah
        System.out.printf("%-3s%-10s%-3s%-10s%-3s%n", "|", "Index", "|", "Nilai", "|");
        System.out.println("----------------------------");
        // ini adalah looping untuk membaca data yang ada di dalam array yang sudah
        // dibuatkan
        // setiap kali looping berjalan
        // looping akan mencetak nilai array yang sudah tersiimpan di setiap index
        // dimulai dari index ke nol
        for (int a = 0; a < array.length; a++) {
            System.out.printf("%-3s%-10d%-3s%-10d%-3s%n", "|", a, "|", array[a], "|");
            // membaca indeks dimulai dari nol dan isi dari array
        }
        System.out.println("____________________________");
    }

}
