import java.util.Scanner;

public class SIAKAD10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama, nilaiHuruf, kualifikasi;
        int nilaiKuis, nilaiTugas, nilaiUjian, absen, nim;
        char kelas;

        System.out.println("Masukkan Nama");
        nama = input.nextLine();
        System.out.println("Masukkan NIM");
        nim = input.nextInt();
        System.out.println("Masukkan Kelas");
        kelas = input.next().charAt(0);
        System.out.println("Masukkan No Absen");
        absen = input.nextInt();
        System.out.println("Masukkan Nilai Kuis");
        nilaiKuis = input.nextInt();
        System.out.println("Masukkan Nilai Ujian");
        nilaiUjian = input.nextInt();
        System.out.println("Masukkan Nilai Tugas");
        nilaiTugas = input.nextInt();

        double nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
            kualifikasi = "Sangat baik";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
            kualifikasi = "Lebih dari baik";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
            kualifikasi = "Baik";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
            kualifikasi = "Lebih dari cukup";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
            kualifikasi = "Cukup";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
            kualifikasi = "Kurang";
        } else {
            nilaiHuruf = "E";
            kualifikasi = "Gagal";
        }

        System.out.println("Mahasiswa dengan nama " + nama + " (NIM " + nim + ")" + " kelas " + kelas + " nomor absen " + absen);
        System.out.println("Nilai Akhir huruf " + nilaiAkhir);
        System.out.println("Nilai Akhir huruf " + nilaiHuruf);
        System.out.println("Kualifikasi " + kualifikasi);
    }
}
