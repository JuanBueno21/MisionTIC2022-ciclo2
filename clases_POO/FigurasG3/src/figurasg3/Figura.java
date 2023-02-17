/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasg3;

/**
 *
 * @author usuario1
 */

//Super clase o clase padre ---> abstract
public abstract class Figura {
    //Atributos
    String color;
    String nombre;
    //Constructor
    public Figura(String color, String nombre){
        this.color=color;
        this.nombre=nombre;
    }
    //Metodos abstract --> solo se definen, cero lógica o cuerpo
    public abstract double area();
    
    public abstract double perimetro();
    
    //Metodos --> cuentan con la definición y lógica o cuerpo
    public void saludar(){
        System.out.println("Hola soy el padre");
    }
    
    // objeto x= new objeto();  x.color --->"blanco"
    
    
    
    
}
