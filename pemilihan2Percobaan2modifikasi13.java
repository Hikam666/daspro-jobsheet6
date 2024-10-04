import java.util.Scanner;
public class pemilihan2Percobaan2modifikasi13 {

    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        String menu;
        String member;
        String pembayaranQris;
        int jumlah_beli;
        int total_bayar = 0;
        int harga = 0;
        double diskon = 0.10;
        int potonganQris = 1000;

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Kopi");
        System.out.println("2. Teh");
        System.out.println("3. Roti");
        System.out.println("-------------------------");
        System.out.print("Masukkan angka dari menu yang dipilih: ");
        menu = input13.nextLine();
        System.out.print("Apakah punya member (y/n)? ");
        member = input13.nextLine();
        System.out.print("Masukkan jumlah pembelian: ");
        jumlah_beli = input13.nextInt();
        input13.nextLine(); 
        System.out.print("Apakah pembayaran memakai QRIS (y/n)? ");
        pembayaranQris = input13.nextLine();
        System.out.println("-------------------------");

        
        if (menu.equals("1")) {
            harga = 12000;
        } else if (menu.equals("2")) {
            harga = 7000;
        } else if (menu.equals("3")) {
            harga = 20000;
        } else {
            System.out.println("Menu tidak valid");
            return;
        }

        if (member.equalsIgnoreCase("y")) {
            System.out.println("Diskon: 10%");
            total_bayar = (int) ((harga - (harga * diskon)) * jumlah_beli);
        } else {
            total_bayar = harga * jumlah_beli;
        }

        if (pembayaranQris.equalsIgnoreCase("y")) {
            System.out.println("Pembayaran dengan QRIS dipotong Rp. 1.000");
            total_bayar -= potonganQris; 
        }

        System.out.println("Total yang harus dibayar Rp.: " + total_bayar);
    }
}

