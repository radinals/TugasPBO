package tugas7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	static Scanner sc;
	
	private static int inputAngka(String prompt) {
		int n = 0;
		while(true) {
			try {
				System.out.print(prompt);
				n = sc.nextInt();
				
				if (n < 0) 
					throw new NegativeNumberException();

				break;

			} catch ( InputMismatchException e) {
				System.err.println("Hanya Masukan Nilai Ankga!");
				continue;
			} catch (NegativeNumberException e) {
				System.err.println("Hanya Masukan Hanya Angka Positif");	
				continue;
			} catch (Exception e) {
				System.err.println("Terjadi Erorr: " + e); 
				continue;
			} finally {
				sc.nextLine();
				System.out.println();
			}
		}
		return n;
	}
	
	public static void main(String[] args) {
		Integer x, y;
		
		sc = new Scanner(System.in);
		
		while(true) {

			x = inputAngka("Input X: ");
			y = inputAngka("Input y: ");

			try {
				System.out.printf("hasil (%d / %d) adalah %d\n", x, y, x/y);
				break;
			} catch (ArithmeticException e) {
				System.err.println("Pembagian Dengan 0 Dilarang");
				continue;
			} finally {
				System.out.println();
			}
		}
		
		sc.close();
	}
}
