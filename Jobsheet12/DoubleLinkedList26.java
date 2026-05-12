package Jobsheet12;

public class DoubleLinkedList26 {

    Node26 head;
    Node26 tail;

    public DoubleLinkedList26() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa26 data) {

        Node26 newNode = new Node26(data);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa26 data) {

        Node26 newNode = new Node26(data);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa26 data) {

        Node26 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        }

        Node26 newNode = new Node26(data);

        if (current == tail) {

            current.next = newNode;
            newNode.prev = current;
            tail = newNode;

        } else {

            newNode.next = current.next;
            newNode.prev = current;

            current.next.prev = newNode;
            current.next = newNode;
        }
    }

    public Mahasiswa26 removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak bisa dihapus!");
            return null;
        }
        System.out.println("Data berhasil dihapus:");
        head.data.tampil();
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        return head.data;
    }

    public Mahasiswa26 removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak bisa dihapus!");
            return null;
        }
        System.out.println("Data berhasil dihapus:");
        tail.data.tampil();
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        return tail.data;
    }

    public void print() {

        Node26 current = head;

        while (current != null) {

            current.data.tampil();

            current = current.next;
        }
    }
}