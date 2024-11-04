package tugas_3;


public class Mobil {
       private String merek;
       private String model;
       private int tahun;
       
       public Mobil(String merek, String model) {
               this.merek = merek;
               this.model = merek;
               this.tahun = 2020;
       }
       
       public Mobil(String merek, String model, int tahun) {
               this.merek = merek;
               this.model = model;
               this.tahun = tahun;
       }
       
       public void info() {
               System.out.println("Merek: " + merek);
               System.out.println("Model: " + model);
               System.out.println("Tahun: " + tahun);
               
       }
}
