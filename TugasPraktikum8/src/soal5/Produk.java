package soal5;

public class Produk {
	public String judul;
	public String penulis;

	public Produk(String judul, String penulis) {
		this.judul = judul;
		this.penulis = penulis;
	}

	public void getInfoProduk() {
		System.out.println("Judul: " + judul);
		System.out.println("Penulis: " + penulis);
	}
}
