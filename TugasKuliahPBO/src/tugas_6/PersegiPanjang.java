/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_6;

/**
 *
 * @author rss
 */
public class PersegiPanjang implements BangunDatar {
        private float panjang;
        private float lebar;
        
	public PersegiPanjang(float panjang, float lebar) {
		this.panjang = panjang;
		this.lebar = lebar;
	}

	public void setPanjang(float panjang) {
		this.panjang = panjang;
	}

	public void setLebar(float lebar) {
		this.lebar = lebar;
	}

	public float getPanjang() {
		return panjang;
	}

	public float getLebar() {
		return lebar;
	}
        
	@Override
	public float getLuas() {
		return panjang * lebar;
	}
	
	@Override
	public float getKeliling() {
		return 2 * (panjang + lebar);
	}
}
