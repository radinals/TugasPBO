package selisih_waktu;

public class Waktu {
        public int jam;
        public int menit;
        public int detik;
        
        public Waktu(int jam, int menit, int detik) {
                this.jam = jam;
                this.menit = menit;
                this.detik = detik;
        }
        
        public String getWaktuStr() {
                return String.format("%d:%d:%d", jam,menit,detik);
        }
        
        private static int hitungSelisih(int a, int b) {
                return (a > b) ? (a - b) : (b - a);
        }
        
        public static Waktu selisihWaktu(Waktu a, Waktu b) {
                int s_jam;
                int s_menit;
                int s_detik;
                
                s_jam   = hitungSelisih(a.jam, b.jam);
                s_menit = hitungSelisih(a.menit, b.menit);
                s_detik = hitungSelisih(a.detik, b.detik);
                
                return new Waktu(s_jam,s_menit,s_detik);
        }
}
