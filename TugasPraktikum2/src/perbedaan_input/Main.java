package perbedaan_input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {


                { // BufferedReader
                      
                        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                        System.out.print("Masukkan nama:");
                        String nama;
                        try {
                                nama = br.readLine();
                        } catch (IOException ex) {
                                nama = "";
                        }

                        System.out.print("Masukkan umur:");
                        int umur;
                        try {
                                umur = Integer.parseInt(br.readLine());
                        } catch (IOException ex) {
                                umur = 0;
                        }

                        System.out.println("Nama Anda: " + nama);
                        System.out.println("Umur Anda: " + umur);
                }
                { // Scanner
                 
                        Scanner sc = new Scanner(System.in);

                        System.out.print("Masukkan nama:");
                        String nama = sc.nextLine();

                        System.out.print("Masukkan umur:");
                        int umur = sc.nextInt();

                        System.out.println("Nama Anda: " + nama);
                        System.out.println("Umur Anda: " + umur);

                        sc.close();
                }
        }
}
