package tugas_1;

import java.util.Scanner;

public class BangunDatar {
        
      final static float PI = 3.14f;
      
      static private int LuasPersegiPanjang(int p, int l) {
              return p * l;
      } 
      
      static private float luasLingkaran(int r) {
              return PI * r * r;
      }
      
      static private float kelilingLingkaran(int r) {
              return 2 * PI * r;
      }
      
      
      static public void run() {
        var input = new Scanner(System.in);
        boolean is_running = true;
        while(is_running) {
                System.out.printf("1. Luas Persegi\n2. Luas Lingkaran\n3. Keliling Lingkaran\n4. EXIT\n");
                System.out.print("MENU:");
                try {
                       
                        var opsi = input.nextInt();

                        switch(opsi) {
                                case 1:
                                        int p, l, luas;
                                        System.out.print("LEBAR: ");
                                        l = input.nextInt();
                                        System.out.print("PANJANG: ");
                                        p = input.nextInt();
                                        luas = LuasPersegiPanjang(p,l);
                                        System.out.printf("Luas %d\n", luas);
                                        break;
                                case 2: {
                                                int r;
                                                System.out.print("jari-jari: ");
                                                r = input.nextInt();
                                                System.out.printf("Luas %f\n", luasLingkaran(r));
                                        }break;
                                case 3: {
                                                int r;
                                                System.out.print("jari-jari: ");
                                                r = input.nextInt();
                                                System.out.printf("Luas %f\n", kelilingLingkaran(r));

                                        }break;

                                      case 4:
                                              is_running = false;
                                              break;
                              } 

               } catch (Exception e) {
                       continue;
               }
                
        }
		input.close();
      }
        public static void main(String[] args) {
                run();
        }
    } 
      
