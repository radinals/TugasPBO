package soal2;

import java.util.Scanner;

public class Main {

	private static int hitungKeliling(int s) {
		return s * 4;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Sisi: ");
		int sisi = sc.nextInt();
		System.out.println("Keliling: " + hitungKeliling(sisi));
		sc.close();
	}
}
