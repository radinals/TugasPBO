package soal6;

public class Staff {
	public String nama, id;

	public Staff() { nama = id = null; }

	public Staff(String id, String nama) {
		this.id = id;
		this.nama =nama;
	}

	public String toString() {
		return String.format("STAFF: nama=%s, id=%s", nama, id);
	}
}
