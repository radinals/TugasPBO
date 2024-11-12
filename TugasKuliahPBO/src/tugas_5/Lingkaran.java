/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_5;

/**
 *
 * @author rss
 */
public class Lingkaran extends BangunDatar {
        private float r;
        private static final float PI = 3.14f;
        
	public Lingkaran(float r) {
		this.r = r;
	}
	
        private float luas() {
		return PI * (r*r);
        }
        
        
	private float keliling() {
                return 2.0f * PI * r;
        }

	public float getJariJari() {
		return r;
	}

	public void setJariJari(float r) {
		this.r = r;
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
