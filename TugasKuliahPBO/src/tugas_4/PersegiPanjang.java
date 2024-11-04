/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_4;

/**
 *
 * @author rss
 */
public class PersegiPanjang extends BangunDatar {
        public float panjang;
        public float lebar;
        
        @Override
        public float hitungLuas() {
                panjang = inputData("Masukan Panjang: ");
                lebar = inputData("Masukan Lebar: ");
                
                float luas = panjang * lebar;
                System.out.println("Luas persegi panjang dengan panjang " + panjang + " dan lebar " +  lebar +  " adalah " + luas);
                return luas;
        }
        
        @Override
        public float hitungKeliling() {
                panjang = inputData("Masukan Panjang: ");
                lebar = inputData("Masukan Lebar: ");
                
                float keliling  = 2 * (panjang + lebar);
                System.out.println("Keliling persegi panjang dengan panjang " + panjang + " dan lebar " +  lebar +  " adalah " + keliling);

                return keliling;
        }
}
