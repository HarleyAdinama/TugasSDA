import java.util.LinkedList;
import java.util.Scanner;

public class Tugas_2 {
    public static void main(String[] args) throws Exception {
        System.out.println("------Tugas 2------");
        System.out.println("Author : Muhammad Harley Adinama");
        System.out.println("NIM : 1811521004");
        System.out.println("----------------\n");

        System.out.println("Membuat Linkedlist");
        //Membuat linkedlist
        LinkedList<String> saya = new LinkedList<>();

        //Tambahkan elemen
        saya.add("M");
        saya.add("U");
        saya.add("H");
        saya.add("A");
        saya.add("M");
        saya.add("M");
        saya.add("A");
        saya.add("D");
        saya.add(" ");
        saya.add("H");
        saya.add("A");
        saya.add("R");
        saya.add("L");
        saya.add("E");
        saya.add("Y");
        saya.add(" ");
        saya.add("A");
        saya.add("D");
        saya.add("I");
        saya.add("N");
        saya.add("A");
        saya.add("M");
        saya.add("A");

        System.out.println("Nama Saya : "+saya);
        System.out.println("----------------\n");

        System.out.println("Instruksi 1 - Tambah karakter yang diinginkan");
        //Tambahkan karakter yang diinginkan
        saya.addFirst("1004 ");
        saya.addLast("S.Kom");

        System.out.println("Nama Saya Sekarang : "+saya);
        System.out.println("----------------\n");

        System.out.println("Instruksi 2 - Sisipkan karakter");
        //Sisipkan karakter lain yang diinginkan
        saya.set(9, "Spasi");
        saya.set(16, "Spasi");

        System.out.println("Nama Saya Sekarang : "+saya);
        System.out.println("----------------\n");

        System.out.println("Instruksi 3 - Hapus karakter");
        //Hapus beberapa karakter
        saya.removeFirst();
        saya.removeLast();

        //Hapus berdasarkan index
        saya.remove(8);
        saya.remove(14);

        System.out.println("Nama Saya Sekarang : "+saya);
        System.out.println("----------------\n");

        System.out.println("Instruksi 4 - Fungsi Push dan Pop");
        //Fungsi Pop dan Push
        System.out.println("...::Fungsi push dan pop::...");

        //Membuat scanner untuk pilih menu
        try (Scanner input = new Scanner(System.in)) {
            //Masukan data yang akan dioperasikan
            System.out.printf("Masukan elemen : ");
            String tempData = input.nextLine();

            //Membuat pilihan menu dan membuat fungsi pop dan push
            System.out.println("..:Pilih Fungsi:..");
            System.out.println("1. Fungsi Push");
            System.out.println("2. Fungsi Pop");
            System.out.println("3. Exit");

            System.out.printf("Menu dipilih : ");
            int menu = input.nextInt();
            switch (menu) {
                case 1:
                    System.out.printf("Pada index ke : ");
                    int indexData = input.nextInt();

                    saya.add(indexData, tempData);
                    System.out.println("Maka data saya menjadi : "+saya);
                    break;
            
                case 2:
                    saya.remove(tempData);
                    System.out.println("Maka data saya menjadi : "+saya);
                    break;
                case 3:
                    System.exit(0);
                default:
                break;
            }
        }


    }
}
