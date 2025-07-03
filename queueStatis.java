package SDL.array;

import java.util.NoSuchElementException;

public class queueStatis {
    int[] element;
    int front;
    int rear;
    int size;

    public queueStatis() {// membuat construktor queue dan memberikan nilai defult nilai defult ini
                          // berfungsi unutk memberikan besar maksimum queue yang akan kita gunakan
                          // nilai defult ini tergantung dari kita yang memberikan dan jika kita memasukan
                          // data ke dlaam queue melebihi nilai defult ini maka queue akan memberikan info
                          // bahwa queue sudah penuh
        this(20);
    }

    public queueStatis(int ukuran) {// construktor yang ke dua ini memiliki parameter fungsi dari parameter ini
                                    // adlaah memberikan variabel yang menentukan ukuran queue yang akan kita
                                    // gunakan jadi construktor yang kedua ini relatif fleksibel ukurannya belum di
                                    // tentukan defult
        element = new int[ukuran];// ini kita menginisiasi array dengna variabel di parameter construktor kita
                                  // kenapa kita masukan di dalam array ini karena semua data kita nanti kita
                                  // masukan di dlaam array unutk di proses
        // pada saat pertama kali object kelas ini di buat kita menginisiasi nilai front
        // rear dan size nya 0 karena kita belum memasukan apa-apa ke dalam queue
        front = 0;
        rear = 0;
        size = 0;

    }

    // Method untuk mendapatkan jumlah elemen dalam queue
    // method ini memiliki tipe data oleh karena itu kita butuh return untuk
    // mengembalikan nilai sesuai tipe data dari method yang kita buatkan
    public int size() {
        return size;
    }

    // Method untuk mengecek apakah queue kosong atau tidak
    // method ini memiliki tipe data oleh karena itu kita butuh return untuk
    // mengembalikan nilai sesuai tipe data dari method yang kita buatkan
    public boolean isEmpty() {
        return size == 0;
    }

    // method ini memiliki tipe data oleh karena itu kita butuh return untuk
    // mengembalikan nilai sesuai tipe data dari method yang kita buatkan
    boolean enqueue(int elemen) {
        if (size < element.length) { // Cek apakah masih ada ruang kosong di dalam array
            element[rear] = elemen; // Tambahkan elemen pada posisi rear
            if (rear == element.length - 1) // Cek apakah rear sudah mencapai batas maksimum array
                rear = 0; // Jika ya, atur rear kembali ke awal array
            else
                rear++; // Jika tidak, geser rear ke posisi berikutnya
            size++; // Tambahkan ukuran queue
        } else {
            // Jika tidak ada ruang kosong, kembalikan false atau lakukan penanganan sesuai
            // kebutuhan
            System.out.println("=== Ruangan Queue Sudah Penuh ===");
        }
        return false;
    }

    int dequeue() {
        if (!isEmpty()) { // Cek apakah queue tidak dalam keadaan kosong
            int hapus = element[front]; // Simpan nilai elemen yang akan dihapus
            if (front == element.length - 1) // Cek apakah front sudah mencapai batas maksimum array
                front = 0; // Jika ya, atur front kembali ke awal array
            else
                front++; // Jika tidak, geser front ke posisi berikutnya
            size--; // Kurangi ukuran queue
            return hapus; // Kembalikan nilai elemen yang dihapus
        } else {
            // Jika queue kosong, lemparkan exception atau lakukan penanganan sesuai
            // kebutuhan
            throw new NoSuchElementException("Queue kosong");
        }
    }

}
