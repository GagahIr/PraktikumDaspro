import java.util.Scanner;

public class Pemilihan2Percobaan2_10 {
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);

        String member;
        int jumlah_beli, menu, harga = 0;
        double total_bayar = 0, diskon = 0;

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Rice + Ice Tea)");
        System.out.println("------------------------------------------");
        System.out.print("Masukkan angka dari menu yang dipilih = ");
        menu = input10.nextInt();
        System.out.println("Apakah punya member (y/n) ? = ");
        member = input10.next();
        System.out.println("------------------------------------------");

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);
            } else if (menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);
            } else if (menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + total_bayar);
        } else if (member.equalsIgnoreCase("n")) {
            if (menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);
            } else if (menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);
            } else if (menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            System.out.println("Total bayar = " + harga);
        }

    }
}
