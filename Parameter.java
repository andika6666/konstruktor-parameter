/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konstruktorparameter;

/**
 *
 * @author MOKLET-1
 */
public class Parameter {
     String hasil ;
    int angka ;
    
    //Konstruktor dengan 2 Parameter
    public Parameter(String hasil_baru, int angka_baru){
        hasil = hasil_baru;
        angka = angka_baru;
    }
    
    public static void main(String[] args){
        //Objek Pertama
        Parameter data1 = new Parameter("hasil penjualan hari minggu", 800000);
        //Objek Kedua
        Parameter data2 = new Parameter("hasil penjualan hari senin", 457000);
        //Mencetak Nilai dari Objec Pertama
        System.out.println(data1.hasil);
        System.out.println(data1.angka);
        //Mencetak Nilai dari Objec Pertama
        System.out.println(data2.hasil);
        System.out.println(data2.angka);
    }
}
