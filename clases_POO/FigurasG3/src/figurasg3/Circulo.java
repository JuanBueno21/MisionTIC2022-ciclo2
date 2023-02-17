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

//extends--> indicamos que se hereda de una superClase
public class Circulo extends Figura{
    //Atributos
    public double radio;
    //Constructor
    public Circulo(double radio, String color, String nombre){
        //heredar constructor del padre -->super
        super(color,nombre);
        this.radio=radio;
    }
    
    @Override // Sobreponer
    public double area(){
        return Math.PI*(this.radio*this.radio);
        //return Math.PI*()Math.pow(this.radio,2);
    }
    //Sobreescribir --> Polimorfismo por herencia
    //Siempre sobreescribimos metodos abstractos
    @Override 
    public double perimetro(){
        return 2*Math.PI*this.radio;
    }
    
    public static void prueba(){
    
    }
    
    
}
