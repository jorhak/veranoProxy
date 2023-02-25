/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.patron.plantilla;

/**
 *
 * @author jorhak
 */
public abstract class Sumatoria {

    private int n;

    public Sumatoria(int valor) {
        this.n = valor;
    }

    public String metodoPlantilla() {
        int contador = 1;
        String serie = "0";
        String valor = "";
        while (contador <= n) {
            serie = procesar(Integer.parseInt(serie));
            valor += serie + "+";
            contador++;
        }
        return valor;
    }

    public abstract String procesar(int contador);
}
