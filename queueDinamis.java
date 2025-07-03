package SDL.array;

import java.util.LinkedList;
import java.util.NoSuchElementException;

//ini adlaah kelas queue dinakmis yang dimana semua prosesnya kita menggunakan array list
//ditakatan dinamis karena fleksibelitasnya kita tidak perlu memberikan nilai defult unutk panjangnya 
//karena seiring berjalannya program jika kita ingin memasukan data baru maka akan otomatis ruang penyimpanannya bertambah
public class queueDinamis {

    private LinkedList<Integer> antrian; // LinkedList untuk menyimpan elemen-elemen dalam queue

    // Constructor untuk membuat queue kosong
    // di dalam contruktor ini kita menginisiasi array list kita dan ingin
    // memberitahukan bahwa di awal pertma akali construktor ini di panggil maka
    // belum ada data yang tersimpan di dalam array list
    public queueDinamis() {
        antrian = new LinkedList<>();
    }

    // Method untuk menambahkan elemen baru ke dalam queue
    // construk ini memiliki fungsi menambahkan panjang queue yang akan kita gunakan
    // panjangnnya itu sesuai nilai yang di masukan di dlama variebl parameternya
    // dan kemudian kita menambahkannya di dalam array list menggunakan fungsi yang
    // sudha di sediakan di dalam arry list yaitu add dengan metode ini maka panjang
    // array akan sesuai nilai variabel yang di amsukan di dlaam parameter ini
    // tetapi bisa di tambahkan seriring berjalannya waktu
    public void enqueue(int elemen) {
        antrian.addLast(elemen);
    }

    // Method untuk menghapus dan mengembalikan elemen dari depan queue
    // method ini unutk menghapus dat ayyang ada di deque sebelum melakukan
    // penghapusan kita terlebih dahulu melakukan pengecekan apakah sudah ada data
    // atau belum jika datanynys kosong maka tidak akan melakukan penghapusan tetapi
    // memberikan informasi bahwa data kosong
    // car amelakukan pengecekannya adlaah dengna menggunakan percabangan if else
    public int dequeue() {
        if (!isEmpty()) {
            return antrian.removeFirst();
        } else {
            throw new NoSuchElementException("Queue kosong"); // Queue kosong, tidak ada elemen yang bisa dihapus
        }
    }

    // Method untuk mendapatkan jumlah elemen dalam queue
    // untuk mendapatkan ukuran queue kita memberikan informasi dari variabel size
    // dengna melakukan return sehingga return ini bisa dilakukan karena kita
    // menggunakan method yang memiliki tipe data
    public int size() {
        return antrian.size();
    }

    // Method untuk mengecek apakah queue kosong atau tidak
    //method is empy ini meberikan informasi bahwa queue ini kosong
    public boolean isEmpty() {
        return antrian.isEmpty();
    }
}
