package soal3;

import soal5.Produk;

public class Main {
	public static void main(String[] args) {
		Produk komik = new Komik("Blablabla", "PenulisKomik", 100);
		Produk game = new Games("gsdfsdf", "PenulisGame?", 3);
		
		komik.getInfoProduk();
		game.getInfoProduk();
	}
}
