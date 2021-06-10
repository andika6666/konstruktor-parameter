/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parameter;

/**
 *
 * @author andk
 */
public class Konstruktor {
    
    int harga, bayar, kembalian;
    
    void Konstruktor (int harga, int bayar){
        this.harga = harga;
        this.bayar = bayar;
        
    }
     void hitung (){
         kembalian = bayar - harga;
         System.out.println (" Jumlah total = "+ kembalian);
    }
    
}
