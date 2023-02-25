/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.patron.plantilla;

/**
 *
 * @author jorhak 1 3 5 7 9 11
 */
public class SerieA extends Sumatoria{

    public SerieA(int valor) {
        super(valor);
    }
    

    @Override
    public String procesar(int valor) {

        return valor!=0 ? String.valueOf(valor+2): "1"; 
    }
    
}
