package soal6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> data = new ArrayList<>();
		while(true) {
			try {
				System.out.print("DATA: ");
				String input = scanner.nextLine();
				if (input.equals("EXIT")) {
					break;
				} else {
					data.add(Integer.valueOf(input));
				}
			} catch (Exception e) {
				continue;
			}
		}
		PenghitungRataRata rataRata = new PenghitungRataRata(data);
		System.out.println("Rata Rata: " + rataRata.hitungRataRata());
		scanner.close();
	}
}
