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
public class Cuadrado extends Figura {
    //Atributos
    public double lado;
    //Constructor
    
    public Cuadrado(double lado, String color,String nombre){
        super(color,nombre);
        this.lado=lado;
    }
    //Metodos
    @Override
    public double area(){
        return this.lado*this.lado;
    }
    
    @Override
    public double perimetro(){
        return this.lado*4;
    }
       
    protected void saludarHijo(){
        System.out.println("Soy el hijo circulo");
    }
    
    
    
}
