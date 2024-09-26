import java.util.Scanner;

public class PemilihanBilangan10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angka;
        System.out.println("Masukkan Angka");
        angka = input.nextInt();

        String hasil = angka % 2 == 0 ? "Bilangan genap" : "Bilangan ganjil";
        System.out.println(hasil);
        input.close();

        
    }

}