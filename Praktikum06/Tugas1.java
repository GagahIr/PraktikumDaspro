import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);

        int bil1, bil2, bil3;

        System.out.println("Masukkan bil 1");
        bil1 = input10.nextInt();
        System.out.println("Masukkan bil 2");
        bil2 = input10.nextInt();
        System.out.println("Masukkan bil 3");
        bil3 = input10.nextInt();

        if (bil1 > bil2) {
            if (bil1 > bil3) {
                System.out.println("Bilangan terbesar adalah: " + bil1);
            } else {
                System.out.println("Bilangan terbesar adalah: " + bil3);
            }
        } else {
            if (bil2 > bil3) {
                System.out.println("Bilangan terbesar adalah: " + bil2);
            } else {
                System.out.println("Bilangan terbesar adalah: " + bil3);
            }
        }
    }
}
