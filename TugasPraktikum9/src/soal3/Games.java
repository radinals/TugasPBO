package soal3;

import soal5.Produk;

public class Games extends Produk {
	int waktuMain;
	public Games(String judul, String penulis, int waktuMain) {
		super(judul, penulis);
		this.waktuMain = waktuMain;
	}

	@Override
	public void getInfoProduk() {
		System.out.println("WaktuMain: " + waktuMain);
		super.getInfoProduk();
	}
}
