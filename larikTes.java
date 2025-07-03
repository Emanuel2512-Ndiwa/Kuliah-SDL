package SDL.array;

import java.util.Arrays;

public class larikTes {
    public static void main(String[] args) {
        // membuat objek secanner dengan nama masuk

        // mendeklarasikan dan menginisiasi array bertipe integer
        int[] array = { 12, 34, 45, 3, 1, 33, 787, 9, 0, 100 };

        // mengurutkan array menggunakan kelas arrays
        Arrays.sort(array);

        Larik lariks = new Larik();
        // membuat objek dari kelas Larik

        // mengakses method cetak dari kelas Larik menggunakan objek yang sudah kita
        // buat
        lariks.cetak(array);
      
        int banding = Larik.interPolasiAA(array, 3);
        if (banding!= -1) {
            System.out.println("Pencarian Menggunakan Interpolasi\t:" + banding);
        } else {
            System.out.println("Data Ynag Anda Cari Tidak Di Temukan");
        }

        // dalam kelas larik method interpolasi itu megembalikan nilai integer
        // maka pada saat kita ingin mengaksesnya menggunakan objek kita membuatuhkan
        // variabel baru bertipe integer untuk menyimpan nilai betipe integer yang di
        // pesan method ini
        // ketika variabel baru sudah kita buat dan deklarasikan di dalam variabel ini
        // kita mengakses method interpolasi menggunakan objek
        int interpolasi = lariks.interpolasi(array, 3);

        // membuat percabangan untuk memastikan bahwa nilai yang kita cari menggunakan
        // binary search,sequential search dan interpolasi
        // ada di dalam array yang kita punya atau tidak.
        // kondisi yang kita gunakan untuk memastikan bahwa suatu nilai yang kita cari
        // itu di temukan,jika method yang kita panggil
        // tidak mengembalikan nilai -1,jika mengembalikan nilai -1 maka nilai yang kita
        // cari di dalam array tidak ada
        if (interpolasi != -1) {
            System.out.println("Pencarian Menggunakan Interpolasi\t:" + interpolasi);
        } else {
            System.out.println("Data Ynag Anda Cari Tidak Di Temukan");
        }

        // memanggil method sequential menggunakan objek lariks
        // karena method ini megembalikan nilai bertipe integer maka
        // kita membuat variabel baru unutk mengembalikan nilai bertipe integer
        // variabel baru ini bersisikan objek yang mengakses method sequential
        int sequential_search = lariks.sequential_search(array, 34);
        if (sequential_search != -1) {
            System.out.println("Pencarian Menggunakan Sequential Search\t:" + sequential_search);
        } else {
            System.out.println("Dta Yang Anda Cari TIdak Di Temukan");
        }

        // membuat variabel baru bertipe integer dan di dalam variabel ini kita
        // mengakses method binary search menggunakan objek
        // kita membuat variabel baru karena method yang kita buat mengembalikan nilai
        // bertipe integer
        // untuk itu kita membutuhkan sebuah variabel unutk melaksanakan tugas itu
        int binarysearch = lariks.binarysearch(array, 34);

        // lalu untuk memastikan nilai yang kita cari kita membutuhkan percabangan
        // ketika binary search mengembalikan nilai -1
        // berarti nilai yang kita cari di dalam array tidak di temukan
        // namun jika sebaliknya maka nilai yang kit acari tedapat di dalam array
        if (binarysearch != -1) {
            System.out.println("Pencarian Menggunakan Binary Search\t:" + binarysearch);
        } else {
            System.out.println("Data Yang Anda Cari Tidak Di Temukan");
        }

    }
}
