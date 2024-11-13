/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_5;

/**
 *
 * @author rss
 */
public class Persegi extends BangunDatar {
        private float sisi;
        
        public Persegi(float sisi) {
                this.sisi = sisi;
        }
        
        private float luas() {
             return sisi * sisi;
              
        }
        
        private float keliling() {
            return 4 * sisi;
        }

        public float getSisi() {
                return sisi;
        }
        
        public void setSisi(float sisi) {
                this.sisi = sisi;
        }
        
	@Override
        public float getLuas() {
                return luas();
        }
        
	@Override
        public float getKeliling() {
                return keliling();
        }
        
        
        
}
