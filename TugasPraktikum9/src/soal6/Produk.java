package soal6;

public abstract class Produk {
	protected String judul;
	protected String penulis;

	public String getJudul() {
		return judul;
	}

	public void setJudul(String judul) {
		this.judul = judul;
	}

	public String getPenulis() {
		return penulis;
	}

	public void setPenulis(String penulis) {
		this.penulis = penulis;
	}

	public Produk(String judul, String penulis) {
		this.judul = judul;
		this.penulis = penulis;
	}

	public void getInfoProduk() {
		System.out.println("Judul: " + judul);
		System.out.println("Penulis: " + penulis);
	}
}
