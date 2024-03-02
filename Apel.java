
package com.mycompany.buah;


public class Apel extends Buah implements rasa{
    public Apel(String nama){
        super(nama);
    }
    
    @Override
    public void warna(){
        System.out.println("Merahnya belum tua");
    }
    
    @Override
    public void taste(){
        System.out.println(getnama()+"Lagi dipanen");
    }
}
