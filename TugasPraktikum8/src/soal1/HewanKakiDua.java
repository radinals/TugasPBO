package soal1;

public class HewanKakiDua extends Hewan {

	public HewanKakiDua(String label) {
		super(label);
	}

	@Override
	public HewanKakiDua tambah(String namaHewan) {
		this.namaHewan.add(namaHewan);
		return this;
	}
}
