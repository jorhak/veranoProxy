/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.patron.estrategia;

/**
 *
 * @author jorhak
 */
public class MostrarVector {
    public static String mostrar(int[] vector){
        String cadena = "";
        for (int i = 0; i < vector.length ; i++) {
            cadena += vector[i] + "-";
        }
        return cadena;
    }
}
