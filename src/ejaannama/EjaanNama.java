/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejaannama;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 * NAMA         : HARRY APRIADI
 * KELAS        : PBONGULANG
 * NIM          : 10116413
 * DESKRIPSI    :  program yang berisi ejaan nama
 */
public class EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Nama;
        int Panjang;
        char huruf;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan Nama depan untuk di eja : ");
        Nama = scanner.nextLine();
        
        Panjang = Nama.length();
        
        System.out.println("Ejaan untuk " + Nama + " adalah : ");
        
        for (int i = 0; i < Panjang; i++){
            System.out.println("Huruf ke-" + (i+1) + " : " + Nama.charAt(i));
        }
    }
    
}
