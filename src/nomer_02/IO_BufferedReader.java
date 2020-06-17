/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomer_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author LENOVO
 */
public class IO_BufferedReader {
    public static void main(String[] args) throws IOException {
             System.out.println("Operasi Menghitung Volume Balok");
        BufferedReader input=new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Operasi Menghitung Volume Balok");
        System.out.println("+------------------------------+");
        System.out.println("Masukkan Panjang Balok\t : ");
        int p=Integer.parseInt(input.readLine());
        System.out.println("Masukkan Lebar Balok\t : ");
        int l= Integer.parseInt(input.readLine());
        System.out.println("Masukkan Tinggi Balok\t : ");
        int t=Integer.parseInt(input.readLine());
        
        int volumeBalok=(p*l*t);
        System.out.println("Volume Baloknya Adalah\t : "+volumeBalok);

    }
 
}
