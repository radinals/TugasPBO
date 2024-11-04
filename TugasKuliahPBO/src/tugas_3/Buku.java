/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_3;

/**
 *
 * @author rss
 */
public class Buku {
        public String judul;
        public String pengarang;
        int tahun_terbit;
        
        public Buku(String judul, String pengarang, int tahun_terbit) {
                this.judul = judul;
                this.pengarang = pengarang;
                this.tahun_terbit = tahun_terbit;
        }
        
        public void info() {
                System.out.println("Judul: " + judul);
                System.out.println("Pengarang: " + pengarang);
                System.out.println("Tahun Terbit: " + tahun_terbit);
        }
        
}
