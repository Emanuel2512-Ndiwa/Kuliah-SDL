package SDL.array;

import java.util.Queue;

public class queueMain {
    public class QueueTester {
        public static void main(String[] args) {
            // Uji kelas queue dengan struktur data dinamis
            // dan mengakses method enqueue dan dequeue untuk memasukan data-data int ini kedalam queue
            // yang kita punya
            queueDinamis antrianDinamis = new queueDinamis();
            antrianDinamis.enqueue(26);
            antrianDinamis.enqueue(15);
            antrianDinamis.enqueue(8);
            antrianDinamis.enqueue(14);
            System.out.println("----------------------------------------------------");
            System.out.println("Queue Dinamis");
            System.out.println(antrianDinamis.dequeue());
            System.out.println(antrianDinamis.dequeue());
            System.out.println(antrianDinamis.dequeue());
            System.out.println(antrianDinamis.dequeue());

            // Uji kelas queue dengan struktur data statis
            // dan mengakses method enqueue dan dequeue untuk memasukan data-data int ini kedalam queue
            // yang kita punya
            queueStatis antrianStatis = new queueStatis(7);
            antrianStatis.enqueue(26);
            antrianStatis.enqueue(15);
            antrianStatis.enqueue(8);
            antrianStatis.enqueue(14);
            System.out.println("----------------------------------------------------");
            System.out.println(" Queue Statis");
            System.out.println(antrianStatis.dequeue());
            System.out.println(antrianStatis.dequeue());
            System.out.println(antrianStatis.dequeue());
            System.out.println(antrianStatis.dequeue());

        }
    }

}
