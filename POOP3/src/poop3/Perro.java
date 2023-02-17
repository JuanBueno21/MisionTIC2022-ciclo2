/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop3;

import java.util.Scanner;

/**
 *
 * @author usuario1
 */
public class Perro {
    //Atributos
    public String nombre;
    public int edad;
    public String raza;
    public static int cont=0;
    
    //static permite definir una variable de forma global dentro de la clase
    //es decir que desde cualquier metodo puede ser llamada y modificada
    static Scanner sc= new Scanner(System.in);
    //Costructor
    
    //Sobrecarga constructores --> Polimorfismo por mensaje
    public Perro(String name,int edad,String raza){
        this.nombre= name;
        this.raza= raza;
        this.edad=edad;
        cont++;
    }
    public Perro(String name){
        this.nombre= name;
        cont++;
    }
    
    //Modificador de acceso-public-protected-private-ninguno
     public void saludar(){
        System.out.println("Hola yo soy: "+this.nombre);
    }
    public void elMayor(Perro perro){
        if(this.edad>perro.edad){
            System.out.println("El mayor es: "+this.nombre+" if");
        }else if(this.edad<perro.edad){
            System.out.println("El mayor es: "+perro.nombre+ " elseif");
        }else{
            System.out.println("Tienen la misma edad");
        }
    }
    protected void laRaza(){
        System.out.println("La raza del perro es: "+this.raza);
    }
    protected void x(){};
    
    //Funciones son de tipo estatico y son independientes
    public static void main(String[]args){
        //Crear un objeto
        Perro perroUno= new Perro("pluto",6,"labrador");
        Perro perroDos= new Perro("firulais",8,"dóberman");
        //Metodos son dependiente de los objetos, por ende se debe construir primero un objeto para utilizar los metodos de la clase
        perroUno.elMayor(perroDos);
        perroDos.elMayor(perroUno);
        perroUno.laRaza();
        System.out.println(cont);
        
        
    }
    
    
    
    
}
