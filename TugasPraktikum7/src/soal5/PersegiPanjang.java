package soal5;

public class PersegiPanjang {
	private int panjang, lebar;
	
	public PersegiPanjang(int panjang, int lebar) {
		this.panjang = panjang;
		this.lebar = lebar;
	}
	
	public int getLuas() {
		return panjang * lebar;
	}
}
