import java.util.Scanner;
public class pemilihan2Percobaan1modifikasi1_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tahun;
        System.out.println("Masukan Tahun: ");
        tahun = input.nextInt();
        if ((tahun % 4) == 0) {
            if ((tahun % 100) == 0) {
                if ((tahun % 400) == 0) {
                System.out.println("Tahun kabisat");
            } else {
                System.out.println("Bukan tahun kabisat");
            }
        } else {
            System.out.println("Tahun kabisat");
        } 
    } else {
        System.out.println("Bukan tahun kabisat");
    }
}
} 