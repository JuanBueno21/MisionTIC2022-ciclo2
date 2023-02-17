/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.obra;

/**
 *
 * @author user
 */
import java.util.ArrayList;
import java.util.Arrays;

public class metodos {

    public static void main(String[] args) {
        Obra misObras = new Obra();
        ArrayList<Integer> cat = new ArrayList<>(Arrays.asList(1, 2, 5, 5, 5, 1, 2, 5, 5, 5));
        System.out.println(misObras.clases(cat));

        ArrayList<Integer> falta = new ArrayList<>(Arrays.asList(1, 3, 6, 8));
        int categoria = 5;
        System.out.println(misObras.meFaltanDeLaClase(falta, cat, categoria));

        ArrayList<Integer> museoA = new ArrayList<>(Arrays.asList(3, 5, 7, 10, 15, 16));
        ArrayList<Integer> museoB = new ArrayList<>(Arrays.asList(4, 10, 5, 8));
        System.out.println(misObras.noTengo(museoA, museoB));

        //ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(3,5,7,10,15,16));
        //ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4,10,5,8));
        System.out.println(misObras.puedoCambiar(museoA, museoB));

    }
}
