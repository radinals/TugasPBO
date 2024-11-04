package No7;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean run = true;
    while(run) {
      System.out.println("1. Luas Persegi");
      System.out.println("2. Luas Segititga");
      System.out.println("3. Luas Lingkaran");
      System.out.println("4. Luas Trapesium");
      System.out.println("5. Luas Layang-layang");
      System.out.println("6. Exit");

      System.out.print("OPSI: ");
      short opt = sc.nextShort();

      switch (opt) {
        case 1:
          System.out.print("Sisi: ");
          double sisi = sc.nextDouble();
          double luas = sisi * sisi;
          System.out.printf("Luas Persegi: %.2f\n", luas);
          break;
        case 2:
          System.out.print("Alas: ");
          double alas = sc.nextDouble();
          System.out.print("Tinggi: ");
          double tinggiSegitiga = sc.nextDouble();
          double luasSegitiga = 0.5 * alas * tinggiSegitiga;
          System.out.printf("Luas Segitiga: %.2f\n", luasSegitiga);
          break;
        case 3:
          System.out.print("Jari-jari: ");
          double jariJari = sc.nextDouble();
          double luasLingkaran = Math.PI * jariJari * jariJari;
          System.out.printf("Luas Lingkaran: %.2f\n", luasLingkaran);
          break;
        case 4:
          System.out.print("Sisi Sejajar 1: ");
          double sisiSejajar1 = sc.nextDouble();
          System.out.print("Sisi Sejajar 2: ");
          double sisiSejajar2 = sc.nextDouble();
          System.out.print("Tinggi: ");
          double tinggiTrapesium = sc.nextDouble();
          double luasTrapesium = 0.5 * (sisiSejajar1 + sisiSejajar2) * tinggiTrapesium;
          System.out.printf("Luas Trapesium: %.2f\n", luasTrapesium);
          break;
        case 5:
          System.out.print("Diagonal 1: ");
          double diagonal1 = sc.nextDouble();
          System.out.print("Diagonal 2: ");
          double diagonal2 = sc.nextDouble();
          double luasLayangLayang = 0.5 * diagonal1 * diagonal2;
          System.out.printf("Luas Layang-layang: %.2f\n", luasLayangLayang);
          break;
        case 6:
          run = false;
          break;
      }
    }
  }
}
