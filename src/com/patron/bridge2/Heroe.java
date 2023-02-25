/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.patron.bridge2;

/**
 *
 * @author jorhak
 */
public class Heroe extends APersonaje{
    public Heroe(ICaracteristicas caracteristicas, String nombre) {
        setImplementador(caracteristicas);
        setNombre(nombre);
    }

    
    
    @Override
    public void obtener() {
       setImagen(getImplementador().procesar().getImagen());
    }
}
