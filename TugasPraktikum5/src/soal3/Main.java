package soal3;

import java.util.Scanner;


public class Main {
        static class NilaiArray { int total, ganjil, genap, min, max; }
        
        private static void cariNilaiArray(int array[], int len, NilaiArray nilai) {
                for(int i = 0 ; i < len; i++) {
                        // min max
                        if (i == 0)
                                nilai.min = nilai.max = array[i];
                        else if(nilai.max < array[i])
                                nilai.max = i;
                        else if(nilai.min > array[i])
                                nilai.min = i;
                        
                        // total
                        
                        nilai.total += array[i];
                        
                        if(i % 2 == 0)
                                nilai.genap += array[i];
                        else
                                nilai.ganjil = array[i];
                }
        }
        
        private static void bubbleSort(int array[], int len) {
                for (int n = 0; n < len; n++) {
                        for (int i = 0; i < len - n - 1; i++) {
				if (array[i] < array[i + 1]) {
                                        int tmp=array[i];
                                        array[i] = array[i+1];
                                        array[i+1] = tmp;
                                }
                        }
                }

        }
        
        
        
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Masukan Panjang Array: ");
                int len = sc.nextInt();
                int[] array = new int[len];
                
                for(int i=0; i < len; i++) {
                        System.out.print("Masukan data ke-" + i + ": ");
                        array[i] = sc.nextInt();
                }
                
                NilaiArray nilai = new NilaiArray();
                cariNilaiArray(array,len,nilai);
                
                System.out.println("Min: " + nilai.min);
                System.out.println("Max: " + nilai.max);
                System.out.println("Total: " + nilai.total);
                System.out.println("Rata-rata: " + (float)nilai.total / len);
                System.out.printf("Total Elemen Ganjil: %d (%s)\n",
                        nilai.ganjil, (nilai.ganjil % 2 == 0) ? "genap" : "ganjil");
                System.out.printf("Total Elemen Genap: %d (%s)\n",
                        nilai.genap, (nilai.genap % 2 == 0) ? "genap" : "ganjil");
                
                
                System.out.println("Mengurutkan (Descending)");
                bubbleSort(array,len);
                
                System.out.print("Terurut:");
                for(int i = 0; i < len; i++) {
                        System.out.print(array[i] + " ");
                }
                System.out.println("");

                sc.close();
        }
}
