import java.util.Scanner;

public class PemilihanHariDenganIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int bil;

        System.out.println("Masukkan bilangan");
        bil = input.nextInt();

        if (bil >= 1 && bil <=5) {
            System.out.println("Weekday");
        } else if (bil == 6 || bil == 7) {
            System.out.println("weekend");
        } else{
            System.out.println("Invalid");
        }
        
    }

}