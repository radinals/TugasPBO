package soal4;

public class Kucing extends Hewan {
	@Override
	public void makan() {
		System.out.println(nama + " sedang makan");
	}
	
	public void display() {
		System.out.println("nama: " + nama);
	}
}
