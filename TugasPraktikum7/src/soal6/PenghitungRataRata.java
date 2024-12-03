package soal6;

import java.util.ArrayList;

public class PenghitungRataRata {
	ArrayList<Integer> data;
	public PenghitungRataRata(ArrayList<Integer> data) {
		this.data = data;
	}
	
	public Double hitungRataRata() {
		int total = 0; for(int n : data) total += n; 
		return new Double(total / data.size());
	}
}
