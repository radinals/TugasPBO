package soal6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		boolean run = true;
		while(run) {
			System.out.println(arr);
			System.out.print("Input Angka (Ketik 'Exit' untuk keluar): ");
			String input = sc.nextLine();
			try {
				if (input.toLowerCase().equals("exit")) {
					System.out.println("Keluar...");
					run = false;
				}else {
					arr.add(Integer.valueOf(input));
				}
			} catch (Exception e) {
				System.out.println("Input Error!");
			}
		}

		int total = 0;
		for(int n: arr)
			total+=n;

		System.out.println("Rata-rata: " + (float)total / arr.size());

		sc.close();
	}
}
