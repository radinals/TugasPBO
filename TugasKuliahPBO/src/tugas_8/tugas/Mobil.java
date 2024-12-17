package tugas_8.tugas;

public class Mobil {
	private String merek, noPlat;
	private int tahunKeluaran;

	public Mobil() {
		super();
	}

	public Mobil(String merek, String noPlat, int tahunKeluaran) {
		this.merek = merek;
		this.noPlat = noPlat;
		this.tahunKeluaran = tahunKeluaran;
	}

	public String getMerek() {
		return merek;
	}

	public void setMerek(String merek) {
		this.merek = merek;
	}

	public String getNoPlat() {
		return noPlat;
	}

	public void setNoPlat(String noPlat) {
		this.noPlat = noPlat;
	}

	public int getTahunKeluaran() {
		return tahunKeluaran;
	}

	public void setTahunKeluaran(int tahunKeluaran) {
		this.tahunKeluaran = tahunKeluaran;
	}
	
	@Override
	public String toString() {
		return String.format("Merk: %s\nNoPlat: %s\nKeluaran: %d\n", merek, noPlat, tahunKeluaran);
	}

}
