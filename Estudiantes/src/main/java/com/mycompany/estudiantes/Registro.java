/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estudiantes;
/**
 *
 * @author user
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Registro {

    ArrayList<Estudiantes> estudiante = new ArrayList<>();
    
    public static void main(String[] args){
        Registro reg = Registro();
        reg.ProcesarComandos();
    }

    public int ProcesarComandos(String comando) {
        String[] elist = comando.split("&");
        int opcion = Integer.parseInt(elist[0]);
        switch (opcion) {
            case 1:
                String nivel = elist[1];
                String nombre = elist[2];
                String programa = elist[4];
                String etnia = elist[5];
                String modalidad;
                int edad = Integer.parseInt(elist[3]);
                String cantidad_creditos;

                if (nivel.equals("Pregrado")) {
                    cantidad_creditos = Integer.parseInt(elist[6]);
                    this.AgregarEstudiante(x);

                } else {
                    mod = elist[6];

                    Posgrado x = new Posgrado(nombre, edad, programa, etnia, mod);
                    this.AgregarEstudiante(x);

                }
                break;
            case 2:
                ListarEstudiante();
                break;
            case 3:
                System.exit(0);
                break;
        }
        return opcion;
        
    public void agregarEstudiante(Estudiante x) {
        estudiante.add(x);
    }
    public void ListarEstudiante(){
        System.out.println("****Listado de estudiantes****");
        for(Object i : estudiante){
            System.out.println(i);
        }
    }
}