package segitiga;


public class Main {
        public static void main(String[] args) {
                double a = 6;
                double b = 8;
                
                Segitiga segitiga = new Segitiga(a,b);
                
                System.out.printf("a: %.2f b: %.2f\n", a, b);
                System.out.printf("Luas Segitiga: %.2f\n", segitiga.getLuas());
                System.out.printf("sisi miring(c) : %.2f\n", segitiga.getSisiMiring());
                System.out.printf("Keliling segitiga: %.2f\n", segitiga.getKeliling());
        }
}
