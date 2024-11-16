/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_6;

/**
 *
 * @author rss
 */
public class Persegi implements BangunDatar {
        private float sisi;
        
        public Persegi(float sisi) {
                this.sisi = sisi;
        }
	
        public float getSisi() {
                return sisi;
        }
        
        public void setSisi(float sisi) {
                this.sisi = sisi;
        }
        
	@Override
        public float getLuas() {
               return sisi * sisi;
        }
        
	@Override
        public float getKeliling() {
                return 4 * sisi;
        }
        
        
        
}
