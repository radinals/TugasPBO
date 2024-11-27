package soal4;

public class Main {
	private String sumpah_pemuda;
	
	public String silaKesatu() {
		return "mengaku bertumpah darah yang satu, tanah air Indonesia";	
	}

	private String silaKedua() {
		return "mengaku berbangsa yang satu, bangsa Indonesia.";
	}

	private String silaKetiga() {
		return "menjunjung bahasa persatuan, bahasa Indonesia.";
	}
	
	public void tampil() {
		System.out.println(sumpah_pemuda);
	}
	
	public Main() {
		sumpah_pemuda = "Kami Putra Putri Indonesia " + silaKesatu() + "\n";
		sumpah_pemuda += "Kami Putra Putri Indonesia " + silaKedua() + "\n";
		sumpah_pemuda += "Kami Putra Putri Indonesia " + silaKetiga() + "\n";
	}

	public static void main(String[] args) {
		
		Main m = new Main();
		m.tampil();
		
	}
}
