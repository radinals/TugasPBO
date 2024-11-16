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
public class BangunDatar {
        final float inputData(String prompt) {
                var sc = new Scanner(System.in);
                System.out.print("Masukan panjang sisi: ");
                float in = sc.nextFloat();
                sc.close();
                return in;
        }
        
        public float hitungLuas() {
                return 0;
        }
        
        public float hitungKeliling() {
                return 0;
        }
}
