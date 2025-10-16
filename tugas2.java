import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tipeVec, jam;
        int pMobil = 3000, pMotor = 2000, parkir = 12500;
        int bayar = 0, totalBayar = 0;

        do {
            System.out.print("Masukkan jenis kendaraan (1: Mobil, 2: Motor, 0: Keluar): ");
            tipeVec = sc.nextInt();

            if (tipeVec == 0) {
                System.out.println("Program selesai. Terima kasih!");
                break;
            }

            if (tipeVec == 1 || tipeVec == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                jam = sc.nextInt();

                if (jam > 5) {
                    bayar = parkir;
                } else if (tipeVec == 1) {
                    bayar = jam * pMobil;
                } else if (tipeVec == 2) {
                    bayar = jam * pMotor;
                }

                totalBayar += bayar; // tambahkan ke total keseluruhan
            } else {
                System.out.println("Jenis kendaraan tidak didukung, Tolong Input Ulang");
            }

        } while (tipeVec != 0);

        System.out.println("\nTotal Pembayaran Parkir Hari ini: Rp " + totalBayar);
    }
}