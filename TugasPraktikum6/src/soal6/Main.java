package soal6;

public class Main {
	public static void main(String[] args) {
		Civitas cv = new Civitas();
		
		cv.addDosen("123123", "budi");
		cv.addMahasiswa("23455", "toni");
		cv.addStaff("737344", "andi");

		System.out.println("======================");
		System.out.println("DOSEN: ");
		cv.listDosen();
		System.out.println("\nMAHASISWA: ");
		cv.listMahasiswa();
		System.out.println("\nSTAFF: ");
		cv.listStaff();
		System.out.println("======================");
		Dosen d = cv.getDosen("123123");
		d.addMahasiswaBimbingan("23455");

		System.out.println("nama dosen: " + d.nama);
		System.out.println("mahasiswa yang dibimbing,");
		for(String npm : d.getDaftarNPMBimbingan())  {
			Mahasiswa m = cv.getMahasiswa(npm);
			if (m != null) System.out.println("\t" + m);
		}
		System.out.println("======================");

	}
}
