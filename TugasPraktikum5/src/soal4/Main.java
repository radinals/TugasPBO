package soal4;

import java.util.Scanner;

public class Main {
        private static class Mahasiswa {
                public String nama;
                public int nilai;
                public String status;
                public Mahasiswa(String nama, int nilai) {
                        this.status = (nilai <= 50) ? "Tidak Lulus" : "Lulus";
                        this.nilai = nilai;
                        this.nama = nama;
                }
        }
        
        public static void main(String[] args) {
                System.out.print("Masukan Jumlah Mahasiswa: ");
                Scanner sc = new Scanner(System.in);
                int len = sc.nextInt();
                Mahasiswa[] mhs = new Mahasiswa[len];
                
                for(int i = 0; i < len; i++) {
                        System.out.println("Mahasiswa ke " + (i+1));
                        System.out.print("Masukan Nilai: ");
                        int nilai = sc.nextInt();
                        System.out.print("Masukan Nama: ");
                        String nama = sc.next();

                        mhs[i] = new Mahasiswa(nama,nilai); 
                }
                
                for(int i = 0; i < len; i++) {
                        System.out.printf("%d. %s %d %s\n", i+1, mhs[i].nama, mhs[i].nilai, mhs[i].status);
                }
                
                sc.close();
        }
}
