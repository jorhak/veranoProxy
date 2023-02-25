/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.patron.estrategia;

/**
 *
 * @author jorhak
 */
public class OrdenarVector {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
//        int[] vector = {90, 23, 101, 45, 65, 23, 67, 89, 34, 23};
//        System.out.print("Vector desordenado: ");
//        System.out.println(MostrarVector.mostrar(vector));
//        Burbuja burbuja = new Burbuja(vector);
//        Contexto con = new Contexto();
//        con.setEstrategia(burbuja);
//        System.out.print("Vector ordenado: ");
//        System.out.println(MostrarVector.mostrar(con.procesar()));
        
        
//        int[] vector = {10,9,8,7,6,5,4,3,2,1};
//        System.out.print("Vector desordenado: ");
//        System.out.println(MostrarVector.mostrar(vector));
//        QuickSort quick = new QuickSort(vector, 0, vector.length-1);
//        Contexto con = new Contexto();
//        con.setEstrategia(quick);
//        System.out.print("Vector ordenado: ");
//        System.out.println(MostrarVector.mostrar(con.procesar()));

//        int[] vector = {10,6,8,5,7,3,4};
//        System.out.print("Vector desordenado: ");
//        System.out.println(MostrarVector.mostrar(vector));
//        MergeSort merge = new MergeSort(vector);
//        Contexto con = new Contexto();
//        con.setEstrategia(merge);
//        System.out.print("Vector ordenado: ");
//        System.out.println(MostrarVector.mostrar(con.procesar()));
        
        int[] vector = {38,27,43,3,9,82,10};
        System.out.print("Vector desordenado: ");
        System.out.println(MostrarVector.mostrar(vector));
        MergeSort merge = new MergeSort(vector);
        Contexto con = new Contexto();
        con.setEstrategia(merge);
        System.out.print("Vector ordenado: ");
        System.out.println(MostrarVector.mostrar(con.procesar()));

        
    }

}
