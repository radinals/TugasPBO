
package soal3;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Jumlah Baris: ");
                int baris = sc.nextInt();
                for(int i = baris-1, n=1 ; i >= 0; i--) {
                        for(int j = i; j < baris; j++, n++) {
                                System.out.print(n + " ");
                        }
                        System.out.println("");
                }
        }
}
