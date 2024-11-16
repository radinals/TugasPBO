package soal1;

import java.util.ArrayList;

public class Main {
        public static void main(String[] args) {
        	int arr_1[] = { 1, 2, 3 };
        	
        	int arr_2[][] = {
        				{4, 5, 6},
        				{7, 8, 9},
        				{10, 11, 12}
        	};
        	
        	ArrayList<Integer> arr_3 = new ArrayList<>();
        	
        	for(int i = 100; i < 300; i+=100)
        		arr_3.add(i);
        	
        	System.out.print("A1: ");
        	for(int n : arr_1)
        		System.out.print(n + " ");
        	System.out.println();
        	
        	System.out.println("A2: ");
        	for(int a[] : arr_2) {
        		for(int n : a) {
        			System.out.print(n + " ");
        		}
        		System.out.println();
        	}
        	
        	System.out.print("A3: ");
        	for(int n : arr_3)
        		System.out.print(n + " ");
        	System.out.println();
                
        }
}
