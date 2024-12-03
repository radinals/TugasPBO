package soal1;

public class Main {
	
	private static int hitungFaktorial(int n) {
		return (n == 0 || n == 1) ? 1 : n * hitungFaktorial(n-1);
	}

	public static void main(String[] args) {
		System.out.println("5! = " + hitungFaktorial(5));
	}

}
