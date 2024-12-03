package soal4;

public class Main {

	public static void main(String[] args) {
		Kasir a = new Kasir(10000);
		Kasir b = new Kasir(10000,10);
		Kasir c = new Kasir(10000,5000, 10);
		
		System.out.println("A: ");
		System.out.println(a);
		System.out.println("B: ");
		System.out.println(b);
		System.out.println("C: ");
		System.out.println(c);
	}

}
