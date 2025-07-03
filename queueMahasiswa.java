package SDL.array;

import java.util.NoSuchElementException;

public class queueMahasiswa {
    private Mahasiswa[] mahasiswa;
    private int depan;
    private int rear;
    private int size;

    public queueMahasiswa() {
        this(20); // Default ukuran 20
    }

    public queueMahasiswa(int ukuran) {{// construktor yang ke dua ini memiliki parameter fungsi dari parameter ini
        // adlaah memberikan variabel yang menentukan ukuran queue yang akan kita
        // gunakan jadi construktor yang kedua ini relatif fleksibel ukurannya belum di
        // tentukan defult
       //ini kita menginisiasi array dengna variabel di parameter construktor kita
       //kenapa kita masukan di dalam array ini karena semua data kita nanti kita
       // masukan di dlaam array unutk di proses
        mahasiswa = new Mahasiswa[ukuran];
        depan = 0;
        rear = 0;
        size = 0;
    }
}

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean enqueue(Mahasiswa elemen) {
        if (size < mahasiswa.length) { // Cek apakah masih ada ruang kosong di dalam array
            mahasiswa[rear] = elemen; // Tambahkan elemen pada posisi rear
            rear = (rear + 1) % mahasiswa.length; // Geser rear ke posisi berikutnya
            size++; // Tambahkan ukuran queue
            return true; // Penambahan berhasil
        } else {
            System.out.println("=== Ruangan Queue Sudah Penuh ===");
            return false; // Penambahan gagal karena queue penuh
        }
    }

    public Mahasiswa dequeue() {
        if (!isEmpty()) { // Cek apakah queue tidak dalam keadaan kosong
            Mahasiswa hapus = mahasiswa[depan]; // Simpan nilai elemen yang akan dihapus
            depan = (depan + 1) % mahasiswa.length; // Geser front ke posisi berikutnya
            size--; // Kurangi ukuran queue
            return hapus; // Kembalikan nilai elemen yang dihapus
        } else {
            throw new NoSuchElementException("Queue kosong");
        }
    }
    //method ini unutk menampilkan semua nilai yang ada di dalam queue
    public void cetak() {
        if (isEmpty()) {
            System.out.println("Queue kosong");
            return;
        }
        System.out.println("Isi Queue:");
        int index = depan;
        for (int count = 0; count < size; count++) {
            System.out.println(mahasiswa[index]);
            index = (index + 1) % mahasiswa.length;
        }
    }
}
