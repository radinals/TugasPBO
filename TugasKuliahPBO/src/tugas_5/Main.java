/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_5;

/**
 *
 * @author rss
 */
public class Main {

        public static void main(String[] args) {
                
		BangunDatar bangun_persegi = new Persegi(5);
		BangunDatar bangun_persegi_panjang = new PersegiPanjang(10,5);
		BangunDatar bangun_segitiga = new Segitiga(13, 3);
		BangunDatar bangun_lingkaran = new Lingkaran(30);
		
		System.out.printf("Persegi: L = %.2f K = %.2f\n", bangun_persegi.getLuas(), bangun_persegi.getKeliling());
		System.out.printf("Persegi Panjang: L = %.2f K = %.2f\n", bangun_persegi_panjang.getLuas(), bangun_persegi_panjang.getKeliling());
		System.out.printf("Segitiga: L = %.2f K = %.2f\n", bangun_segitiga.getLuas(), bangun_segitiga.getKeliling());
		System.out.printf("Lingkaran: L = %.2f K = %.2f\n", bangun_lingkaran.getLuas(), bangun_lingkaran.getKeliling());
               
        }
}
