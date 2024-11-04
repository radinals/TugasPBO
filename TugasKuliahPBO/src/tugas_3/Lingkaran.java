package tugas_3;

public class Lingkaran {
        private double jari_jari;
        
        public Lingkaran(double jari_jari) {
                if (jari_jari <= 0) {
                        this.jari_jari = 1.0;
                } else {
                        this.jari_jari = jari_jari;
                }
        }
        
        public double getJariJari() {
                return jari_jari;
        }
}
