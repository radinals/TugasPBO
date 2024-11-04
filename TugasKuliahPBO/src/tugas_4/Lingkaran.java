/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_4;

/**
 *
 * @author rss
 */
public class Lingkaran extends BangunDatar {
        public float r;
        private static final float PI = 3.14f;
        
        @Override
        public float hitungLuas() {
                r = inputData("Masukan Panjang jari-jari: ");
                float luas = PI * (r*r);
                System.out.println("Luas lingkaran dengan jari-jari " + r + " adalah " + luas);
                return luas;
        }
        
        @Override
        public float hitungKeliling() {
                 r = inputData("Masukan Panjang jari-jari: ");
                float keliling = 2.0f * PI * r;
                System.out.println("Keliling lingkaran dengan jari-jari " + r + " adalah " + keliling);
                return keliling;
        }
}
