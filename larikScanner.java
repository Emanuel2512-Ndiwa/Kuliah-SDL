package SDL.aray;

import java.util.Scanner;

public class larikScanner {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);

        // di sini saya membuat class baru yang berfungsi untuk menerima inputan nilai
        // array dari user
        System.out.println("____________________________________________________________________");
        System.out.println("Berikut Nilai Array Berdasarkan Inputan User");
        System.out.println("____________________________________________________________________");

        int[] nilai = new int[10];
        // mendeklarasikan aray dan menginisiasikan panjangnya

        input Input = new input();
        // membuat objek dari kelas input
        // kelas input berisi method untuk looping memasukan nilai array

        // mengakses method bernilai dari kelas input menggunakan objek
        // method bernilai ini berfungsi unutuk membaca nilaiarray yang dimasukan user
        Input.berinilai(nilai);

        // mengakses method cetak dari kelas Larik menggunakan objek
        // method dari kelas larik ini berfungsi unutuk mencetak tabel isi array dari
        // setiap index dimulai dari 0

        Larik larik = new Larik();
        larik.cetak(nilai);

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int nilaiDicari = masuk.nextInt();

        int hasilSequential = larik.sequential_search(nilai, nilaiDicari);
        if (hasilSequential != -1) {
            System.out.println("Pencarian Sequential\t: Data ditemukan di indeks \t:" +hasilSequential);
        } else {
            System.out.println("Pencarian Sequential: Data tidak ditemukan");
        }

        int hasilBinary = larik.binarysearch(nilai, nilaiDicari);
        if (hasilBinary != -1) {
            System.out.println("Pencarian Binary\t: Data ditemukan di indeks\t: " +hasilBinary);
        } else {
            System.out.println("Pencarian Binary: Data tidak ditemukan");
        }

        int hasilInterpolasi = larik.interpolasi(nilai, nilaiDicari);
        if (hasilInterpolasi != -1) {
            System.out.println("Pencarian Interpolasi\t: Data ditemukan di indeks\t: " + hasilInterpolasi);
        } else {
            System.out.println("Pencarian Interpolasi: Data tidak ditemukan");
        }

    }
}
