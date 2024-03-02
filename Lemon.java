
package com.mycompany.buah;


public class Lemon extends Buah implements rasa{
    public Lemon(String nama){
        super(nama);
    }
    
    @Override
    public void warna(){
        System.out.println("Kuning menyala abangda!");
    }
    
    @Override
    public void taste(){
        System.out.println(getnama()+"Lagi dibikin topping");
    }
}
