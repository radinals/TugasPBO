package soal6;

import java.util.ArrayList;

public class Dosen {
	public String nidn, nama;
	private ArrayList<String> mhs_bimbingan;

	public Dosen() {
		mhs_bimbingan = new ArrayList<String>();
		nidn = nama = null;
	}
	
	public Dosen(String nidn, String nama) {
		mhs_bimbingan = new ArrayList<String>();
		this.nama = nama;
		this.nidn = nidn;
	}
	
	public void addMahasiswaBimbingan(String npm) {
		mhs_bimbingan.add(npm);
	}
	
	public ArrayList<String> getDaftarNPMBimbingan() {
		return mhs_bimbingan;
	}

	public String toString() {
		return String.format("DOSEN: nama=%s, nidn=%s", nama, nidn);
	}
}
