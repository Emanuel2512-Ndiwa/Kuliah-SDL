package SDL.array;

public class List {
    private Node head;
    private int size;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public List() {
        head = null;
        size = 0;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public void removeFirst() {
        if (head != null) {
            head = head.next;
            size--;
        } else {
            throw new IllegalStateException("Tidak Bisa Menghapus Data Yang Sudah Kosong");
        }
    }

    public void removeLast() {
        if (head != null) {
            if (head.next == null) {
                head = null;
            } else {
                Node current = head;
                while (current.next.next != null) {
                    current = current.next;
                }
                current.next = null;
            }
            size--;
        } else {
            throw new IllegalStateException("Tidak Bisa MEnghaous Data Yang Sudah Kosong ");
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.data).append(" ");
            current = current.next;
        }
        return sb.toString().trim();
    }

    public boolean search(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public static void main(String[] args) {
        List list = new List();

        // Tambahkan data
        list.addFirst(8);
        list.addFirst(15);
        list.addLast(26);
        list.addLast(14);

        // Cari data sebelum menghapus
        System.out.println("Mencari data 14: " + list.search(14));

        // Hapus data dengan try-catch untuk menangkap exception jika ada
        try {
            list.removeLast();
            list.removeLast();
            list.removeFirst();
            list.removeFirst();
            list.removeFirst(); // Ini akan menangkap exception karena list sudah kosong
        } catch (IllegalStateException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // Cetak isi list
        list.print();
        System.out.println("Size Dari List Yang Kita Punya : " + list.size());
        System.out.println("Apakah List Empty? " + list.isEmpty());
        System.out.println("Isi List\t: " + list.toString());

    }
}
