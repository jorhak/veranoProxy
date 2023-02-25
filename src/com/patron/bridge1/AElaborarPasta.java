/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.patron.bridge1;

/**
 *
 * @author jorhak
 */
public abstract class AElaborarPasta {
    private IElaborar elaborar;
    
    public void setImplementador(IElaborar implemenador){
        elaborar = implemenador;
    }
    
    public IElaborar getImplementador(){
        return elaborar;
    }
    
    public abstract void obtener();
}
