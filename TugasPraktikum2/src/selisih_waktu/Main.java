package selisih_waktu;

public class Main {
        public static void main(String[] args) {
                var waktu_pertama = new Waktu(12, 24, 10);
                var waktu_kedua = new Waktu(18, 29, 0);
                
                System.out.println("Selisih antara " +  
                        waktu_pertama.getWaktuStr() + " dan " + 
                        waktu_kedua.getWaktuStr() + " adalah " + 
                        Waktu.selisihWaktu(
                                waktu_pertama, waktu_kedua
                        ).getWaktuStr());
        }
         
}
