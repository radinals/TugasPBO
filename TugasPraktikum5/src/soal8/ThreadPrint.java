package soal8;

public class ThreadPrint extends Thread {
	private final String pesan;
	private final int delay;
	public ThreadPrint(String pesan, int delay) {
		this.pesan = pesan;
		this.delay = delay;
	}
	
	@Override
	public void run(){
		System.out.println(pesan +  " dari " + this.getName());
		try {
			Thread.sleep(delay);
		} catch (InterruptedException e) {
			System.out.println("Dihentikan!");
		}
	}
}
