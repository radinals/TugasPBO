/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_4;

import java.util.Scanner;

/**
 *
 * @author rss
 */
public class Main {

        public static void printMenuBangun() {
                System.out.println("1. Persegi");
                System.out.println("2. PersegiPanjang");
                System.out.println("3. Lingkaran");
                System.out.println("4. Segitiga");
                System.out.println("5. Exit");
        }
        
        public static void main(String[] args) {
                var sc = new Scanner(System.in);
                
                boolean m1_run = true;
                while(m1_run) {
                        printMenuBangun();
                        System.out.print("Pilih Bangun Datar: ");
                        int input = sc.nextInt();

                        BangunDatar bangun = null;

                        switch(input) {
                                case 1:
                                        bangun = new Persegi();
                                        break;
                                case 2: 
                                        bangun = new PersegiPanjang();
                                        break;
                                case 3: 
                                        bangun = new Lingkaran();
                                        break;
                                case 4:
                                        bangun = new Segitiga();
                                        break;
                                case 5:
                                        m1_run = false;
                                        continue;
                                default:
                                        System.out.println("Pilih Opsi yang benar!");
                        }

                        if (bangun == null) continue;
                        
                        boolean m2_run = true;
                        while(m2_run) {
                                System.out.println("1. Luas");
                                System.out.println("2. Keliling");
                                System.out.println("3. Exit");

                                System.out.print("Pilih Operasi: ");
                                input = sc.nextInt();

                                switch(input) {
                                        case 1:
                                                bangun.hitungLuas();
                                                break;
                                        case 2:
                                                bangun.hitungKeliling();
                                                break;
                                        case 3:
                                                m2_run = false;
                                                continue;
                                        default:
                                                System.out.println("Pilih Opsi yang benar!");
                                                continue;
                                }
                        }
                }
        }
}
