package soal3;

public class Kubus {
	private int sisi;
	public Kubus(int sisi) { this.sisi = sisi; }
	public int getVolume() {  return (int) Math.pow(sisi, 3); }
	public static void main(String[] args) {
		Kubus kubus = new Kubus(5);
		System.out.println("Volume Kubus dengan sisi 5, adalah: " + kubus.getVolume());
	}
}
