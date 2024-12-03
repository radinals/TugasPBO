package soal1;

public class PersegiPanjang implements Bentuk {
	private float panjang;
	private float lebar;

	public PersegiPanjang(float panjang, float lebar) {
		this.panjang = panjang;
		this.lebar = lebar;
	}

	@Override
	public float getLuas() {
		return panjang * lebar;
	}

}
