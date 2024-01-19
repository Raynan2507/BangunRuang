
package mainbangunruang;

public class Bola extends BangunRuang{
    float Jari;
    
    @Override
    float Volume(){
        float Volume = (float) (4/3 * Math.PI * Jari * Jari * Jari) ;
        System.out.println("Volume Balok:" + Jari);
        return Volume;
    }    

    @Override
    float luasPermukaan (){
       float luasPermukaan = (float) (4/3 + Math.PI * Jari * Jari ); 
       System.out.println("luas Permukaan" + Jari);
       return luasPermukaan;

}
}

       