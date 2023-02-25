/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.patron.estrategia;

/**
 *
 * @author jorhak
 */
public class MergeSort implements Metodo {

    int[] lista = {};

    public MergeSort(int[] vector) {
        lista = vector;
    }

    @Override
    public int[] ordenar() {
        sort(lista, 0, lista.length-1);
        return lista;
    }

    void merge(int arr[], int beg, int mid, int end) {
        int l = mid - beg + 1;
        int r = end - mid;
        int LeftArray[] = new int[l];
        int RightArray[] = new int[r];
        for (int i = 0; i < l; ++i) {
            LeftArray[i] = arr[beg + i];
        }
        for (int j = 0; j < r; ++j) {
            RightArray[j] = arr[mid + 1 + j];
        }
        int i = 0, j = 0;
        int k = beg;
        while (i < l && j < r) {
            if (LeftArray[i] <= RightArray[j]) {
                arr[k] = LeftArray[i];
                i++;
            } else {
                arr[k] = RightArray[j];
                j++;
            }
            k++;
        }
        while (i < l) {
            arr[k] = LeftArray[i];
            i++;
            k++;
        }
        while (j < r) {
            arr[k] = RightArray[j];
            j++;
            k++;
        }
    }

    void sort(int arr[], int beg, int end) {
        if (beg < end) {
            int mid = (beg + end) / 2;
            sort(arr, beg, mid);
            sort(arr, mid + 1, end);
            merge(arr, beg, mid, end);
        }
    }

}
