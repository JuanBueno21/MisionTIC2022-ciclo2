/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estudiantes;
/**
 *
 * @author user
 */
public class Posgrado extends Estudiantes{
    public String modalidad;
    
    
    public Posgrado(String nombre, String edad, String programa, String etnia, String mod){
        super(nombre, edad, programa, etnia);
        this.modalidad = mod;
    }
    @Override
    public String toString(){
        return "Estudiantes Posgrado"+"\n"+
               "\t Nombre: "+nombre+"\n"+
               "\t Edad: "+edad+"anios"+"\n"+
               "\t Programa: "+programa+"\n"+
               "\t Modalidad :"+modalidad+"\n";
                
    }  
}