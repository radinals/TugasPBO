package soal10;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Object> arr = new ArrayList<>();
		
		arr.add(19);
		arr.add(0.2);
		arr.add('C');
		arr.add("Java");
		arr.add(true);
		
		for(Object e : arr)
			System.out.println(e);
		
	}
}
