package tugas_8.tugas;

public class Pemilik {
	private String nama;
	private int kapasitasMobil;
	private int jumlahMobil;
	private String[] platMobil;
	
	public Pemilik(String nama, int kapasitasMobil) {
		super();
		this.nama = nama;
		this.kapasitasMobil = kapasitasMobil;
		this.jumlahMobil = 0;
		this.platMobil = new String[kapasitasMobil];
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public int getJumlahMobil() {
		return kapasitasMobil;
	}

	public void setJumlahMobil(int kapasitasMobil) {
		this.kapasitasMobil = kapasitasMobil;
	}

	public String[] getPlatMobil() {
		return platMobil;
	}

	public Pemilik addPlatMobil(String plat) {
		if (jumlahMobil < kapasitasMobil) {
			platMobil[jumlahMobil++] = plat;
			return this;
		} else {
			return null;
		}
	}

	public void hapusPlatMobil(String plat) {
		for(int i = 0 ; i < plat.length(); i++) {
			if (plat != null && plat == platMobil[i]) {
				platMobil[i] = null;
				--kapasitasMobil;
				break;
			}
		}
	}
}
