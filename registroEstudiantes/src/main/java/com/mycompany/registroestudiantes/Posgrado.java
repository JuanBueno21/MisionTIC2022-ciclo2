package com.mycompany.registroestudiantes;

/**
 *
 * @author user
 */
public class Posgrado {

    String modalidad;

    public Posgrado(String nom, int ed, String pro, String etnia, String mod) {
        
        this.modalidad = mod;
    }
    public String cargar(String[] estudiante) {
        String nom = estudiante[2];
        int ed = Integer.parseInt(estudiante[3]);
        String pro = estudiante[4];
        String etnia = estudiante[5];
        this.modalidad = estudiante[6];
        Posgrado pos = new Posgrado(nom, ed, pro, etnia, this.modalidad);
        return "\n\tnombre: " + nom + "\n\tedad: " + ed + "anios" + "\n\tprograma: " + pro + "\n\tetnia: " + etnia + "\n\tetnia: " + modalidad;
    }
}