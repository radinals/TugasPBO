package soal1;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int min=0, max=0;
                for(int i = 0; i < 10; i++) {
                        System.out.printf("Angka ke-%d: ", i+1);
                        int input = sc.nextInt();
                        
                        if (i == 0) {
                                max = min = input;
                        }else if (input < min ) {
                                min = input;
                        } else if (input > max) {
                                max = input;
                        }
                }
                System.out.println("Min: " + min);
                System.out.println("Max: " + max);
        }
}
