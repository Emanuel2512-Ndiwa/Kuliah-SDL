package SDL.array;

//import class scanner
import java.util.Arrays;

//membuat kelas larik
public class Larik {

    // membuat method dengan nama cetak yang memiliki parameter
    // tipe data dari parameter ini adalah integer dan menggunakan array
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

    // program yang ada di kelas larik ini bellum bisa di jalankan
    // kelas ini akan menjalankan tugasnya ketika memanggil method main dan membuat
    // objek
    // dari kelas ini agar kita bisa mengakses atribut-atribut yang ada di kelas ini

    // ini adalah method untuk mencari data dengan membandingkan data satu persatu
    // method ini memiliki tipe data integer dan memiliki dua parameter
    // parameter yang pertama integer array dan yang kedua integer
    public int sequential_search(int[] baca_data_array, int data_yg_dicari) {

        for (int a = 0; a < baca_data_array.length; a++) {
            if (baca_data_array[a] == data_yg_dicari) {
                return a;

            }

        }
        return -1;
    }

    // ini adalah method binary search
    // method ini memiliki nilai balikan integer dan memiliki dua parameter
    // parameternya berfungsi untuk membaca data yang di cari dan membaca data array
    // yang tersedia
    public int binarysearch(int[] bacadata, int datacari) {
        int index_awal = 0;
        int index_akhir = bacadata.length - 1;

        while (index_awal <= index_akhir) {
            int indek_tengah = (index_awal + index_akhir) / 2;

            if (bacadata[indek_tengah] == datacari) {
                return indek_tengah;
            } else if (bacadata[indek_tengah] < datacari) {
                index_awal = indek_tengah + 1;
            } else {
                index_akhir = indek_tengah - 1;
            }
        }
        return -1;
    }

    // method interpolasi method ini memiliki tipe data integer dan memiliki dua
    // parameter integer array dan integer
    public int interpolasi(int[] data, int cari) {
        int index_awal = 0;
        int index_akhir = data.length - 1;

        while (index_awal <= index_akhir && data[index_awal] <= cari && data[index_akhir] >= cari) {
            int nilai_tengah = index_awal
                    + ((cari - data[index_awal]) * (index_akhir - index_awal)) / (data[index_akhir] - data[index_awal]);

            if (data[nilai_tengah] == cari) {
                return nilai_tengah;
            } else if (data[nilai_tengah] < cari) {
                index_awal = nilai_tengah + 1;
            } else {
                index_akhir = nilai_tengah - 1;
            }
        }
        return -1;
    }

    public static int search(int x[], int key) {
        for (int i = 0; i < x.length; i++) {
            if (x[i] == key) {
                return i; // Objek ditemukan, kembalikan indeksnya
            }
        }
        return -1; // Objek tidak ditemukan
    }

    public static int interPolasiAA(int[] Larik, int kunci) {
        
        int low = 0, hight = Larik.length - 1;
        while (low <= hight) {
            int mid = low + ((kunci - Larik[low] * (hight - low) / Larik[hight] - Larik[low]));
            if (((Comparable) Larik[mid]).compareTo(kunci) == 0) {
                System.out.println("Interpolasi" + mid);
                return mid;
            } else if (kunci < Larik[mid]) {
                hight = mid - 1;

            } else {
                low = mid + 1;
            }

        }
        System.out.println("Tidak Di temukan");
        return -1;
    }
    public static int sequential(int []larik,int kunci){
        for(int a=0; a < larik.length;a++){
            if(((Comparable)larik[a]).compareTo(kunci)== 0 ){
                System.out.println("Sequential = "+ a);
                return a;
            }
        }
        return -1;
    }
    
}
