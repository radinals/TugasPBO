package segitiga;

public class Segitiga {
        private double a;
        private double b;
        
        public Segitiga(double a, double b) {
                this.a = a;
                this.b = b;
        }
        
        public double getSisiMiring() {
                return Math.sqrt(((a * a) + (b * b)) );
        }
        
        public double getLuas() {
                return (1.0/2.0) * b * a;
        }
        
        public double getKeliling() {
                return a + b + getSisiMiring();
        }
        
}
