
package persamaan_kuadrat;


public class Main {
        public static void main(String[] args) {
                PersamaanKuadrat persamaan = new PersamaanKuadrat(2,10,5);
                
                System.out.printf("a = %d\nb = %d\nc = %d\n",
                        persamaan.getA(),persamaan.getB(), persamaan.getC());
                
                System.out.println("Persamaan Kuadrat: " + persamaan.getPersamaanKuadrat());
                       
        }
}
