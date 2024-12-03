package soal1;

public class BujurSangkar implements Bentuk {
	private float sisi;

	public BujurSangkar(float sisi) {
		this.sisi = sisi;
	}

	@Override
	public float getLuas() {
		return sisi * sisi;
	}

}
