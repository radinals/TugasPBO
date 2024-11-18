package soal8;

import java.util.Scanner;

import soal7.ThreadPrint;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukan Jumlah Thread: ");
		int jmlh_thread = sc.nextInt();
		ThreadPrint t[] = new ThreadPrint[jmlh_thread];
		for(int i = 0; i < jmlh_thread; i++)  t[i] = new ThreadPrint("Hello", 100 * i);
		for(ThreadPrint tp : t)  tp.start();
		sc.close();
	}
}
