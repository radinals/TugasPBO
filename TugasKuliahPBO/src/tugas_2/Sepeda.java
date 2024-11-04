/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_2;

/**
 *
 * @author rss
 */
public class Sepeda {
        private int jarak;
        private String merk;
        private final int jarak_mundur;
        private final int jarak_maju;
        
        public Sepeda(String merk) {
                jarak = 0;
                jarak_mundur = 5;
                jarak_maju = 10;
                this.merk = merk;
        }
        
        public int getJarak() {
                return jarak;
        }
        
        public String getMerk() {
                return merk;
        }
        
        public int getJarakMaju() {
                return jarak_maju;
        }
        
        public int getJarakMundur() {
                return jarak_mundur;
        }
        
        
        public void maju() {
                jarak += jarak_maju;
                printJarak();
        }
        
        public void printJarak() {                  
                System.out.printf(
                        "- Object Sepeda %s, jarak tempuh akhir %d km\n",
                        merk, jarak
                );
        }
        
        public void berhenti() {
                printJarak();
                
        }
        
        public void mundur() {
                jarak -= jarak_mundur;
                printJarak();
        }
}
