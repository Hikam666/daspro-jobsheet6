import java.util.Scanner;
public class pemilihan2Percobaan2_13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       String menu;
       String member;
       int jumlah_beli;
       int total_bayar = 0;
       int harga = 0;
       double diskon = 0.10;

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("Kopi");
        System.out.println("Teh");
        System.out.println("Roti");
        System.out.println("-------------------------");
        System.out.println("masukan angka dari menu yang dipilih = ");
        menu = input.nextLine();
        System.out.println("Apakah punya member (y/n) ? = ");
        member = input.nextLine();
        System.out.println("Masukkan jumlah pembelian: ");
        jumlah_beli = input.nextInt();
        System.out.println("-------------------------");
        
        if (menu.equals("Kopi")) {
            harga = 12000;
        } else if (menu.equals("Teh")) {
            harga = 7000;
        } else if (menu.equals("Roti")) {
            harga = 20000;
        }
        

        if (member.equalsIgnoreCase("y")) {
            System.out.println("Diskon: 10%");
            total_bayar = (int) ((harga - (harga * diskon)) * jumlah_beli);
        } else {
            total_bayar = harga * jumlah_beli;
        }

        System.out.println("Total yang harus dibayar: " + total_bayar);

    }
    
}
