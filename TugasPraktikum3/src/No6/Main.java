package No6;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Apakah memiliki kartu member(ya/tidak): ");
    String answ = sc.next();
    boolean punya_kartu = answ.equalsIgnoreCase("ya");

    System.out.print("Total Belanja: ");
    double total_belanja = sc.nextDouble();

    double diskon = 0;
    if(punya_kartu) {
      if (total_belanja > 500_000) {
        diskon = 50_000;
      } else if (total_belanja > 100_000) {
        diskon = 15_000;
      }
    } else {
      if (total_belanja > 100_000) {
        diskon = 10_000;
      }
    }

    total_belanja -= diskon;
    System.out.printf("Total Belanja (Diskon=%.2f) = %.2f\n",
        diskon, total_belanja);

    System.out.print("Pembayaran: ");
    double pembayaran = sc.nextDouble();

    if (pembayaran >= total_belanja) {
      System.out.printf("Kembalian: %.2f\n",
          pembayaran - total_belanja);
    } else {
      System.out.println("Pembayaran Kurang");
    }
  }
}
