/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Arrays;

/**
 *
 * @author Iago2
 */
public class BubbleSort {

    int vet[];

    public static void bubbleSort(int[] vet) {
        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < vet.length - i - 1; j++) {
                if (vet[j] > vet[j + 1]) {
                    int aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }
    }

//    public static void main(String[] args) {
//        int vet[] = {2009, 2016, 2008, 2012, 2014, 2007};
//        bubbleSort(vet);
//        System.out.println(Arrays.toString(vet));
//    }
}
