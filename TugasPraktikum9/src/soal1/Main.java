package soal1;

public class Main {

	public static void main(String[] args) {

		Bentuk bangun_bujur_sangkar = new BujurSangkar(10);
		Bentuk bangun_persegi_panjang = new PersegiPanjang(10,5);
		Bentuk bangun_segitiga = new Segitiga(13, 3);
		Bentuk bangun_lingkaran = new Lingkaran(30);

		System.out.printf("BujurSangkar: L = %.2f\n", bangun_bujur_sangkar.getLuas());
		System.out.printf("Persegi Panjang: L = %.2f\n", bangun_persegi_panjang.getLuas());
		System.out.printf("Segitiga: L = %.2f\n", bangun_segitiga.getLuas());
		System.out.printf("Lingkaran: L = %.2f\n", bangun_lingkaran.getLuas());

	}
}
