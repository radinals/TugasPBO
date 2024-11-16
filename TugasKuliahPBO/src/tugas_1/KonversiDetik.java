/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_1;

import java.util.Scanner;

/**
 *
 * @author rss
 */
public class KonversiDetik {
        public static void main(String[] args) {   
                
        Scanner input = new Scanner(System.in);
        
        int jam,detik,menit;
        
        System.out.print("Inputkan Jam : " );
        jam = input.nextInt();
        System.out.print("Inputkan Menit : ");
        menit = input.nextInt();
        System.out.print("Inputkan detik : ");
        detik = input.nextInt();
        
        int konversi_detik = (jam * 3600) + (menit * 60) + detik;
        
        System.out.println("Dalam Detik : " + konversi_detik);

        input.close();

        }
}
