package soal2;

public class Main {
	
	private static int hitungPangkat(int n, int exp) {
		int hasil = n;
		for (int i = 1; i < exp; i++, hasil*=n);
		return hasil;
	}

	public static void main(String[] args) {
		System.out.println("2^3 = " + hitungPangkat(2, 3));
	}

}
