/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.stm2lat1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author USER
 */
public class STM2Lat1 {
    
    public static void main(String[] args) {

        ArrayList<String> Hewan = new ArrayList<>(Arrays.asList("Sapi", "Kelinci", "Kambing", "Unta", "Domba"));

        ArrayList<String> DeleteHewan = new ArrayList<>(Arrays.asList("Kelinci", "Kambing", "Unta"));

        System.out.println("Hewan : ");
        System.out.println(Hewan);
        
        System.out.println("\nHewan yang dihapus : ");
        System.out.println(DeleteHewan);
        
        for (String warna : DeleteHewan) {
            Hewan.removeIf(h -> h.equalsIgnoreCase(warna));
        }
        
        System.out.println("\nOutput Hewan : ");
        System.out.println(Hewan);
        
        }
    
}

