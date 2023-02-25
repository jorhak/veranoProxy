/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.patron.bridge1;

/**
 *
 * @author jorhak
 */
public class Bridge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un objeto de tipo 'AbstraccionRefinada' indicándole un 'ImplementadorConcreto'
         AElaborarPasta ravioli = new ElaborarRabioli( new Cocinar() );
        // Realizar el proceso de que se trate (cocinar)
         ravioli.obtener();
        // Cambiar de implementador y realizar el proceso (envasar)
         ravioli.setImplementador( new Envasar() );
         ravioli.obtener();
        System.out.println("-------------");
        AElaborarPasta lasagna = new ElaborarLasaña( new Cocinar() );
        lasagna.obtener();
        lasagna.setImplementador( new Envasar() );
        lasagna.obtener();
    }
    
}
