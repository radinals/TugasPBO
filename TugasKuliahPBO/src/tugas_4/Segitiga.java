/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_4;

/**
 *
 * @author rss
 */
public class Segitiga extends BangunDatar {
        public float alas;
        public float tinggi;
        
        @Override
        public float hitungLuas() {
                alas = inputData("Masukan Panjang Alas: ");
                tinggi = inputData("Masukan Tinggi: ");
                
                float luas = 0.5f * alas * tinggi;
                System.out.println("Luas segitiga dengan tinggi " + tinggi + " dan alas " +  alas +  " adalah " + luas);
                return luas;
        }
        @Override
        public float hitungKeliling() {
                alas = inputData("Masukan Panjang Alas: ");
                tinggi = inputData("Masukan Tinggi: ");
                float sisi_miring = hitungSisiMiring();
                
                float keliling = sisi_miring + alas + tinggi;
                System.out.println("Keliling segitiga dengan tinggi " + tinggi + " dan alas " +  alas +  " adalah " + keliling);
                return keliling;
        }
        
        public float hitungSisiMiring() {
                return (float) Math.sqrt(((alas * alas) + (tinggi * tinggi)) );
        }
        
}
