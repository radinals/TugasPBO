package tugas_3;

public class Main {
        public static void main(String[] args) {
                var lingkaran = new Lingkaran(10);
                var lingkaran2 = new Lingkaran(-1000);
                var lingkaran3 = new Lingkaran(0);
                
                System.out.println("Lingkaran " + lingkaran.getJariJari());
                System.out.println("Lingkaran2 " + lingkaran2.getJariJari());
                System.out.println("Lingkaran3 " + lingkaran3.getJariJari());
                
                Buku buku_1 = new Buku("Dracula", "Bram Stoker", 1912);
                
                buku_1.info();
                
                
                Mobil mobil_1 = new Mobil("Honda", "Civic");
                Mobil mobil_2 = new Mobil("Nissan", "Supra", 2010);
                
                mobil_1.info();
                mobil_2.info();
        }
}
