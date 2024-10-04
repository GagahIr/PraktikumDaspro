import java.util.Scanner;


public class Pemilihan2Percoban1_10 {
    public static void main(String[] args) {

        Scanner input10 = new Scanner(System.in);
    
        int tahun;
    
        System.out.println("Masukkan Tahun");
        tahun = input10.nextInt();
    
        if (tahun % 4 == 0) {
            if ((tahun % 100) != 0 || tahun % 400 == 0) {
                System.out.println("Tahun Kabisat");
            } else {
                System.out.println("Bukan Tahun Kabisat");
            }
        } else {
            System.out.println("Bukan Tahun Kabisat");
    }
    }
}