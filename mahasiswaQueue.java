 package SDL.array;

import java.util.Scanner;//import kelas Scanner 

public class mahasiswaQueue {
    public static void main(String[] args) {
        queueMahasiswa mhs = new queueMahasiswa(4);// membuat object dari kelas queueMahasiswa dan menginisiasi
                                                   // parameter konstruktornya
        Scanner masuk = new Scanner(System.in);// membuat object dari kelas Scanner
        System.out.print("Masukan Banyaknya  Data Mahasiswa\t:");
        int banyak = masuk.nextInt();// membuat variabel baru bertipe data integer dan namanya banyak variabel ini
                                     // digunakan unutk menyimpan nilai yang di masukan user
                                     // selain itu variabel ini juga digunakan untuk nilai panjang array dari array
                                     // of object kelas mahasiswa sehingga banyaknya data mahasiswa di tentukan dari
                                     // banyaknya nilai variabel ini menerima nilai yang di masukan user
        Mahasiswa[] ma = new Mahasiswa[banyak];// membuat array of object dari kelas mahasiswa unutk menyimpan semua
                                               // data atribut dan method dari kelas mahasisswa
        System.out.println("----------- Lengkapi Data Mahasiswa ---------------");
        System.out.println("---------------------------------------------------");
        System.out.println();
        System.out.println();
        System.out.println();
        // dalam program yang saya buat ini daya ingin data mahasiswa yang di masukan
        // begitu banyak tidak dengna caara membuat object dari kelas mahasiswa secara
        // berulang lalu mengisikan datanya di konstruktor satu persatu oleh saya secara
        // defult di kodingan tetapi saya ingin data-datanya di dapatkan melalui user
        // atau pengguna
        // karena data yang akan kita terima lebih dari satu dan banyaknya data pasti
        // akan bervariasi maka saya menggunakan array of object dari kelas mahasiswa
        // dan menggunakan looping untuk mengiisikan setiap datanya sesuai panjang
        // arraydari kelas mahasiswa
        for (int a = 0; a < ma.length; a++) {
            masuk.nextLine();
            System.out.print("Nama\t:");
            String nama = masuk.nextLine();
            System.out.print("Nim\t:");
            String nim = masuk.nextLine();
            System.out.print("Prodi\t:");
            String prodi = masuk.nextLine();
            System.out.print("Alamat\t:");
            String alamat = masuk.nextLine();
            masuk.nextLine();
            ma[a] = new Mahasiswa(nama, nim, prodi, alamat);// semua data variabel yang menyimpan nilai atribut
                                                            // mahasiswa di masukan di dalam parameter konstruktor kelas
                                                            // mahasiswa
        }
        System.out.println("Mahasiswa Sebelum Di Deque");
        System.out.println("========================================================");
        for (Mahasiswa m : ma) {// menggunakan looping for each lalu menggunakan object queueMahasiswa memanggil
                                // method equeue
            mhs.enqueue(m);

        }
        mhs.cetak();// object dari kelas queueMahasiswa mengakses method cetak
        // cetakan isi queue yang pertama kali di akses ini menampilkan isi queue data
        // mahasiswa setelah di enqueue
        System.out.println();
        System.out.println();
        System.out.println("Mahasiswa Stelah Di Dequeue");
        System.out.println("========================================================");
        for (Mahasiswa m : ma) {//menggunakan looping for ech lagi un
            mhs.dequeue();
        }
        mhs.cetak();

    }

}
