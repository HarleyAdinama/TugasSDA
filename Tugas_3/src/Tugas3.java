import java.util.LinkedList;

public class Tugas3 {
    public static void main(String[] args) throws Exception {
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

        //Menghapus data
        System.out.println("...::Menghapus data::...");
        System.out.println("Data awal alamat : "+alamat+" Ukuran : "+alamat.size());
        alamat.removeFirst();
        alamat.removeLast();

        System.out.println("Output alamat : "+alamat+" Ukuran : "+alamat.size());
        System.out.println("=============================\n");
        
    }
}
