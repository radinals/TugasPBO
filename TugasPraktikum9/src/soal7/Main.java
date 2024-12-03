package soal7;

public class Main {
	public static void main(String[] args) {
		Kendaraan kapalLaut = new KapalLaut("ModelKapalX", "KapalY", "JenisZ");
		Kendaraan mobil = new Pesawat("ModelMobilX", "MobilY", "JenisV");
		Kendaraan pesawat = new Mobil("ModelPesawatX", "PesawatY", "JenisA");
		
		kapalLaut.informasi();
		mobil.informasi();
		pesawat.informasi();
	}
}
