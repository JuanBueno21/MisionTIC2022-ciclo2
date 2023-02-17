/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import figurasg3.Circulo;
import figurasg3.Cuadrado;
import figurasg3.Triangulo;
import java.util.Scanner;

/**
 *
 * @author usuario1
 */
public class FigurasG3 {
    /**
     * @param args the command line arguments
     */
    
     
    public static void main(String[] args) {
        Circulo primerCirculo= new Circulo(2,"azul","circulo1");
        Cuadrado primerCuadrado= new Cuadrado(5,"Verde","cudrado1");
        Triangulo primerTriangulo= new Triangulo(3,2,3,"rojo","triangulo1");
        System.out.println(primerCirculo.area());
        System.out.println(primerCirculo.perimetro());
        System.out.println(primerTriangulo.perimetro());
        System.out.println(primerTriangulo.area2());
        System.out.println(primerCuadrado.area());
        Circulo.prueba();
                
    }
    
    
}
