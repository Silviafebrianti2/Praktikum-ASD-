package Jobsheet12;

import java.util.Scanner;

public class DoubleLinkedListMain26 {

    public static Mahasiswa26 inputMahasiswa26(Scanner scan) {

        System.out.print("NIM   : ");
        String nim = scan.nextLine();

        System.out.print("Nama  : ");
        String nama = scan.nextLine();

        System.out.print("Kelas : ");
        String kelas = scan.nextLine();

        System.out.print("IPK   : ");
        double ipk = scan.nextDouble();
        scan.nextLine();

        return new Mahasiswa26(nim, nama, kelas, ipk);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        DoubleLinkedList26 list = new DoubleLinkedList26();

        int pilihan;

        do {

            System.out.println("===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan data di tengah (setelah NIM)");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Tampilkan data");
            System.out.println("0. Keluar");

            System.out.print("Pilih menu : ");

            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {

                case 1:

                    list.addFirst(inputMahasiswa26(scan));

                    break;

                case 2:

                    list.addLast(inputMahasiswa26(scan));

                    break;

                case 3:

                    System.out.print("Masukkan NIM yang dicari : ");
                    String keyNim = scan.nextLine();

                    Mahasiswa26 dataBaru = inputMahasiswa26(scan);

                    list.insertAfter(keyNim, dataBaru);

                    break;

                case 4:

                    Mahasiswa26 hapusAwal = list.removeFirst();

                    System.out.println("Data berhasil dihapus.");

                    if (hapusAwal != null) {
                        hapusAwal.tampil();
                    }

                    break;

                case 5:

                    Mahasiswa26 hapusAkhir = list.removeLast();

                    System.out.println("Data berhasil dihapus.");

                    if (hapusAkhir != null) {
                        hapusAkhir.tampil();
                    }

                    break;

                case 6:

                    list.print();

                    break;

                case 0:

                    System.out.println("Program selesai.");

                    break;

                default:

                    System.out.println("Menu tidak valid");
            }

        } while (pilihan != 0);

        scan.close();
    }
}