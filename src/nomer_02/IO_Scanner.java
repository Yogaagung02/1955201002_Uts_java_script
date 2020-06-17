/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomer_02;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class IO_Scanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          System.out.println("Luas Persegi Panjang");
        int p,l,hasil;
        Scanner in=new Scanner(System.in);
        System.out.println("Masukkan Panjang = ");
        p=in.nextInt();
        System.out.println("Masukkan Lebar  =");
        l=in.nextInt();
        hasil=p*l;
        System.out.println("Luas Perssegi Panjang Adalah  ="+hasil);
    }
    
}
