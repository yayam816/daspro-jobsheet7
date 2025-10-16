    import java.util.Scanner;
    public class SiakadFor26 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0;
        int tl = 0;

        for (int i = 1; i <=10; i++) {
            System.out.print("Masukkan Nilai Mahasiswa " + i + ":" );
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }

            if (nilai <= 60) {
            tl++;
            } else {
                lulus++;
            }
            }
            System.out.println("Nilai Tertinggi adalah " + tertinggi);
            System.out.println("Nilai Terendah adalah " + terendah);
            System.out.println("Banyaknya Siswa yang Lulus adalah " + lulus + " Anak");
            System.out.println("Banyaknya Siswa yang Tidak Lulus adalah " + tl + " Anak");

        }
    }