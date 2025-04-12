/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan4;

import java.util.Scanner;

/**
 *
 * @author Nyoman Arya Wiyaksana
 * TGL 12-04-2025
 */
public class Pertemuan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] nama = new String[5];
        
        // Predefined names (optional, can be removed)
        nama[0] = "A";
        nama[1] = "B";
        nama[2] = "C";
        nama[3] = "D";
        nama[4] = "E";
        
    
        try (Scanner inp = new Scanner(System.in)) {
            for (int idx = 0; idx < 5; idx++) {
                System.out.print("Data teman ke-" + (idx + 1) + ": ");
                nama[idx] = inp.nextLine();
            }
            
            String NamaTeman = nama[2];
            System.out.printf("Data Teman: %s\n", NamaTeman);
            
            System.out.println("\nData teman yang dimasukkan:");
            for (int idx = 0; idx < 5; idx++) {
                System.out.println("Teman ke-" + (idx + 1) + ": " + nama[idx]);
            }
        }
    }
    
}
