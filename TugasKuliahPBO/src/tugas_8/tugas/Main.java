package tugas_8.tugas;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Main {
	
	private static Scanner scanner;
	
	public static Pemilik inputPemilik() {
		int jmlhMobil = 0;
		String namaPemilik;

		while(true) {
			System.out.print("Input Nama Pemilik: ");
			namaPemilik = scanner.nextLine();

			System.out.print("Input Jumlah Mobil: ");
			String input = scanner.nextLine();
			try {
				jmlhMobil = Integer.valueOf(input);
			} catch (Exception e) {
				continue;
			}
			
			break;
		}
		
		return  new Pemilik(namaPemilik, jmlhMobil);
	}
	
	public static void inputMobil(Pemilik pemilik, ArrayList<Mobil>listMobil ) {
		for(int i = 0 ; i < pemilik.getJumlahMobil(); i++) {

			String merk="", no="";
			int tahunKeluaran = 0;
			System.out.println("#################################################");

			System.out.print("Merk: ");
			merk = scanner.nextLine();

			System.out.println();

			System.out.print("NoPlat: ");
			no = scanner.nextLine();

			System.out.print("Keluaran: ");
			while(true) {
				try {
					String input = scanner.nextLine();
					tahunKeluaran = Integer.valueOf(input);
				}catch (Exception e) {
					continue;
				}
				break;
			}
			pemilik.addPlatMobil(no);
			listMobil.add(new Mobil(merk, no, tahunKeluaran));
		}
	}
	
	public static Mobil getMobil(String plat, ArrayList<Mobil>listMobil) {
		for(Mobil mobil : listMobil) {
			if (mobil.getNoPlat() == plat) {
				return mobil;
			}
		}
		return null;
	}
	
	public static void printData(Pemilik pemilik, ArrayList<Mobil>listMobil) {
		for(String noPlat : pemilik.getPlatMobil()) {
			System.out.println("#################################################");
			Mobil mobil = getMobil(noPlat, listMobil);
			if (mobil != null) System.out.println(mobil);
		}
	}
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		Pemilik pemilik = inputPemilik();
		ArrayList<Mobil> listMobil = new ArrayList<Mobil>(); 
		
		System.out.println("INPUT:");
		inputMobil(pemilik, listMobil);
		
		System.out.println("OUTPUT:");
		printData(pemilik, listMobil);
		
	}
}
