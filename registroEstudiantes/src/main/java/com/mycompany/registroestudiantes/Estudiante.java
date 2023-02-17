package com.mycompany.registroestudiantes;
/**
 * @author user
 */
public class Estudiante {
    String nombre;
    int edad;
    String programa;
    String tipo_etnia;

    public Estudiante(String nom, int ed, String pro, String etnia) {
        this.nombre = nom;
        this.edad = ed;
        this.programa = pro;
        this.tipo_etnia = etnia;
    }

    
    public String cargar(String[] estudiante) {
        this.nombre = estudiante[2];
        this.edad = Integer.parseInt(estudiante[3]);
        this.programa = estudiante[4];
        this.tipo_etnia = estudiante[5];
        Estudiante estu = new Estudiante(this.nombre, this.edad, this.programa, this.tipo_etnia);
        return "\n\tnombre: "+this.nombre+"\n\tedad: "+this.edad+"anios"+"\n\tprograma: "+this.programa+"\n\tetnia: "+this.tipo_etnia;

    }

}
