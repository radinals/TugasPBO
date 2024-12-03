package soal7;

public class KapalLaut extends Kendaraan {
	public String nama, jenis;

	public KapalLaut(String model, String nama, String jenis) {
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
