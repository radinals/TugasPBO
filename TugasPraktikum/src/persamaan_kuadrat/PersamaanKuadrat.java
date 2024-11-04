package persamaan_kuadrat;

public class PersamaanKuadrat {
        private int a;
        private int b;
        private int c;
        
        public PersamaanKuadrat(int a, int b, int c) {
               this.a = a;
               this.b = b;
               this.c = c;
        }
        
        int getA() { return a; }
        int getB() { return b; }
        int getC() { return c; }
        
        int getPersamaanKuadrat() {
                return (b * b) - (4*(a*c));
        }
}
