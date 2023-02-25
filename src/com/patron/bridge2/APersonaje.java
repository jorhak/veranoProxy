/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.patron.bridge2;

import java.awt.Image;

/**
 *
 * @author jorhak
 */
public abstract class APersonaje {
    ICaracteristicas caracteristicas;
    String nombre;
    Image imagen;
    
    public void setImplementador(ICaracteristicas implementador){
        caracteristicas = implementador;
    }
    
    public ICaracteristicas getImplementador(){
        return caracteristicas;
    }
    
    public void setNombre(String nombrePersonaje){
        nombre = nombrePersonaje;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setImagen(Image imagenPersonaje){
        imagen = imagenPersonaje;
    }
    
    public Image getImagen(){
        return imagen;
    }
    public abstract void obtener();
}
