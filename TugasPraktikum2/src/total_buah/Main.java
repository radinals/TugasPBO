package total_buah;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
        
        public static int inputInt(String prompt, BufferedReader br) {
                Integer input;
                while(true) {
                        try {
                                System.out.print(prompt);
                                input = Integer.valueOf(br.readLine());
                        } catch (IOException | NumberFormatException e) {
                                continue;
                        }
                        break;
                }
                return input;
        }
        
        public static void main(String[] args) {
                var br = new BufferedReader(new InputStreamReader(System.in));
                
                int jumlah_mangga;
                jumlah_mangga = inputInt("Jumlah Mangga: ", br);
                
                int jumlah_tetangga;
                jumlah_tetangga = inputInt("Jumlah Tetangga: ", br);
                
                int jatah_tetangga;
                jatah_tetangga = inputInt("Jatah Buah Tetangga: ", br);
                
                int jumlah_busuk;
                jumlah_busuk = inputInt("Jumlah Mangga Busuk: ", br);
                
                int jumlah_jambu = jumlah_tetangga * jatah_tetangga;
                jumlah_mangga -= jumlah_busuk;
                
                System.out.println("Jumlah Buah Jambu: " + jumlah_jambu);
                System.out.println("Jumlah Buah Mangga: " + jumlah_mangga);
                System.out.println("Jumlah Total Buah: " + (jumlah_jambu + jumlah_mangga));
        }
        
}
