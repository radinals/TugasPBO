package soal7;

import java.util.ArrayList;

public class Main {
	private static void isiData(ArrayList<Integer> data) {
		int n = 6; for(int i = 0; i < 5; i++) { data.add(n); n*=2; }
	}

	private static void printData(ArrayList<Integer> data) {
		System.out.println(data);
	}

	public static void main(String[] args) {
		ArrayList<Integer> data = new ArrayList<Integer>();
		isiData(data);
		printData(data);
	}
}
