package soal4;

public class Kasir {
	private double hargaBarang;
	private double diskon;
	private int jumlahBarang;
	
	public Kasir(double hargaBarang, double diskon, int jumlahBarang) {
		this.hargaBarang = hargaBarang;
		this.diskon = diskon;
		this.jumlahBarang = jumlahBarang;
	}

	public Kasir(double hargaBarang) {
		this.hargaBarang = hargaBarang;
		this.diskon = 0;
		this.jumlahBarang = 0;
	}

	public Kasir(double hargaBarang, int jumlahBarang) {
		this.hargaBarang = hargaBarang;
		this.diskon = 0;
		this.jumlahBarang = jumlahBarang;
	}
	
	public double hitungTotal() {
		return (hargaBarang * jumlahBarang) - diskon;
	}

	@Override
	public String toString() {
		return String.format(
				"hargaBarang: %.2f\nJumlahBarang: %d\nDiskon: %.2f\nTotal: %.2f\n",
				hargaBarang, jumlahBarang, diskon, hitungTotal()
		);
	}
}
