import java.util.Scanner;

public class tokoSepatu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String merk, kategori;
        int ukuran;

        System.out.print("Masukkan Merk (Converse, Sketcher, Nike): ");
        merk = sc.nextLine().toLowerCase();

        if (merk.equals("converse")) {
            System.out.print("Masukkan Kategori (Slip On/High Top) : ");
            kategori = sc.nextLine().toLowerCase();

            if (kategori.equals("slip on")) {
                System.out.print("Masukkan ukuran (36-40) : ");
                ukuran = sc.nextInt();

                if (ukuran >= 36 && ukuran <= 40) {
                    System.out.println(String.format("Sepatu %s kategori %s ukuran %d berharga Rp. 800.000", merk, kategori, ukuran));
                } else {
                    System.out.println("Maaf ukuran tidak tersedia");
                }

            } else if (kategori.equals("high top")) {
                System.out.print("Masukkan ukuran (40-44) : ");
                ukuran = sc.nextInt();

                if (ukuran >= 40 && ukuran <= 44) {
                    System.out.println(String.format("Sepatu %s kategori %s ukuran %d berharga Rp. 1.200.000", merk, kategori, ukuran));
                } else {
                    System.out.println("Maaf ukuran tidak tersedia");
                }

            } else {
                System.out.println("Kategori tidak tersedia");
            }

        } else if (merk.equals("sketcher")) {
            System.out.print("Masukkan Kategori (Woman/Man) : ");
            kategori = sc.nextLine().toLowerCase();

            if (kategori.equals("woman")) {
                System.out.print("Masukkan ukuran (36-41) : ");
                ukuran = sc.nextInt();

                if (ukuran >= 36 && ukuran <= 41) {
                    System.out.println(String.format("Sepatu %s kategori %s ukuran %d berharga Rp. 1.000.000", merk, kategori, ukuran));
                } else {
                    System.out.println("Maaf ukuran tidak tersedia");
                }

            } else if (kategori.equals("man")) {
                System.out.print("Masukkan ukuran (41-44) : ");
                ukuran = sc.nextInt();

                if (ukuran >= 41 && ukuran <= 44) {
                    System.out.println(String.format("Sepatu %s kategori %s ukuran %d berharga Rp. 1.800.000", merk, kategori, ukuran));
                } else {
                    System.out.println("Maaf ukuran tidak tersedia");
                }

            } else {
                System.out.println("Kategori tidak tersedia");
            }

        } else if (merk.equals("nike")) {
            System.out.print("Masukkan Kategori (kids/adult) : ");
            kategori = sc.nextLine().toLowerCase();

            if (kategori.equals("kids")) {
                System.out.print("Masukkan ukuran (36-40) : ");
                ukuran = sc.nextInt();

                if (ukuran >= 36 && ukuran <= 40) {
                    System.out.println(String.format("Sepatu %s kategori %s ukuran %d berharga Rp. 750.000", merk, kategori, ukuran));
                } else {
                    System.out.println("Maaf ukuran tidak tersedia");
                }

            } else if (kategori.equals("adult")) {
                System.out.print("Masukkan ukuran (40-44) : ");
                ukuran = sc.nextInt();

                if (ukuran >= 40 && ukuran <= 44) {
                    System.out.println(String.format("Sepatu %s kategori %s ukuran %d berharga Rp. 1.500.000", merk, kategori, ukuran));
                } else {
                    System.out.println("Maaf ukuran tidak tersedia");
                }

            } else {
                System.out.println("Kategori tidak tersedia");
            }

        } else {
            System.out.println("Merk tidak tersedia");
        }
    }
}
