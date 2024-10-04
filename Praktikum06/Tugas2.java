import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String jenisBuku;
        int jumlahBuku;
        double hargaPerBuku = 0;
        double diskon = 0.0;

        System.out.print("Masukkan jenis buku (kamus/novel/lainnya): ");
        jenisBuku = input.nextLine().toLowerCase();
        System.out.print("Masukkan jumlah buku: ");
        jumlahBuku = input.nextInt();

        if (jenisBuku.equals("kamus")) {
            hargaPerBuku = 10000;
            diskon = 0.10;
            if (jumlahBuku > 2) {
                diskon += 0.02;
            }
        } else if (jenisBuku.equals("novel")) {
            hargaPerBuku = 20000;
            diskon = 0.07;
            if (jumlahBuku > 3) {
                diskon += 0.02; 
            } else if (jumlahBuku <= 3) {
                diskon += 0.01;
            }
        } else {
            hargaPerBuku = 15000;
            if (jumlahBuku > 3) {
                diskon = 0.05;
            }
        }

        double totalHarga = hargaPerBuku * jumlahBuku;
        double totalDiskon = totalHarga * diskon;
        double totalBayar = totalHarga - totalDiskon;

        System.out.println("Total harga sebelum diskon: Rp " + totalHarga);
        System.out.println("Total yang harus dibayar: Rp " + totalBayar);
    }
}
