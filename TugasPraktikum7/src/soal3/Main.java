package soal3;

public class Main {
	
	private static String konverterBiner(int n) {
		String biner = "" ;
		while(n > 0) {
			biner = (n % 2) + biner;
			n /= 2;
		}
		return biner;
	}

	public static void main(String[] args) {
		System.out.println("5 di biner: " + konverterBiner(5));
	}
}
