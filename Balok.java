
package mainbangunruang;

public class Balok extends BangunRuang{
        float Panjang;
        float Lebar;
        float Tinggi;
    
    @Override
    float Volume(){
        float Volume = Panjang * Lebar * Tinggi ;
        System.out.println("Volume Balok:" + Volume);
        return Volume;
    }    

    @Override
    float luasPermukaan (){
       float luasPermukaan = 2 * Panjang * Lebar * Tinggi * Panjang * Lebar * Tinggi ; 
       System.out.println("luas Permukaan" + luasPermukaan);
       return luasPermukaan;
}
}