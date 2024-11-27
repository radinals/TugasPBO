package soal7;

import java.util.Scanner;

import soal6.Mahasiswa;

public class Main {
	public static void main(String[] args) {
		Mahasiswa mahasiswa;
		String nama,npm;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("NAMA: ");
		nama = sc.nextLine();

		System.out.print("NPM: ");
		npm = sc.nextLine();
		
		mahasiswa = new Mahasiswa(npm,nama);
		
		System.out.println(mahasiswa);
		
		sc.close();
	}
	
}
