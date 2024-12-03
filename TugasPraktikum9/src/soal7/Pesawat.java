package soal7;

public class Pesawat extends Kendaraan {
	public String nama, jenis;

	public Pesawat(String model, String nama, String jenis) {
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
