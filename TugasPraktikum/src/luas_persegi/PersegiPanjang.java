package luas_persegi;

public class PersegiPanjang {
        private int panjang;
        private int lebar;
        
        public PersegiPanjang(int panjang, int lebar) {
                this.panjang = panjang;
                this.lebar = lebar;
        }
        
        int getLuas() {
                return panjang * lebar;
        }
        
        int getPanjang() {
                return panjang;
        }
        
        int getLebar() {
                return lebar;
        }
}
