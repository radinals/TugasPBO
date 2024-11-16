package soal7;

import soal8.ThreadPrint;

public class Main {
	public static void main(String[] args) {
		
		ThreadPrint t = new ThreadPrint("Hello", 1000);
		t.start();

	}
}
