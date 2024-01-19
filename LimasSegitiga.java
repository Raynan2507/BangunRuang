
package mainbangunruang;

public class LimasSegitiga extends BangunRuang {
    
        float lAlas;
        float lSisi;
        float tLimas;
    
    @Override
    float Volume(){
        float Volume = lAlas * tLimas ;
        System.out.println("Volume LimasSegitiga:" + Volume);
        return Volume;
    }    

    @Override
    float luasPermukaan (){
       float luasPermukaan = lAlas * lSisi ; 
       System.out.println("luas Permukaan " + luasPermukaan);
       return luasPermukaan;
}
}          

