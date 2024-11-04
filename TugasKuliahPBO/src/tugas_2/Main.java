/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas_2;
import java.util.Scanner;
/**
 *
 * @author rss
 */


public class Main {
        private static void printMenu() {
                System.out.print("""
                                 MENU: 
                                 Bergerak Maju(1):
                                 Bergerak Mundur(2):
                                 Berhenti(3)
                                 Exit(0)
                                 """);
        }
        
        private static Sepeda createSepeda(Scanner s) {
               String merk = null;
               Scanner input = s;
               while(merk == null || merk.isEmpty()) {
                       System.out.print("Masukan Object Merk Sepeda: ");
                       merk = input.nextLine();
               }
               return new Sepeda(merk);
        }


        public static void main(String[] args) {
                var input = new Scanner(System.in);
                
                Sepeda sepeda = createSepeda(input);
                
                boolean exit = false;
                while(!exit) {
                        printMenu();
                        System.out.print("Pilihan: ");
                        switch(input.nextInt()) {
                                case 1:
                                        System.out.println(
                                                "- Bergerak Maju " +
                                                sepeda.getJarakMaju() +
                                                "KM" 
                                        );
                                        
                                        sepeda.maju();

                                        break;
                                case 2:
                                        System.out.println(
                                                "- Bergerak Mundur " +
                                                sepeda.getJarakMundur() +
                                                "KM" );
                                        
                                        sepeda.mundur();
                                        
                                        break;
                                case 3:
                                        System.out.println("- Sepeda Berhenti");
                                        sepeda.berhenti();;
                                        break;
                                case 0:
                                        System.out.println("- Keluar Program");
                                        exit = true;
                                        break;
                                
                        };
                }
                
              
        }
        
}
