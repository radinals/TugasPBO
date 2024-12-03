package soal7;

public class Mobil extends Kendaraan {
	public String nama, jenis;

	public Mobil(String model, String nama, String jenis) {
		super(model);
		this.nama = nama;
		this.jenis = jenis;
	}

	@Override
	public void informasi() {
		System.out.println("Model: " + model);
		System.out.println("Nama: : " + nama);
		System.out.println("Jenis: " + jenis);
	}

}
