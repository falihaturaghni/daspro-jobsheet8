import java.util.Scanner;

public class Tugas301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahToko;

        do {
            System.out.print("Masukkan jumlah toko (minimal 1): ");
            jumlahToko = sc.nextInt();

            if (jumlahToko < 1) {
                System.out.println("Jumlah toko tidak boleh kurang dari 1!");
            }
        } while (jumlahToko < 1);

        int totalBarangSemuaToko = 0;
        int tokoTerbanyak = 1;
        int barangTerbanyak = -1;

        for (int i = 1; i <= jumlahToko; i++) {
            int jumlahPelanggan;

            do {
                System.out.print("Masukkan jumlah pelanggan Toko " + i + ": ");
                jumlahPelanggan = sc.nextInt();

                if (jumlahPelanggan < 0) {
                    System.out.println("Jumlah pelanggan tidak boleh negatif!");
                }
            } while (jumlahPelanggan < 0);

            int totalBarangToko = 0;

            for (int j = 1; j <= jumlahPelanggan; j++) {
                int jumlahBarang;

                do {
                    System.out.print("Jumlah barang pelanggan " + j
                            + " di Toko " + i + ": ");
                    jumlahBarang = sc.nextInt();

                    if (jumlahBarang < 0) {
                        System.out.println("Jumlah barang tidak boleh negatif!");
                    }
                } while (jumlahBarang < 0);

                totalBarangToko += jumlahBarang;
            }

            System.out.println("Total pelanggan Toko " + i + ": "
                    + jumlahPelanggan);
            System.out.println("Total barang Toko " + i + ": "
                    + totalBarangToko);

            totalBarangSemuaToko += totalBarangToko;

            if (totalBarangToko > barangTerbanyak) {
                barangTerbanyak = totalBarangToko;
                tokoTerbanyak = i;
            }
        }

        System.out.println("================================");
        System.out.println("Total barang seluruh toko: "
                + totalBarangSemuaToko);
        System.out.println("Toko dengan barang terbanyak: Toko "
                + tokoTerbanyak);
        System.out.println("Jumlah barang terbanyak: " + barangTerbanyak);

        sc.close();
    }
}
