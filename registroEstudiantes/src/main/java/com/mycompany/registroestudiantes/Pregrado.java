package com.mycompany.registroestudiantes;
/**
 *
 * @author user
 */
public class Pregrado {
    int cantidad_creditos;

    public Pregrado(String nom, int ed, String pro, String etnia, int cantcre) {
        this.cantidad_creditos = cantcre;
    }
    public String cargar(String[] estudiante) {
        String nom = estudiante[2];
        int ed = Integer.parseInt(estudiante[3]);
        String pro = estudiante[4];
        String etnia = estudiante[5];
        this.cantidad_creditos = Integer.parseInt(estudiante[6]);
        Pregrado pre = new Pregrado(nom, ed, pro, etnia, this.cantidad_creditos);
        return "\n\tnombre: " + nom + "\n\tedad: " + ed + "anios" + "\n\tprograma: " + pro + "\n\tetnia: " + etnia + "\n\tetnia: " + cantidad_creditos;
        }
    }
