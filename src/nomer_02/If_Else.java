/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomer_02;

/**
 *
 * @author LENOVO
 */
public class If_Else {
    public static void main(String[] args) {
        int nilai = 1;
        String pesan="", jumlah="";

        if (nilai>2) {
            jumlah = "Lebih besar dari 2";
            if(nilai%2 == 0){
                pesan = "Bilangan Genap";
            }else{
                pesan = "Bilangan Ganjil";
            }
            System.out.println(jumlah+" dan "+pesan);
        }else{
            jumlah = "Lebih kecil dari 2";
            System.out.println(jumlah);
        }


    }
   
}
