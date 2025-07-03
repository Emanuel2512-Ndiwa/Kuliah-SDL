package SDL.array;

import SDL.stack;

public class mainStack {
    public static void main(String[] args) {

        stack s = new stack();
        System.out.println("==========================");
        System.out.println("\tSelamat Datang Di Stack");
        System.out.println();
        s.push(23);
        s.push(45);
        s.push(56);

        System.out.println("Ukuran\t:" + s.size() + "\t" + " ==>");
        s.cetak();

        if (s.pop() == -1) {
            System.out.println("Data sudah habis");
        } else {
            System.out.println("Ukuran\t:" + s.size());
            s.cetak();
        }

        int e = s.pop();

        if (s.isEmpty()) {
            System.out.println("Data Sudah Habis");
        } else {
            System.out.println("Ukuran\t:" + s.size());
            s.cetak();
        }

        s.push(56); 
        if (s.pop() == -1) {
            System.out.println("data sudah habis");
        } else {
            System.out.println("Ukuran : " + s.size() + " => ");
            s.cetak();

        }

        if (s.pop() == -1) { // 9
            System.out.println("data sudah habis");
        } else {
            System.out.println("Ukuran : " + s.size() + " => ");
            s.cetak();
        }
        System.out.println();
        System.out.println();

        System.out.println("Berikut Isi Dari Stack Anda");

        s.cetak();

    }

}
