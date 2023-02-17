/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registroestudiantes;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Registro {

    public String[] estudiantes;
    public int indice;
    public Registro(){
        this.estudiantes = new String[100];
        this.indice = 0;
}
    public void agregarEstudiantes(String conver){
        this.estudiantes[this.indice] = conver;
        this.indice++;
    }
        public void listarEstudiantes(){
        System.out.println("****Listado de estudiantes***");
        for (int i = 0; i < this.indice; i++)
            System.out.println(this.estudiantes[1]);
    }
    public int procesarComandos(String datos){
        String[] accion = datos.split("&");
        int opcion = Integer.parseInt(accion[0]);
        switch (opcion){
            case 1:
                String nom = accion[2];
                int ed = Integer.parseInt(accion[3]);
                String pro = accion[4];
                String etnia = accion[5];
                if (accion[1].equals("Pregrado")){
                    int cantcre = Integer.parseInt(accion[6]);
                    Pregrado pregrado = new Pregrado(nom, ed, pro, etnia, cantcre);
                    agregarEstudiantes(pregrado.cargar(accion));
                    
                }else{
                    String mod = accion[6];
                    Posgrado posgrado = new Posgrado(nom, ed, pro, etnia, mod);
                    agregarEstudiantes(posgrado.cargar(accion));
                }   
            case 2:
            default:
    }
        return opcion;      
}
public static void main(String[] arg) {
    Scanner estudiante = new Scanner(System.in);
    Registro entrada = new Registro();
    int menu = 1;
    while (menu == 1 || menu == 2){
        String datos = estudiante.nextLine();
        menu = entrada.procesarComandos(datos);       
        }
    }
}