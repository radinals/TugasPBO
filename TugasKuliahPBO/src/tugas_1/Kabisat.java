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
public class Kabisat {
       private static boolean adalahKabisat(int tahun) {
               return ((tahun % 400 == 0) || (tahun % 100 != 0) && (tahun % 4 == 0));
       }
       
       public static void run() {
               var input = new Scanner(System.in);
               int tahun;
               while(true) {
                      System.out.print("Masukan Tahun 1909 - 2024: ");
                      tahun = input.nextInt();
                      if(tahun > 2024 || tahun < 1909) {
                              System.out.println("Hanya Masukan Tahun 1909 - 2024");
                              continue;
                      } else {
                              break;
                      }
               }
               
               if (adalahKabisat(tahun)) {
                      System.out.println(tahun + " adalah tahun kabisat");    

               } else {
                      System.out.println(tahun + " bukan tahun kabisat");    
               }

               input.close();
       }
       
        public static void main(String[] args) {
                run();
        }
}
