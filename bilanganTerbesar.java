import java.util.Scanner;
public class bilanganTerbesar {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);
        
        int bil1, bil2, bil3, max;

        System.out.println("Masukan bilangan 1 : ");
        bil1 = input13.nextInt();
        System.out.println("Masukan bilangan 2 : ");
        bil2 = input13.nextInt();
        System.out.println("Masukan bilangan 3 : ");
        bil3 = input13.nextInt();

        if (bil1 > bil2) {
            if (bil1 > bil3) {
                max = bil1;
            } else {
                max = bil3;
            }
         } else if (bil1 > bil3) {
            if (bil2 > bil3);
                max = bil2;
         } else {
            max = bil3;
         }
        
         System.out.println("Bilangan terbesar adalah: " + max);
    }
}