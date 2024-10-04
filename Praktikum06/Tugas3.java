import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String merk, kategori = "";
        int ukuran, harga = 0;

        System.out.print("Masukkan merek sepatu (Converse/Skecher/Nike): ");
        merk = input.nextLine();
        if (merk.equalsIgnoreCase("Nike")) {
            System.out.print("Masukkan kategori sepatu (Kids/Adult): ");
            kategori = input.next();
        } else if (merk.equalsIgnoreCase("Skecher")) {
            System.out.print("Masukkan kategori sepatu (Woman/Man): ");
            kategori = input.next();
        } else if (merk.equalsIgnoreCase("Converse")) {
            System.out.print("Masukkan kategori sepatu (Slip On/High Top): ");
            kategori = input.nextLine();
        } 
        

        System.out.print("Masukkan ukuran sepatu: ");
        ukuran = input.nextInt();

        if (merk.equalsIgnoreCase("Converse")) {
            if (kategori.equalsIgnoreCase("Slip On") && ukuran >= 36 && ukuran <= 40) {
                harga = 800000;
            } else if (kategori.equalsIgnoreCase("High Top") && ukuran >= 40 && ukuran <= 44) {
                harga = 1200000;
            } else {
                System.out.println("Kategori atau ukuran tidak tersedia untuk Converse.");
            }
        } else if (merk.equalsIgnoreCase("Skecher")) {
            if (kategori.equalsIgnoreCase("Woman") && ukuran >= 36 && ukuran <= 41) {
                harga = 1000000;
            } else if (kategori.equalsIgnoreCase("Man") && ukuran >= 41 && ukuran <= 44) {
                harga = 1800000;
            } else {
                System.out.println("Kategori atau ukuran tidak tersedia untuk Skecher.");
            }
        } else if (merk.equalsIgnoreCase("Nike")) {
            if (kategori.equalsIgnoreCase("Kids") && ukuran >= 36 && ukuran <= 40) {
                harga = 750000;
            } else if (kategori.equalsIgnoreCase("Adult") && ukuran >= 40 && ukuran <= 44) {
                harga = 1500000;
            } else {
                System.out.println("Kategori atau ukuran tidak tersedia untuk Nike.");
            }
        } else {
            System.out.println("Merek tidak tersedia.");
        }

        if (harga > 0) {
            System.out.println("Harga sepatu: Rp " + harga);
        }

    }
}
