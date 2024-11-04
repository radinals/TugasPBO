package No3;

public class Karyawan {
  private String nama, nik, keterangan;       
  private short kode_golongan;
  private boolean menikah;
  private double gaji_pokok;

  public Karyawan(String nama, String nik,
      short kode_golongan)
  {
    switch(kode_golongan) {
      case 1:
        gaji_pokok = 1_200_000;
        menikah = true;
        keterangan = "Menikah";
        break;
      case 2:
        gaji_pokok = 1_500_000;
        menikah = false;
        keterangan = "Belum Menikah";
        break;
      case 3:
        gaji_pokok = 1_750_000;
        menikah = false;
        keterangan = "Cerai";
        break;
      case 4:
        gaji_pokok = 2_000_000;
        menikah = true;
        keterangan = "Menikah dan Punya Anak";
        break;
      default:
        gaji_pokok = 0;
        menikah = false;
        break;
    }

    this.nama = nama;
    this.nik = nik;
    this.kode_golongan = kode_golongan;              
  }

  public double gajiPokok() {
    return gaji_pokok;
  }

  public double gajiBersih(short jumlah_anak) {
    return gaji_pokok - totalTunjangan(jumlah_anak);
  }

  public double totalTunjangan(short jumlah_anak) {
    return tunjanganAnak(jumlah_anak) + tunjanganPasangan();
  }

  public double tunjanganPasangan() {
    return (menikah) ? (gaji_pokok * (10.0/100)) : 0;
  }

  public double tunjanganAnak(short jumlah_anak) {
    return (jumlah_anak > 0) ? (gaji_pokok * (5.0/100)) * jumlah_anak : 0;
  }

  public String keteranganGolongan() { return keterangan; }
}
