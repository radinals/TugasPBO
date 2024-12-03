package soal1;

public class HewanKakiDelapan extends Hewan {
	public HewanKakiDelapan(String label) {
		super(label);
	}

	@Override
	public HewanKakiDelapan tambah(String namaHewan) {
		this.namaHewan.add(namaHewan);
		return this;
	}

}
