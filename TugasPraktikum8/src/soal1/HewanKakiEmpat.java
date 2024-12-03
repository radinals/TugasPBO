package soal1;


public class HewanKakiEmpat extends Hewan {
	public HewanKakiEmpat(String label) {
		super(label);
	}

	@Override
	public HewanKakiEmpat tambah(String namaHewan) {
		this.namaHewan.add(namaHewan);
		return this;
	}
}
