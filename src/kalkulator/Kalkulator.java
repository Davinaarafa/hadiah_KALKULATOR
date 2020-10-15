/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

import java.util.Scanner;

/**
 *
 * @author MOKLET-02
 */
public class Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //kalkulator
         int nilai1, nilai2;
         
         Scanner input = new Scanner(System.in);
         
         System.out.println(" KALKULATOR ");
         System.out.print(" Nilai a : ");
         nilai1 = input.nextInt();
         System.out.print(" Nilai b : ");
         nilai2 = input.nextInt();
         
         System.out.println("Penjumlahan = "+(nilai1+nilai2));
         System.out.println("Pengurangan = "+(nilai1-nilai2));
         System.out.println("Pembagian = "+(nilai1/nilai2));
         System.out.println("Perkalian = "+(nilai1*nilai2));
         System.out.println("Modulus = "+(nilai1%nilai2));
    }
    
}
