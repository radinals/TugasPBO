package pembelanjaan;

public class Transaksi {
        private String nama_pelanggan;
        private double total_transaksi;
        
        public Transaksi(String nama_pelanggan, double total_transaksi) {
                this.nama_pelanggan = nama_pelanggan;
                this.total_transaksi = total_transaksi;
        }
        
        public double hitungDiskon(double diskon) {
                return (diskon < 0.0) ? 0 : total_transaksi * (diskon/100.0);
        }
        
        public double hitungTotalHarga(double diskon) {
                return total_transaksi - hitungDiskon(diskon);
        }
        
        public double hitungKembalian(double bayar, double diskon) {
                return hitungTotalHarga(diskon) - bayar;
        }
        
}
