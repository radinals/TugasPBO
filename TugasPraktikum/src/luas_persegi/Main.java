package luas_persegi;

public class Main {

        public static void main(String[] args) {
                PersegiPanjang persegi = new PersegiPanjang(50,45);
                
                System.out.printf("Persegi dengan Panjang %d dan Lebar %d memiliki luas %d\n",
                        persegi.getPanjang(), persegi.getLebar(), persegi.getLuas());
        }
}
