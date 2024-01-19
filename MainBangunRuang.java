
package mainbangunruang;

public class MainBangunRuang {
    public static void main(String[] args) {
        
        BangunRuang bangunRuang = new BangunRuang ();
        
        Bola Bola = new Bola ();
        Bola.Jari = 5;
        
        Balok Balok = new Balok ();
        Balok.Panjang = 2;
        Balok.Lebar = 3;
        Balok.Tinggi = 5;
        
        LimasSegitiga LimasSegitiga = new LimasSegitiga ();
        LimasSegitiga.lAlas = 5;
        LimasSegitiga.lSisi = 10;
        LimasSegitiga.tLimas = 5;

        Tabung Tabung = new Tabung ();
        Tabung.Jari = 4;
        Tabung.Tinggi = 2;
        
        bangunRuang.Volume();
        bangunRuang.luasPermukaan();
        Bola.Volume();
        Bola.luasPermukaan();
        Balok.Volume();
        Balok.luasPermukaan();
        LimasSegitiga.Volume();
        LimasSegitiga.luasPermukaan();
        Tabung.Volume();
        Tabung.luasPermukaan();
                
    }
    
}
