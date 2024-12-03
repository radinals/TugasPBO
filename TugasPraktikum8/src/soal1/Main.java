package soal1;

public class Main {
	public static void printHewan(Hewan obj) {
		System.out.println("- " + obj.label + ": " + obj.getNama());
	}

	public static void main(String[] args) {
		System.out.println("Macam-Macam Hewan: ");
		Hewan hewanKakiDua = new HewanKakiDua("Hewan Kaki Dua");
		Hewan hewanKakiEnam = new HewanKakiEnam("Hewan Kaki Enam");
		Hewan hewanKakiEmpat = new HewanKakiEmpat("Hewan Kaki Empat");
		Hewan hewanKakiDelapan = new HewanKakiDelapan("Hewan Kaki Delapan");
		
		hewanKakiDua
      .tambah("Kanguru")
      .tambah("Ayam")
      .tambah("Bebek");

		hewanKakiEnam
      .tambah("Capung")
      .tambah("Nyamuk")
      .tambah("Kupu-Kupu");

		hewanKakiEmpat
      .tambah("Kucing")
      .tambah("Anjing")
      .tambah("Kuda");

		hewanKakiDelapan
      .tambah("Kepiting")
      .tambah("Belalang")
      .tambah("Laba-Laba");

		System.out.println("Contoh Hewan: ");
		printHewan(hewanKakiDua);
		printHewan(hewanKakiEnam);
		printHewan(hewanKakiEmpat);
		printHewan(hewanKakiDelapan);
	}
}
