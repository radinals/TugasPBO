package soal2;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                
                Scanner sc = new Scanner(System.in);
                int total = 0, jumlah_angka;
                
                System.out.print("Masukan Jumlah Angka: ");
                jumlah_angka = sc.nextInt();
                
                for(int i = 0 ; i < jumlah_angka; i++) {
                        System.out.printf("Angka ke-%d: ", i+1);
                        total += sc.nextInt();
                }
                
                System.out.println("Total: " + total);
                System.out.println("Rata-rata: " + (float) total/jumlah_angka);
        }
}
