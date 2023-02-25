/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.patron.plantilla;

/**
 *
 * @author jorhak
 */
public class SerieB extends Sumatoria{

    public SerieB(int valor) {
        super(valor);
    }

    @Override
    public String procesar(int valor) {
        return valor==0 ? "1" : String.valueOf(valor*10);
    }
    
}
