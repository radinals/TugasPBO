package soal2;

public class Suryakancana implements Universitas {
	private String nama, alamat, telepon, provinsi, negara;

	public Suryakancana(String nama, String alamat, String telepon, String provinsi, String negara) {
		this.nama = nama;
		this.alamat = alamat;
		this.telepon = telepon;
		this.provinsi = provinsi;
		this.negara = negara;
	}
	
	@Override
	public String tampil() {
		return String.format(
				"\tData Universitas\n"
				+ "Alamat    : %s\n"
				+ "Telepon   : %s\n"
				+ "Provinsi  : %s\n"
				+ "Negara    : %s\n",
		nama, alamat, telepon, provinsi, negara);
	}
}
