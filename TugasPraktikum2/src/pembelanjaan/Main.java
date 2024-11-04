package pembelanjaan;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Main {
        public static double inputDouble(String prompt, DataInputStream dis,
                DataOutputStream dos) {
                Double input;
                
                while (true) {
                        try {
                                dos.writeBytes(prompt);
                                dos.flush();
                                input = Double.parseDouble(dis.readLine());
                        } catch (IOException e) { continue; }
                        break;
                }
                return input.doubleValue();
        }
        
        public static String inputString(String prompt, DataInputStream dis,
                DataOutputStream dos) {
                String input;
                while(true) {
                        try {
                                dos.writeBytes(prompt);
                                dos.flush();
                                input = dis.readLine();
                        } catch (IOException e) { continue; }
                        break;
                }
                return input;
        }
        
        public static void main(String[] args) throws IOException {
                var dis = new DataInputStream(System.in);
                var dos = new DataOutputStream(System.out);
                
                String nama_pelanggan;
                nama_pelanggan  = inputString("Nama: ", dis, dos);
                
                double total_transaksi;
                total_transaksi = inputDouble("Total Belanja: Rp.", dis, dos);
                
                double diskon;
                diskon = inputDouble("Diskon(%): ",dis,dos);
                
                var transaksi = new Transaksi(nama_pelanggan,total_transaksi);
                
                dos.writeBytes("Total: (" + total_transaksi + " - " + diskon + "%)"
                        + " = Rp." + transaksi.hitungTotalHarga(diskon) + "\n");
                dos.flush();
                
                double bayar;
                bayar = inputDouble("Bayar: ",dis, dos);
                
                double kembalian = transaksi.hitungKembalian(bayar, diskon);
                
                dos.writeBytes("Kembalian: " +
                        ((kembalian > 0 ) ? "UANG ANDA BELUM CUKUP" :
                                String.format("Rp.%.2f",Math.abs(kembalian))) + "\n");
                dos.flush();
        }
}
