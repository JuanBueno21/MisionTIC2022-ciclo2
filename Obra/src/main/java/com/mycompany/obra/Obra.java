/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.obra;

import java.util.ArrayList;

public class Obra {

    public ArrayList<Integer> clases(ArrayList<Integer> categorias) {
        ArrayList<Integer> catUnica = new ArrayList<>();
        for (Integer i : categorias) {
            if (!catUnica.contains(i)) {
                catUnica.add(i);
            }
        }
        return catUnica;
    }

    public ArrayList<Integer> meFaltanDeLaClase(ArrayList<Integer> falta, ArrayList<Integer> cat, int categoria) {
        ArrayList<Integer> obraFaltante = new ArrayList<>();
        for (int i = 0; i < falta.size(); i++) {
            if (cat.get(falta.get(i)) == categoria) {
                obraFaltante.add(falta.get(i));
            }
        }
        return obraFaltante;
    }

    public ArrayList<Integer> noTengo(ArrayList<Integer> museoA, ArrayList<Integer> museoB) {
        ArrayList<Integer> falta = new ArrayList<>();
        for (Integer i : museoA) {
            if (!museoB.contains(i)) {
                falta.add(i);
            }
        }
        return falta;
    }
    
    
    public Integer puedoCambiar(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> cambiar = new ArrayList<>();
        ArrayList<Integer> cambiar1 = new ArrayList<>();
        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            if (!list2.contains(list1.get(i))) {
                cambiar.add(i);
            }
        }
        for (int i = 0; i < list2.size(); i++) {
            if (!list1.contains(list2.get(i))) {
                cambiar1.add(list2.get(i));
            }
        }
        if (cambiar.size() < cambiar1.size()) {
            num.add(cambiar.size());

        } else {
            num.add(cambiar1.size());
        }

        return num.get(0);
    }
}