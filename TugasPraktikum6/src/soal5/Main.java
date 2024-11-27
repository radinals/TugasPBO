package soal5;

public class Main {
	public static void printHello(Integer n) {
		if(n > 0) {
			System.out.println("HELLO");
			printHello(--n);
		}
	}
	public static void main(String[] args) {
		printHello(5);
	}
}