
package mainbangunruang;

public class Tabung extends BangunRuang{
        float Jari;
        float Tinggi;
    
    @Override
    float Volume(){
        float Volume = (float) (Math.PI * Jari * Jari * Tinggi) ;
        System.out.println("Volume Tabung:" + Volume);
        return Volume;
    }    

    @Override
    float luasPermukaan (){
       float luasPermukaan = (float) (2 * Math.PI * Jari * (Tinggi + Jari)) ; 
       System.out.println("luas Permukaan" + luasPermukaan);
       return luasPermukaan;
}
}

