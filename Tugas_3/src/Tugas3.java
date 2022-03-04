import java.util.LinkedList;
import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) throws Exception {
        System.out.println("\nAuthor : Muhammad Harley Adinama");
        System.out.println("NIM : 1811521004");

        //Membuat variabel linkedlist
        LinkedList<String> nim = new LinkedList<>();
        LinkedList<String> nama = new LinkedList<>();
        LinkedList<String> alamat = new LinkedList<>();

        //Menambah elemen
        System.out.println("...::Menambah elemen dan hitung ukuran::...");
        nim.add("1811521004");
        nim.add("1811522004");
        nim.add("1811523004");

        nama.add("Harley");
        nama.add("Annisa");
        nama.add("Fandy");

        alamat.add("Solok");
        alamat.add("Pariaman");
        alamat.add("Jambi");

        System.out.println("Output NIM : "+nim+" Ukuran : "+nim.size());
        System.out.println("Output nama : "+nama+" Ukuran : "+nama.size());
        System.out.println("Output alamat : "+alamat+" Ukuran : "+alamat.size());
        System.out.println("=============================\n");

        //Menyisipkan data
        System.out.println("...::Menyisipkan data::...");
        System.out.println("Data awal NIM : "+nim+" Ukuran : "+nim.size());
        nim.add(1, "2011522004");
        nim.add(2, "2111522004");
        nim.add(4, "2111522004");

        System.out.println("Output NIM : "+nim+" Ukuran : "+nim.size());
        System.out.println("=============================\n");

        //Mengganti data
        System.out.println("...::Mengganti data::...");
        System.out.println("Data awal nama : "+nama+" Ukuran"+nama.size());
        nama.set(0, "Harley Adinama");
        nama.set(2, "Fandy Akbar");

        System.out.println("Output nama : "+nama+" Ukuran : "+nama.size());
        System.out.println("=============================\n");

        //Menghapus data
        System.out.println("...::Menghapus data::...");
        //First dan Last
        System.out.println("Data awal alamat : "+alamat+" Ukuran : "+alamat.size());
        alamat.removeFirst();
        alamat.removeLast();

        System.out.println("Output alamat : "+alamat+" Ukuran : "+alamat.size());

        //Berdasarkan index
        System.out.println("\nData awal NIM : "+nim+" Ukuran : "+nim.size());
        nim.remove(1);
        nim.remove(3);

        System.out.println("Output NIM : "+nim+" Ukuran : "+nim.size());

        //Hapus semua elemen
        System.out.println("\nData awal NIM : "+nim+" Ukuran : "+nim.size());
        nim.clear();

        System.out.println("Output NIM : "+nim+" Ukuran : "+nim.size());
        System.out.println("=============================\n");

        //Pengecekan apakah linkedlist kosong
        System.out.println("...::Cek elemen linkedlist::...");
        //Cek LinkedList Nama
        Boolean cekNama = nama.isEmpty();
        if (cekNama) {
            System.out.println("Elemen LinkedList Nama Kosong");
        }else{
            System.out.println("LinkedList Nama memiliki "+nama.size()+" elemen");
        }

        //Cek LinkedList NIM
        Boolean cekNim = nim.isEmpty();
        if (cekNim) {
            System.out.println("Elemen LinkedList NIM Kosong");
        } else {
            System.out.println("LinkedList NIM memiliki "+nim.size()+" elemen");
        }

        //Cek LinkedList Alamat
        Boolean cekAlamat = alamat.isEmpty();
        if (cekAlamat) {
            System.out.println("Elemen LinkedList Alamat Kosong");
        } else {
            System.out.println("LinkedList Alamat memiliki "+alamat.size()+" elemen");
        }
        System.out.println("=============================\n");

        //Mengambil elemen dalam LinkedList
        System.out.println("...::Ambil elemen berdasarkan index::...");
        //Berdasarkan index
        System.out.println("Elemen nama saat ini adalah : "+nama+" Ukuran : "+nama.size());
        System.out.println("Elemen nama pada index 0 adalah : "+nama.get(0));
        System.out.println("Elemen nama pada index 0 adalah : "+nama.get(1));
        System.out.println("Elemen nama pada index 0 adalah : "+nama.get(2));

        //First dan Last
        System.out.println("\nElemen nama saat ini adalah : "+nama+" Ukuran : "+nama.size());
        System.out.println("Elemen nama pada index awal adalah : "+nama.getFirst());
        System.out.println("Elemen nama pada index awal adalah : "+nama.getLast());

        System.out.println("=============================\n");
        
        //Push dan Pop
        System.out.println("...::Fungsi Push dan Pop::...");
        System.out.println("Elemen nama saat ini adalah : "+nama+" Ukuran : "+nama.size());
        
        do {  
            Scanner input = new Scanner(System.in);
            
                //Masukan data yang akan dioperasikan
                System.out.printf("Masukan elemen(Nama) yang akan dioperasikan pada LinkedList Nama : ");
                String tempData = input.nextLine();

                //Membuat pilihan menu dan membuat fungsi pop dan push
                Scanner pilih = new Scanner(System.in);
                System.out.println("..:Pilih Fungsi:..");
                System.out.println("1. Fungsi Push");
                System.out.println("2. Fungsi Pop");
                System.out.println("3. Exit");

                System.out.printf("Menu dipilih : ");
                int menu = pilih.nextInt();
                switch (menu) {
                    case 1:
                        System.out.printf("Pada index ke : ");
                        int indexData = input.nextInt();

                        nama.add(indexData, tempData);
                        System.out.println("Maka data saya menjadi : "+nama);
                        break;
            
                    case 2:
                        nama.remove(tempData);
                        System.out.println("Maka data saya menjadi : "+nama);
                        break;

                    case 3:
                        System.exit(0);
                    default:
                        break;
                }  
            System.out.println("=============================\n");
        } while (true);
    }
}
