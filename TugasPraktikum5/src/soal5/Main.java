package soal5;

import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		while(true) {
			
			Integer baris, kolom;

			baris = inputAngka("Masukan Jumlah Baris: ");
			if (baris == null) continue;

			kolom = inputAngka("Masukan Jumlah Kolom: ");
			if (kolom == null) continue;
			
			System.out.println("Input Matrix A: ");
			int[][] a = inputMatrix(baris,kolom);
			printMatrix(a);

			System.out.println("Input Matrix b: ");
			int[][] b = inputMatrix(baris,kolom);
			printMatrix(b);

			System.out.println("Hasil Pertambahan a + b: ");
			printMatrix(pertambahanMatrix(a,b));
			
			System.out.print("Keluar (Y/T): ");
			String input = sc.nextLine();
			
			if (input.contains("Y")) break;
		}
		sc.close();
	}

	public static int[][] pertambahanMatrix(int[][] a, int[][] b) {
		int[][] c = new int[a.length][a.length];

		if (a.length == b.length) {
			for(int i = 0; i < a.length; i++) {
				for(int j = 0; j < a.length; j++) 
					c[i][j] = a[i][j] + b[i][j]; 
			}
		}
		return c;
	}

	public static void printMatrix(int[][] m) {
		for(int baris[] : m ) {
			for(int e : baris) 
				System.out.print(e + " ");
			System.out.println();
		}
	}

	public static int[][] inputMatrix(int baris, int kolom) {
		int m[][] = new int[baris][kolom];
		for(int i = 0 ; i < baris ; i++ )
			for(int j = 0 ; j <  kolom; j++ ) {
				while(true) {
					Integer angka = inputAngka("Angka: ");
					if(angka == null) {
						System.out.println("Inputkan Angka Saja!");
						continue;
					} else {
						m[i][j] = angka;
						break;
					}
				}
			}
		return m;
	}
	
	public static Integer inputAngka(String prompt) {
		Integer n;
		try {
			System.out.print(prompt);
			n = Integer.valueOf(sc.nextLine());
		} catch(NumberFormatException e) {
			return null;
		}
		return n;
	}
}
