import java.util.Scanner;

public class Queue {
    public static void main(String[] args) throws Exception {
        System.out.println("Author \t: Muhammad Harley Adinama");
        System.out.println("NIM \t: 1811521004");

        System.out.println("....::Program Antrian (Queue)::....");
        
        Scanner input = new Scanner(System.in);
        boolean bool = true;

        System.out.printf("Masukan Ukuran/Panjang Antrian : ");
        int ukuran = input.nextInt();

        int[] queue = new int[ukuran];
        int count = 0;

        do {
            System.out.println("\n===Pilih Menu Antrian===");
            System.out.println("1. Tampilkan Queue");
            System.out.println("2. Tambahkan Elemen Queue(Push)");
            System.out.println("3. Hapus Elemen Queue(Pop)");
            System.out.println("4. Bersihkan Queue");
            System.out.println("5. Exit");

            System.out.printf("Menu Dipilih : ");
            int menu = input.nextInt();
            System.out.println("======================================\n");
            int data;
            switch (menu) {
                case 1:
                    for (int i = 0; i<ukuran; i++) {
                        System.out.println("Elemen ke "+i+" dalam Queue/Antrian : "+queue[i]);    
                    }
                    System.out.println("======================================\n");
                    break;
                
                case 2:
                    System.out.printf("Masukan elemen yang ingin ditambahkan : ");
                    try {
                        data = input.nextInt();
                        queue[count] = data;
                        count++;    
                    } catch (Exception e) {
                        System.out.println("Masukan berupa angka");
                    }
                    System.out.println("======================================\n"); 
                    break;
                
                case 3:
                    for (int i = 0; i < ukuran-1; i++) {
                        queue[i] = queue[i+1];
                    }
                    ukuran = ukuran-1;
                    System.out.println("Elemen awal sudah dihapus dari Queue/Antrian"); 
                    System.out.println("======================================\n");
                    break;
                
                case 4:
                    ukuran=0;
                    System.out.println("Queue/Antrian dikosongkan");
                    System.out.println("======================================\n");
                    break;
                default:
                    break;
            }
        } while (bool=true);

    }
}
