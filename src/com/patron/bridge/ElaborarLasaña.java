/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.patron.bridge;

/**
 *
 * @author jorhak
 */
public class ElaborarLasaña extends AElaborarAlimento{
    
    public ElaborarLasaña(IElaborar implementador){
        setImplementador(implementador);
    }

    @Override
    public void obtener() {
        System.out.println("Preparando lasaña");
        getImplementador().procesar();
    }
    
}
