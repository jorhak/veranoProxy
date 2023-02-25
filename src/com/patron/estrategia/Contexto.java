/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.patron.estrategia;

/**
 *
 * @author jorhak
 */
public class Contexto {
    
    private Metodo estrategia;
    
    public Contexto(){}
    
    public void setEstrategia(Metodo metodo){
        estrategia = metodo;
    }
    
    public int[] procesar(){
        return estrategia.ordenar();
    }
}
