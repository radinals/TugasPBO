package soal1;

public class Lingkaran implements Bentuk {
	private float r;
	private static final float PI = 3.14f;

	public Lingkaran(float r) {
		this.r = r;
	}

	@Override
	public float getLuas() {
		return PI * (r*r);
	}

}
