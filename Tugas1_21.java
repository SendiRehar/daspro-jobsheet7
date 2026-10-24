import java.util.Scanner;
/**
 * Tugas21
 */
public class Tugas1_21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000;
        int jumlahTiket;
        double diskon, hargaAwal, totalBayar;
        int totalTiket = 0;
        double totalPenjualan = 0;

        
        do {
            System.out.print("Masukkan jumlah tiket yang dibeli pelanggan (0 untuk selesai): ");
            jumlahTiket = sc.nextInt();
 
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan lagi!");
                continue;
            }
            if (jumlahTiket == 0) {
                break;
            }
 
            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            } else {
                diskon = 0;
            }
 
            hargaAwal = jumlahTiket * hargaTiket;
            totalBayar = hargaAwal - (hargaAwal * diskon);
 
            System.out.printf("Harga awal : Rp %.0f%n", hargaAwal);
            System.out.printf("Diskon     : %.0f%%%n", diskon * 100);
            System.out.printf("Total bayar: Rp %.0f%n", totalBayar);
 
            totalTiket += jumlahTiket;
            totalPenjualan += totalBayar;
        } while (true);
 
        System.out.println("=== Rekap Penjualan Hari Ini ===");
        System.out.println("Total tiket terjual : " + totalTiket);
        System.out.printf("Total penjualan     : Rp %.0f%n", totalPenjualan);


        
    }
}