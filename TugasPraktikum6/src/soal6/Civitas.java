package soal6;

import java.util.ArrayList;

public class Civitas {
	private ArrayList<Dosen> daftar_dosen;
	private ArrayList<Mahasiswa> daftar_mhs;
	private ArrayList<Staff> daftar_staff;
	
	public Civitas() {
		daftar_dosen = new ArrayList<Dosen>();
		daftar_mhs = new ArrayList<Mahasiswa>();
		daftar_staff = new ArrayList<Staff>();
	}
	
	public void addDosen(String nidn, String nama) {
		daftar_dosen.add(new Dosen(nidn,nama));
	}

	public void addMahasiswa(String npm, String nama) {
		daftar_mhs.add(new Mahasiswa(npm,nama));
	}
	
	public void addStaff(String id, String nama) {
		daftar_staff.add(new Staff(id,nama));
	}
	
	public Dosen getDosen(String nidn) {
		for(Dosen x : daftar_dosen) { 
			if (x.nidn == nidn)
				return x;
		}
		return null;
	}

	public Mahasiswa getMahasiswa(String npm) {
		for(Mahasiswa x : daftar_mhs) { 
			if (x.npm == npm)
				return x;
		}
		return null;
	}

	public Staff getStaff(String id) {
		for(Staff x : daftar_staff) { 
			if (x.id== id)
				return x;
		}
		return null;
	}

	public void listDosen() {
		for(Dosen x : daftar_dosen) { 
			System.out.println(x);
		}
	}

	public void listMahasiswa() {
		for(Mahasiswa x : daftar_mhs) { 
			System.out.println(x);
		}
	}

	public void listStaff() {
		for(Staff x : daftar_staff) { 
			System.out.println(x);
		}
	}
	
}
