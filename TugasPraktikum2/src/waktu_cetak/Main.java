package waktu_cetak;

import java.util.Scanner;

public class Main {
        
        public static void main(String[] args) {
                int jumlah_novel;
                int jumlah_halaman;
                int waktu_cetak;
                
                var sc = new Scanner(System.in);
                
                System.out.print("Masukan Jumlah Novel: ");
                jumlah_novel = sc.nextInt();
                
                System.out.print("Masukan Jumlah Halaman Novel: ");
                jumlah_halaman = sc.nextInt();
                
                waktu_cetak = jumlah_novel * jumlah_halaman;
                
                int hari;
                int jam;
                int menit;
                int detik;
                
                hari = waktu_cetak / 86400;
                waktu_cetak %= 86400;
                
                jam = waktu_cetak / 3600;
                waktu_cetak %= 3600l;
                
                menit = waktu_cetak / 60;
                waktu_cetak %= 60;
                
                detik = waktu_cetak;
                
                System.out.printf(
                        "Novel %d Halaman berjumlah %d buku,"
                                + " memerlukan waktu cetak sebesar %d hari,"
                                + " %d jam, %d menit, dan %d detik\n",
                        jumlah_halaman, jumlah_novel, hari,jam,menit,detik);
        }
}
