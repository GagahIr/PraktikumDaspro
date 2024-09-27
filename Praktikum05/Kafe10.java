import java.util.Scanner;

public class Kafe10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlah;
        String menu;
        boolean keanggotaan;
        char ukuranCup;

        System.out.println("Masukkan menu: ");
        menu = input.nextLine();

        System.out.println("Masukkan Ukuran cup : ");
        ukuranCup = input.next().charAt(0);

        System.out.println("Masukkan Jumlah :");
        jumlah = input.nextInt();

        System.out.println("Masukkan keanggotaan (true/false)");
        keanggotaan = input.nextBoolean();

        double hargaMenu = 0;

        switch (menu.toLowerCase()) {
            case "kopi":
                hargaMenu = 12000;
                break;
            case "teh":
                hargaMenu = 7000;
                break;
            case "coklat":
                hargaMenu = 20000;
                break;
        }
        double totalHarga = hargaMenu * jumlah;

        switch (ukuranCup) {
            case 'S':
                break;
            case 'M':
                totalHarga += 0.25 * totalHarga;
                break;
            case 'L':
                totalHarga += 0.4 * totalHarga;
                break;
            default:
                System.out.println("Ukuran cup yang dipilih tidak tersedia.");
                return;
        }
        

        double diskon = keanggotaan ? 0.1 : 0;
        double nominalBayar = totalHarga - (diskon * totalHarga);

        System.out.println("Item pembelian " + jumlah + " " + menu + " dengan ukuran cup " + ukuranCup);
        System.out.println("Nominal Bayar : " + nominalBayar);
    }
}
