/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.estudiantes;

/**
 *
 * @author user
 */
public class Estudiantes {
    
        public String nombre;
        public String edad;
        public String programa;
        public String etnia;
        
        public Estudiantes(String nombre, String edad, String programa, String etnia){
            this.nombre = nombre;
            this.edad = edad;
            this.programa = programa;
            this.etnia = etnia;
        }       
     
        @Override
        public String toString(){
            return "\tNombre: "+nombre+"\tEdad: "+edad+"\tprograma: "+programa+"\tEtnia: "+etnia;
            
    }
}

