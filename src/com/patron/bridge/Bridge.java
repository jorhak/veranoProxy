/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.patron.bridge;

/**
 *
 * @author jorhak
 */
public class Bridge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AElaborarAlimento lasaña = new ElaborarLasaña(new Carne());
        lasaña.obtener();
        
        lasaña.setImplementador(new Verduras());
        lasaña.obtener();
    }
    
}
