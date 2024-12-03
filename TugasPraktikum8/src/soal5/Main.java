package soal5;

public class Main {
	public static void main(String[] args) {
		Produk komik = new Komik("Blablabla", "PenulisKomik");
		Produk game = new Games("gsdfsdf", "PenulisGame?");
		
		komik.getInfoProduk();
		game.getInfoProduk();
	}
}
