/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.patron.bridge;

/**
 *
 * @author jorhak
 */
public abstract class AElaborarAlimento {
    private IElaborar elaborar;
    
    public void setImplementador(IElaborar implementador){
        elaborar = implementador;
    }
    
    public IElaborar getImplementador(){
        return elaborar;
    }
    
    public abstract void obtener();
    
}
