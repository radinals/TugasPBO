package soal1;

public class Segitiga implements Bentuk {
	private float alas;
	private float tinggi;

	public Segitiga(float alas, float tinggi) {
		this.alas = alas;
		this.tinggi = tinggi;
	}

	@Override
	public float getLuas() {
		return 0.5f * alas * tinggi;
	}

}
