package No5;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Total Penjualan: ");
    double total_penjualan = sc.nextDouble();

    double komisi=0, uang_jasa=0;

    if(total_penjualan > 5_000_000) {
      uang_jasa = 300_000;
      komisi = total_penjualan * (20.0/100);
    } else if (total_penjualan > 2_000_000) {
      uang_jasa = 200_000;
      komisi = total_penjualan * (15.0/100);
    } else if (total_penjualan == 2_000_000) {
      uang_jasa = 100_000;
      komisi = total_penjualan * (10.0/100);
    } 

    System.out.printf(
        "Total Pendapatan: uang jasa (%.2f) + komisi (%.2f) = %.2f\n",
        uang_jasa, komisi, uang_jasa + komisi);
  }
}
