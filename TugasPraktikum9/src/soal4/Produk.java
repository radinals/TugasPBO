package soal4;

public class Produk {
	protected String judul;
	protected String penulis;

	public Produk(String judul, String penulis) {
		this.judul = judul;
		this.penulis = penulis;
	}

	public void getInfoProduk() {
		System.out.println("Judul: " + judul);
		System.out.println("Penulis: " + penulis);
	}
}
