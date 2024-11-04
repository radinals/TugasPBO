package No3;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String nama, nik;
    short jumlah_anak, kode_golongan;
    boolean menikah;

    System.out.print("Masukan Nama: ");
    nama = sc.nextLine();

    System.out.print("Masukan NIK: ");
    nik = sc.nextLine();

    System.out.print("Kode Golongan: ");
    kode_golongan = sc.nextShort();

    System.out.print("Jumlah Anak: ");
    jumlah_anak = sc.nextShort();

    var karyawan = new Karyawan(nama,nik,kode_golongan);

    System.out.println("Tunjangan: ");

    System.out.printf(" - Anak (%d): %.2f\n",
        jumlah_anak,
        karyawan.tunjanganAnak(jumlah_anak));

    System.out.printf(" - Pasangan (%s): %.2f\n",
        karyawan.keteranganGolongan(),
        karyawan.tunjanganPasangan());

    System.out.printf("Total Tunjangan: %.2f\n",
        karyawan.totalTunjangan(jumlah_anak));

    System.out.printf("Gaji Pokok: %.2f\n",
        karyawan.gajiPokok());

    System.out.printf("Total Gaji Bersih: %.2f\n",
        karyawan.gajiBersih(jumlah_anak));
  }
}
