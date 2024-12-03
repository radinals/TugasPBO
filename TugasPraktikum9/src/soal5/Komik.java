package soal5;

public class Komik extends Produk {
	int halaman;
	public Komik(String judul, String penulis, int halaman) {
		super(judul, penulis);
		this.halaman = halaman;
	}

	@Override
	public void getInfoProduk() {
		System.out.println("Halaman: " + halaman);
		super.getInfoProduk();
	}
}
