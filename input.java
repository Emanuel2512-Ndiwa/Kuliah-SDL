package array.SDL;

//import class scanner
import java.util.Scanner;
import java.util.Arrays;
//membuat sebuah class dengan nama input
public class input {

    // membuat method tanpa nilai balikan dengan nama bernilai dan memiliki
    // parameter
    // parameternya bertipe integer dan merupakan array
     void berinilai(int[] array) {
        // membuat objek scanner
        Scanner masuk = new Scanner(System.in);

        // kita membuat looping ini unutk membaca nilai yang dimasukan oleh user
        // nilai yang dimasukan kemudian di simpan ke dalam array menggunakan looping
        for (int a = 0; a < array.length; a++) {
            System.out.print("Masukan Nilai Array Ke-" + (a + 1) + "\t:");
            // menyimpan nilai kedalam array dari index ke nol
            array[a] = masuk.nextInt();
           
        }
        Arrays.sort(array);
        // program yang ada di kelas larik ini bellum bisa di jalankan
        // kelas ini akan menjalankan tugasnya ketika memanggil method main dan membuat
        // objek
        // dari kelas ini agar kita bisa mengakses atribut-atribut yang ada di kelas ini
    }

}
