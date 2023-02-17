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
public class Triangulo extends Figura {
    //Atributos
    public double base;
    public double altura;
    public double lado1;
    public double lado2;
    public double lado3;
    //Constructor
    public Triangulo(double base, double altura,String color, String nombre){
        super(color,nombre);
        this.altura= altura;
        this.base= base;
    }
    
    public Triangulo(double lado1, double lado2, double lado3,String color, String nombre){
        super(color,nombre);
        this.lado1=lado1;
        this.lado2=lado2;
        this.lado3=lado3;
    }
    //Metodos
    
    //No se permite hacer sobrecarga de metodos sobreescritos
    @Override
    public double area(){
        return (this.base*this.altura)/2;
    }

    public double area2(){
        double s= this.perimetro()/2;
        return (Math.sqrt((s*(s-this.lado1)*(s-this.lado2)*(s-this.lado3))));
    }
    
    @Override
    public double perimetro(){
        return this.lado1+this.lado2+this.lado3;
    }
   
    
    
}
