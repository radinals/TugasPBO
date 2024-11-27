package soal6;

public class Mahasiswa {
	public String nama, npm;

	public Mahasiswa() { nama = npm = null; }
	
	public Mahasiswa(String npm, String nama) {
		this.nama = nama;
		this.npm = npm;
	}

	public String toString() {
		return String.format("MAHASISWA: nama=%s, npm=%s", nama, npm);
	}
}
