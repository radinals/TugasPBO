
package operasi_matematika;


public class Main {
        public static void main(String[] args) {
                int x = 22;
                int y = 33;
                
                System.out.printf("%d + %d = %d\n", x, y, OperasiMatematika.pertambahan(x, y));
                System.out.printf("%d - %d = %d\n", x, y, OperasiMatematika.pengurangan(x, y));
                System.out.printf("%d / %d = %.2f\n", x, y, OperasiMatematika.pembagian(x, y));
                System.out.printf("%d * %d = %d\n", x, y, OperasiMatematika.perkalian(x, y));

        }
}
