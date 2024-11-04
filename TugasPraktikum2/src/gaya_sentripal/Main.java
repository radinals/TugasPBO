package gaya_sentripal;

import java.util.Scanner;

public class Main {
        public static double hitungGayaSentripal(double massa, double kecepatan,
                double jari_jari) {
                return (massa * Math.pow(kecepatan, 2)) / jari_jari;
                
        }
        
        public static void main(String[] args) {
                var sc = new Scanner(System.in);
                
                double massa;
                double kecepatan;
                double jari_jari;
                
                System.out.print("MASSA: ");
                massa = sc.nextDouble();
                
                System.out.print("KECEPATAN: ");
                kecepatan = sc.nextDouble();
                
                System.out.print("JariJari: ");
                jari_jari = sc.nextDouble();
                
                System.out.println("GAYA SENTRIPAL: " + hitungGayaSentripal(massa,kecepatan,jari_jari));
        }
}
