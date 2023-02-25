/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.patron.bridge1;

/**
 *
 * @author jorhak
 */
public class ElaborarRabioli extends AElaborarPasta{

    public ElaborarRabioli(IElaborar implementador) {
        setImplementador(implementador);
    }

    
    @Override
    public void obtener() {
        System.out.println("Preparando Rabiolis...");
        getImplementador().procesar();
    }
    
}
