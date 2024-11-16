package soal2;

public class Main {
	public static void main(String[] args) {
		String[ ] mobil = {"Tesla", "Suzuki", "Civic", "Mazda", "BMW"};

		int i = 0;
		try {
			while(! mobil[i].equals("Suzuki")) { i++; }
			System.out.println("Suzuki terletak pada index:" + i);
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println("Item tidak ditemukan di array");
			return;
		}

		System.out.println("mobil[" + i + "] menjadi " + "Ford");
		mobil[i] = "Ford";
		System.out.println("mobil[" + i + "] = " + mobil[i]);

	}
}
