
package com.mycompany.buah;

public abstract class Buah {
    private String nama;
    
    public Buah(String nama){
        this.nama = nama;
    }
    
    public String getnama(){
        return nama;
    }
    public abstract void warna();
}
