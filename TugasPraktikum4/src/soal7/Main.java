package soal7;

public class Main {
        public static void main(String[] args) {
                int n = 0;
		System.out.println("n = " + n);
                while(n < 10) {
                        System.out.println("n++ : " + (n++));
                }
                
                System.out.println("");
                
                n=0;
		System.out.println("n = " + n);
                while(n < 10) {
                        System.out.println("++n : " + (++n));
                }
        }
}
