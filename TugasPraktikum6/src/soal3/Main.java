package soal3;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	
	public static String tebakTanggalLahir(int umur) {

	        // Get the current date
	        LocalDate tgl_sekarang = LocalDate.now();
	        int tahun_skrg  = tgl_sekarang.getYear();
	        int bulan_skrg  = tgl_sekarang.getMonthValue();
	        int tgl_skrg   = tgl_sekarang.getDayOfMonth();

	        // Calculate the birth year
	        int tahun_lahir = tahun_skrg - umur;
	        
	        return String.format("%d%d%d", tahun_lahir, bulan_skrg, tgl_skrg);

	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("MASUKAN UMUR:");
		int umur = sc.nextInt();
		
		System.out.println("HASIL: " + tebakTanggalLahir(umur));

		sc.close();
	}
}
