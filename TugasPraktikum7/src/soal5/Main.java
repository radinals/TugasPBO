package soal5;

public class Main {
	
	public static void main(String[] args) {
		PersegiPanjang persegiPanjangBesar = new PersegiPanjang(5, 10);
		PersegiPanjang persegiPanjangKecil = new PersegiPanjang(4, 8);
		
		System.out.println(
			"Luas Bidang yang bewarna hitam = (luas pp.besar - luas pp.kecil) = " +
			(persegiPanjangBesar.getLuas() - persegiPanjangKecil.getLuas())
		);
	}

}
