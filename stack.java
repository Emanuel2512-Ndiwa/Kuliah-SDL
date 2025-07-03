package SDL;

//membuat class dengan nama stack
public class stack {
    // calss stack ini memiliki 3 atribut dengan acses modifiernya bertipe private
    // semua
    // dan di kelas stack ini memiliki 7 method dengan 2nya adalah construktor dan 5
    // lainya method unutk operasi stack
    private int[] elemen;// membuat sebuat array bertipe integer dan bernama elemen
    private int front;// membuat variabel front dengan tipe data integer
    private int size;// membuat variabel size dan bertie integer

    // array elemen ini berfungsi unutk menyimpan semua data stack yang programer
    // masukan ataupun user yang memasukannya
    // variabel front berfungsi sebagai variabel yang menunjukan posisi teratas dari
    // stac atau (Top)
    // variabel size ini berfungsi unutk menyimpan ukuran yang di dapatkan melalui
    // user ataupun programer

    public stack() {// ini adalah construktor defult dari kelas stack yangn dimana di sini saya
                    // memberikan ukuran defultnya adalah 20
        // ketika kita membuat object dari kelas stack dan melakukan instansiasinya
        // menggunakan constructor yang ini maka ukuran stack yang kita miliki adalah 20
        // sebenarnya di dalam bahasa pemograman java secara defult construktor tanpa
        // parameter seperti ini tidak perlu di deklarasikan pun sudah ada
        // tinggal kita panggil saja
        // namun construktor secara defult yang di miliki java ketika di panggil tidak
        // memiliiki nilai defult stack sesuai yang kita inginkan
        // oleh karena itu kita perlu membuat nya secara manual
        // selain itu jika kita tidak membuatkan secara manual seperti ini dan hanya
        // membuat konstruktor yang memiliki parameter seperti yang kedua
        // maka konstruktor defult yang di sediakan java tersebut tidak dapat kita
        // gunakan oleh karen aitu kita membutuhkan overloading
        this(20);
    };

    public stack(int ukuran) {// ini adalah overloding dari construktor pertama yang dimana ini digunakan jika
                              // ingin menentukan ukuran sesuai keingingan kita
        // kita dapat menggunakann construktor yang ini ketika kita tidak mau
        // menggunakan ukuran defult dari construktor pertama
        // dan juga ketika kita ingin mendapatkan ukuran dari stack itu dari user
        // ,sesuai keinginan user berapa jumlah ukurannya

        this.elemen = new int[ukuran];// ini adalah proses diaman variabel elemen (yang dimana elemen adalah array)
                                      // menerima dan menyimpan nilai baru
        // sebagai panjang ukuran array untuk menyimpan data ,yang nilainya di dapatkan
        // dari variabel di parameter construktor
        this.front = -1;// kita menginisiasi bahwa stack kita masih kosong (-1 artinya stack masih
                        // kosong)
        this.size = ukuran;// kita menginisiasi nilai variabel size dari nilai yang di dpaat melalui
                           // variabel ukuran
    };

    public boolean isEmpty() {// method ini memiliki fungsi sebagai pemeriksaan apakah stack kita ini kosong
        return (front < 0);// karena method ini memiliki tipe data maka perlu nilai balikan maka kita
                           // melakukan return
    }

    public boolean push(int angka) { // method push ini memiliki fungsi unutk melakukan push atau melakukan
                                     // penambahan nilai baru ke dalam stack yang kita punya
        // di dalam method ini kita membuatuhkan kondisi percabangan
        // kondisi percabangan ini berfungsi untuk melakukan pengecekan apakah stack
        // yang kit amiliki ini sudah penuh atau belum
        // jika stack kita sudah pebuh dan kita memaksakan unutk menambahkan nilai di
        // dalamnya maka akan terjadilah yang namanya overflow
        // yang dimana kita memaksa untuk memnambahkan nilai baru ke dalam stack yang
        // sudah penuh
        // agar tidak terjadi overflow ini kita mengantisipasinya dengan menggunakan
        // percabgangan
        // dan tidak lupa juga method yag kit abuat disini memiliki tipe data
        // karena itu kita butuh mengembalikan nilainya sesuai tipe data dari methodnya
        // cara mengembalikan nilainya menggunakan perintah return
        if (front >= (size - 1)) {// jika stack sudah penuh
            System.out.println(">> Overflow << \t--> Anda mencoba Menambahkan ");
            return false;// mengembalikan nilai false karena stack kita overflow/ stack kita sudah penuh
        } else {// jika stack masih memiliki ruang
            elemen[++front] = angka;
            System.out.println();
            System.out.println("==>  " + angka + "\tAngka Ini di push ke Stack");
            return true;// mengembalikan nilai true karena stack kit amasih meiliki ruangan
        }

    }

    public int pop() {// method ini berfungsi unutk melakukan pop(mengeluarkan nilai dari stack)
        // sama halnya seperti ingin melakukan push ,ketika kita ingin melakukan pop
        // kita terlebih dahulu melakukan pengecekan
        // kondisi stack apakah stack kosong atau tidak
        // caranya adlaah dengan menggunakan percabangan
        // jika kita tidak melakukan pengecekan terlebih dahulu apakah sebuah stack itu
        // kosong atau tidak,ketika kita ingin melakukan pop
        // dan ternayta stack kita kosong maka terjadilah yang namanya underflow(mencoba
        // melakukan pop pada stack kosong)
        if (front < 0) {// jika stack kosong
            System.out.println("Underflow ---> Mencoba menghapus stack kosong");
            return 0;
        } else {// jika stack masih memiliki data
            int x = elemen[front--];// membuat dan menginisiasi variabel x
            // nilai dari variabel x adalah variabel array elemen yang isi nilai arraynya
            // adalah variabel front yang dikurangi 1
            return x;
        }

    }

    public int size() {// method ini memiliki fungsi unutk menjumlahkan berapa isi stack yang kita
                       // miliki
        return front + 1;// method kita ini memiliki tipe data unutk itu kita butuh return
        // di sini kita mereturn penjumlahan front dengan satu setiap kali di panggil
        // nilai front akan terus di perbaharui
    }

    public void cetak() {// method untuk mencetak isi data stack kita
        // sebelum mencetak data stack kita
        // kita perlu melakukan pengecekan terebih dahulu apakah stack kita kosong atau
        // tidak
        // pengecekannya menggunakan method isEmpty yang kita miliki
        // method isempynya kita masukan sebagai kondisi saat pengecekan menggunakan
        // percabangan
        if (isEmpty()) {// jika kosong
            System.out.println("-------------------------");
            System.out.println("\tStack Anda Kosong");
        } else {// jika memiliki nilai
            System.out.println("--------------------------");
            System.out.println("Stack Anda Memiliki Isi");
            System.out.println();
            System.out.println("Berikut isi stack");
            for (int a = 0; a <= front; a++) {// untuk mendapatkan semua isi data dari stack yang kita miliki kita
                                              // membutuhkan looping
                // setiap kali looping berjalan dari iterasi ke satu maka kita mencetak nilai
                // stack yang di simpan di dalam array yang bernama elemen
                System.out.println(elemen[a] + "  ");
            }
            System.out.println();
        }
    }

}
