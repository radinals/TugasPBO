package tugas_8.latihan;

public class Dosen {
	private String[] npm_mahasiswa;
	private String nidn, nama;
	private int total_npm;
	
	public Dosen() {
		super();
		total_npm = 0;
		npm_mahasiswa = new String[5];
	}

	public Dosen(String nidn, String nama) {
		this.nidn = nidn;
		this.nama = nama;
		total_npm = 0;
		npm_mahasiswa = new String[5];
	}
	
	public Dosen addMahasiswa(String npm) {
		if (total_npm < 5) {
			npm_mahasiswa[total_npm++] = npm;
			return this;
		} else {
			return null;
		}
	}
	
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public String getNama() {
		return nama;
	}
	
	public String getNidn() {
		return nidn;
	}

	public void setNidn(String nidn) {
		this.nidn = nidn;
	}
	
}
