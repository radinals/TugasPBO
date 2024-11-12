package soal5;

public class Main {
        
        public static void setengahSegitiga(int baris) {

                for (int y = 0; y < baris; y++){
                        
                        for (int x = 0; x < baris - y; x++) 
                                System.out.print(" ");

                        for (int x = 0; x <= y*2; x++)  {
                          
                            System.out.print("*");
                        }
                        System.out.println("");
                }
        }
        
        
        public static void segitigaPenuh(int baris) {
               
                setengahSegitiga(baris-baris/2);

                baris = baris/2;
                
               for (int y = baris-1; y >= 0; y--) {
                       
                for (int x = y; x <= baris; x++)
                        System.out.print(" ");
                
                for (int x = 0; x <= y * 2; x++)
                        System.out.print("*");
                System.out.println("");
                
               }
	}

        public static void main(String[] args) {
                setengahSegitiga(5);
                
                System.out.println("");
                
                segitigaPenuh(5);
        }
}
