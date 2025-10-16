import java.util.Scanner;
public class tugas1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = 1, jmltiket = 0, jmlpel, tiket;
    int harket = 50000;
    double pendapatan = 0, totalpen = 0;

    System.out.print("Jumlah Pelanggan Hari Ini: ");
    jmlpel = sc.nextInt();

    while (i <= jmlpel) {
    System.out.print("Berapa Tiket yang dibeli oleh Pelanggan ke " + i + ":" );
    tiket = sc.nextInt();
    if (tiket <= 0) {
        System.out.println("Tolong Input Ulang");
        continue;
    }
    
    if (tiket > 10) {
        pendapatan =(tiket * harket) - ((tiket * harket) * 0.15);
    } else if (tiket > 4) {
        pendapatan = (tiket * harket) - ((tiket * harket) * 0.10);
    } else {
        pendapatan = tiket * harket;
    }
    totalpen += pendapatan;
    jmltiket += tiket;
    i++;
    }
    System.out.println("Jadi Total Tiket Yang Dibeli Hari ini Sebanyak: " + jmltiket);
    System.out.println("Jumlah Pendapatan Hari ini Sebanyak: RP " + totalpen);

    }
}
