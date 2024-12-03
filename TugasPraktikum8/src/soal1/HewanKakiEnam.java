package soal1;

public class HewanKakiEnam extends Hewan {
	public HewanKakiEnam(String label) {
		super(label);
	}

	@Override
	public HewanKakiEnam tambah(String namaHewan) {
		this.namaHewan.add(namaHewan);
		return this;
	}
}
