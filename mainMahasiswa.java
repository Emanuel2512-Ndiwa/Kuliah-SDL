package SDL.array;

import java.util.*;

public class mainMahasiswa {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);

        queueMahasiswa mhs = new queueMahasiswa();
        mhs.enqueue(new Mahasiswa("Agnes Vivia", "235314103", "Eletro Medis", "Jambi"));
        mhs.enqueue(new Mahasiswa("Rogan dahlia", "235314104", "Eletro ", "Bali"));
        mhs.enqueue(new Mahasiswa("Putri Ayu", "235314105", "Msin", "Jogja"));
        mhs.enqueue(new Mahasiswa("Putra Loy", "235314106", "Infor", "Jakarta"));
        mhs.cetak();
        System.out.println();
        System.out.println("Watu Di Deque");
        System.out.println(mhs.dequeue());
        System.out.println(mhs.dequeue());
        System.out.println(mhs.dequeue());
        System.out.println(mhs.dequeue());
    }
}
