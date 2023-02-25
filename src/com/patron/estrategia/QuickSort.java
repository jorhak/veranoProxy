/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.patron.estrategia;

/**
 *
 * @author jorhak
 */
public class QuickSort implements Metodo {

    int[] lista = {};
    int izq;
    int der;

    public QuickSort(int[] vector, int izquierda, int derecha) {
        lista = vector;
        izq = izquierda;
        der = derecha;
    }

    @Override
    public int[] ordenar() {
        Quicksort(lista, izq, der);
        return lista;
    }

    private void Quicksort(int[] lista, int izq, int der) {
        /*Este metodo recibe un arreglo de numero, y dos enteros que referencian el primer valor
            Y el ultimo*/

        //Se toma como pivote el primer valor
        int pivote = lista[izq];

        //Se definen los dos lados y un auxiliar
        int i = izq;
        int j = der;
        int aux;

        while (i < j) {
            while (lista[i] <= pivote && i < j) {
                i++;
            }

            while (lista[j] > pivote) {
                j--;
            }

            if (i < j) {
                aux = lista[i];
                lista[i] = lista[j];
                lista[j] = aux;
            }
        }

        lista[izq] = lista[j];
        lista[j] = pivote;

        if (izq < j - 1) {
            Quicksort(lista, izq, j - 1);
        }

        if (j + 1 < der) {
            Quicksort(lista, j + 1, der);
        }
    }

}
