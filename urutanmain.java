package SDL.array;

import java.util.Arrays;

public class urutanmain {

    public static void main(String[] args) {

        // mendeklarasikan dan membuat object dari kelas urutan nama objectnya input
        urutan input = new urutan();

        //membuat variabel array dengan tipe data integer dan menginisiasinya 
        int[] array = {5, 8, 26, 15, 11, 31,7,40,23,25};
        System.out.println("  Data Array Yang Belum Di Urut");
        System.out.println("------------------------------------");
        // looping untuk mencetak data array ,data ini masih belum di urutkan 
        for (int a = 0; a < array.length; a++) {
            System.out.println("\t" + array[a]);
        }
        System.out.println("-------------------------------------");
        System.out.println("Data Yang Diurutkan Secara Ascending");
        System.out.println("-------------------------------------");
        // System.out.println();
        // System.out.println("    Buble Short");
        // System.out.println("----------------------");

        //mengakses method buble short menggunakan object dari kelas urutan 
        //data di urutkan dari yang terkecil
        input.buble(array);
        //looping untuk mencetak nilai dalam array yang sudah di urutkan
        //menggunakan method buble short
        // for (int a = 0; a < array.length; a++) {
        // System.out.println("\t" + array[a]);
        // }
        // System.out.println("---------------------");
        // System.out.println();
        // System.out.println("     Selection");
        // System.out.println("---------------------");

        //mengakses method selection dari kelas urutan menggunakan object dari kelas urutan
        //data diurtukan dari yang terkecil
        input.selection(array);
        //looping untuk mencetak nilai array yang sudah di urutkan menggunakan 
        //method selection 
        // for (int a = 0; a < array.length; a++) {
        // System.out.println("\t" + array[a]);

        // }
        System.out.println("---------------------");
        System.out.println();
        System.out.println("       Insection");
        System.out.println("---------------------");
        //mengakses method insectionA unutk mengurutkan data dari yang terkecil ke terbesar
        input.insertionSortA(array);
        for (int a = 0; a < array.length; a++) {
            System.out.println("\t" + array[a]);
        }
        System.out.println();
        System.out.println("---------------------");
        System.out.println("     Quick Sort");
        System.out.println("------------------");
        //mengakses method quick sort langsung menggunakan nama kelas
        //kita bisa melakukannya begitu karena method kita bersifat static
        //lalu kit amengisikan semua parameter yang di perlukan di dlaam method ini
        //unutuk panjang array yang kita isikan di dalam parameter harus di kurangi satu
        //karena looping kita dimulai dari index array ke nol  
        urutan.QuickSort(array, 0, array.length - 1);
        //setelah data di urutkan kita langsung bisa melihat hasil dari data yang sudah diurutkan 
        //menggunakan looping 
        for (int a = 0; a < array.length; a++) {
            System.out.println("\t" + array[a]);
        }
        System.out.println("---------------------");
        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println("Data Yang Diurutkan Secara Descending");
        System.out.println("---------------------------------------");
        System.out.println();
        System.out.println("    Buble short");
        System.out.println("---------------------");
        //mengakses method bubledes short menggunakan object dari kelas urutan 
        //data di urutkan dari yang terbesar
        input.bubledes(array);
        //looping untuk mencetak nilai array yang sudah di urutkan menggunakan 
        // method bubledes
        for (int a = 0; a < array.length; a++) {
        System.out.println("\t" + array[a]);
        }
        System.out.println("---------------------");
        System.out.println();
        System.out.println("     Selection ");
        System.out.println("---------------------");

        //mengakses method bubledes short menggunakan object dari kelas urutan 
        //data di urutkan dari yang terbesar
        input.selectiondes(array);
        //looping untuk mencetak nilai array yang sudah di urutkan menggunakan 
        //method selectiondes
        for (int a = 0; a < array.length; a++) {
        System.out.println("\t" + array[a]);
        }

        System.out.println();
        System.out.println("---------------------");
        System.out.println("     Insection");
        System.out.println("------------------");
        //mengakses method insertion menggunakan object input dari kelas urut 
        //mengurutkan data dari yang terbesar 
        input.insertionSort(array);
        //looping ini digunakan unnutk menampilkan hasil pengurutan dari method insertion

        System.out.println();
        System.out.println("---------------------");
        System.out.println("     Quick Sort ");
        System.out.println("------------------");
        //ini adalah mengakses method quick sort yang akan mengurutkan data secara descending
        //untuk pengisian nilai parameternya masih tetap sama 
        //dan setelah itu juga kita akan melakukan looping
        urutan.QuickSortt(array, 0, array.length - 1);

        for (int a = 0; a < array.length; a++) {
            System.out.println("\t" + array[a]);
        }
        
        System.out.println("-----------------");

        //membuat array dengan tipe data integer dan nama random data
        //lalu menginisiasi array datarandom ini 1000_000
        int[] randomdata = new int[100000];
        //membuat looping untuk mengakses Method random dari index ke 0 
        //dan angka randomnnya itu rentagan ,0-1000_000,
        for (int a = 0; a < randomdata.length - 1; a++) {
            randomdata[a] = (int) (Math.random() * 1000);

        }
        //membuat variabel baru array dengan tipe integer tujuannya untuk menyalin semua nilai 
        //dari method data random  ke variabel array baru ini yang nantinya digunakan untuk method bubleshort dan selection short dan inssection short
        int[] salinandatarandom = Arrays.copyOf(randomdata, randomdata.length - 1);

        //membuat sebuah variabel unutk menyimpan method nano time
        //method nano time kita letakan di awal dan di akhir setelah memanggil method bubleshort ataupun method selection ataupun isection
        //tujuannya agar kita bisa mendapatkan lama waktu yang di butuhkan
        //karena method nano time yang diletakan di awal 
        //itu sebelum method looping di jalankan istilah kita menginisiasi waktu awalnya
        //lalu waktu di akhir adalah waktu yang dibutuhkan setelah looping berakhir 
        //sehingga unutk mencari lamanya waktu kita mengurangkan waktu akhir dengan waktu awal
        long waktumulai= System.nanoTime();

        // urutan.QuickSort(salinandatarandom,0,salinandatarandom.length-1);
       
        urutan.QuickSort(salinandatarandom,0,salinandatarandom.length-1);
        long waktuberakhir= System.nanoTime();

        long waktumulaii= System.nanoTime();
        urutan.QuickSortt(salinandatarandom,0,salinandatarandom.length-1);
        long waktuberakhii= System.nanoTime();

        long totalwaktuA = waktuberakhir- waktumulai;
        long toalwaktuB = waktuberakhii - waktumulaii;

        System.out.println("Waktu yang dibutuhkan Insection untuk mengurutkan data Ascending  adalah    \t:" + totalwaktuA + "\tNanosecon");
        System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.println("Waktu yang dibutuhkan Insection untuk mengurutkan data Descending adalah    \t:" + toalwaktuB + "  \tNanosecon");

    }

}
