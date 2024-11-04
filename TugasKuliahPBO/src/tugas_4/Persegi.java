/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_4;

/**
 *
 * @author rss
 */
public class Persegi extends BangunDatar {
        public float sisi;
        
        @Override
        public float hitungLuas() {
                sisi = inputData("Masukan Panjang Sisi: ");
                float luas = sisi * sisi;
                System.out.println("Luas persegi dengan sisi " + sisi + " adalah " + luas);
                return luas;
        }
        
        @Override
        public float hitungKeliling() {
                sisi = inputData("Masukan Panjang Sisi: ");
                float keliling  = 4 * sisi;
                System.out.println("Keliling persegi dengan sisi " + sisi + " adalah " + keliling);
                return keliling;
        }
        
}
