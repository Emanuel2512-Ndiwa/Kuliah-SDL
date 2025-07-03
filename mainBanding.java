package SDL.array;

import java.util.*;

public class mainBanding {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        int[] array = { 12, 34, 45, 3, 1, 33, 787, 9, 0, 100 };
        // mengurutkan array menggunakan kelas arrays
        Arrays.sort(array);
        System.out.println("Data Array");
        bandingArray obj = new bandingArray();
        obj.cetak(array);
        System.out.println();
        // System.out.println("==== Input ====");
        System.out.println();
        System.out.print("Masukan Angka Yang  Di Cari\t:");
        int angka = masuk.nextInt();
        System.out.println();
        // System.out.println("==== Output ====");
        System.out.println();
        System.out.println("\tOOP Binary ");

        int binary = bandingArray.binarysearch(array, angka);

        if (binary == -1) {
            System.out.println("Data Yang Anda Cari Tidak Ada");
        }

        Larik larik = new Larik();
        int binarysearch = larik.binarysearch(array, angka);

        // System.out.println("-----------------------------------");
        if (binarysearch != -1) {
            System.out.println("\t\t==> Binary Search Biasa");
            System.out.println("\t\tHasil Index ke\t" + binarysearch);
        } else {
            System.out.println("Data Yang Anda Cari Tidak Ada");
        }
        // System.out.println("-----------------------------------");
        System.out.println("\tOOP Sequential");

        int sequen = bandingArray.sequential(array, angka);

        if (sequen == -1) {
            System.out.println("Data Yang Anda Cari Tidak Ada");
        }

        Larik objk = new Larik();
        int seku = objk.sequential_search(array, angka);

        // System.out.println("-----------------------------------");

        if (seku != -1) {
            System.out.println("\t\t==> Sequential Search Biasa");
            System.out.println("\t\tHasil Index ke\t" + seku);
        } else {
            System.out.println("Data Yang Anda Cari Tidak Ada");
        }
        System.out.println("\tOOP Interpolasi\t ");
        int inter = bandingArray.interpolasi(array, angka);
        if (inter == -1) {
            System.out.println("Data Yang Anda Cari Tidak Ada");
        }
        // System.out.println("-----------------------------------");
        int interpol=objk.interpolasi(array,angka);
        if (interpol != -1) {
            System.out.println("\t\t==> Interpolasi Search Biasa");
            System.out.println("\t\tHasil Index ke\t" +interpol);
        } else {
            System.out.println("Data Yang Anda Cari Tidak Ada");

    }

}
}