package soal4;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                
                System.out.print("Banyak Angka: ");
                int n_angka = sc.nextInt();
                
                int total = 0;
                for(int i = 0; i < n_angka*2; i++) {
                        if (i % 2 != 0) {
                                System.out.print(i + " ");
                                total += i;
                        }
                }
                System.out.println("");
                System.out.println("Total: " +  total);
        }
}
