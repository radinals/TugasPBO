/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_5;

/**
 *
 * @author rss
 */
public class Segitiga extends BangunDatar {
        public float alas;
        public float tinggi;
	
	public Segitiga(float alas, float tinggi) {
		this.alas = alas;
		this.tinggi = tinggi;
	}
        
        private float luas() {
                return 0.5f * alas * tinggi;
                
        }

	public float getAlas() {
		return alas;
	}

	public float getTinggi() {
		return tinggi;
	}

	public void setAlas(float alas) {
		this.alas = alas;
	}

	public void setTinggi(float tinggi) {
		this.tinggi = tinggi;
	}
	
        private float keliling() {
                float sisi_miring = hitungSisiMiring();
                return sisi_miring + alas + tinggi;

        }
        
        private float hitungSisiMiring() {
                return (float) Math.sqrt(((alas * alas) + (tinggi * tinggi)) );
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
