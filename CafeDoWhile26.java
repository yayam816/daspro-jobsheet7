import java.util.Scanner;
public class CafeDoWhile26 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int kopi, teh, roti, totalH;
    String namaP = "";
    int hk = 12000, ht = 7000, hr = 20000;
    do {
        System.out.print("Masukkan Nama Pelanggan (Ketik 'batal' untuk keluar): ");
        namaP = sc.nextLine();
        if (namaP.equalsIgnoreCase("batal")) {
            System.out.println("Transaksi Dibatalkan oleh Pelanggan");
            break;
        }
        System.out.print("Jumlah Kopi yang dipesan: ");
        kopi = sc.nextInt();
        System.out.print("Jumlah Teh yang dipesan: ");
        teh = sc.nextInt();
        System.out.print("Jumlah Roti yang dipesan: ");
        roti = sc.nextInt();
        totalH = (kopi * hk) + (teh * ht) + (roti * hr);
        System.out.println("Jadi Total yang harus dibayar adalah sebanyak: RP " + totalH);
        sc.nextLine();
    } while (true);
    System.out.println("Semua Transaksi Selesai");
    
    }
}
