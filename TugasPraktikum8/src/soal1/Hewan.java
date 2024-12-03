package soal1;

import java.util.ArrayList;

public abstract class Hewan {
	public ArrayList<String> namaHewan;
	public String label;

	public Hewan(String label) {
		namaHewan = new ArrayList<String>();
		this.label = label;
		System.out.println("- " + label);
	}

	abstract public Hewan tambah(String namaHewan);

	public String getLabel() {
		return label;
	}

	ArrayList<String> getNama() {
		return namaHewan;
	}
}
