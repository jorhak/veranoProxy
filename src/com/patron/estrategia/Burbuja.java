/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.patron.estrategia;

/**
 *
 * @author jorhak
 */
public class Burbuja implements Metodo {

    private int[] lista = {};

    public Burbuja(int[] vector) {
        this.lista = vector;
    }

    @Override
    public int[] ordenar() {
        int temporal = 0;

        for (int i = 0; i < lista.length; i++) {
            for (int j = 1; j < (lista.length - i); j++) {
                if (lista[j - 1] > lista[j]) {
                    temporal = lista[j - 1];
                    lista[j - 1] = lista[j];
                    lista[j] = temporal;
                }
            }
        }
        return lista;
    }

}
