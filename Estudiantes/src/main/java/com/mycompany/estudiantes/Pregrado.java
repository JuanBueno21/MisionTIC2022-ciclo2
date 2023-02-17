/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estudiantes;
/**
 *
 * @author user
 */
public class Pregrado extends Estudiantes{
    public String cantidad_creditos;

    public Pregrado(String nombre, String edad, String programa, String etnia, String cantcre) {
        super(nombre, edad, programa, etnia);
        this.cantidad_creditos = cantcre;
    }
    @Override
    public String toString(){
        return "Estudiantes Pregrado"+"\n"+
               "\t Nombre: "+nombre+"\n"+
               "\t Edad: "+edad+"anios"+"\n"+
               "\t Programa: "+programa+"\n"+
               "\t Modalidad :"+cantidad_creditos+"\n";
                }
}