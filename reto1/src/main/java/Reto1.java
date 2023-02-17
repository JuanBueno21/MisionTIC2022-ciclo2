/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.reto1;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class Reto1 {

    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int casa;
        int duracionViaje, proxEsfera;
        //System.out.println();
        casa = sc.nextInt();
        
        proxEsfera = ((casa + 2) * 2);
        duracionViaje = (casa + proxEsfera) / 5 ;
        
        System.out.print(casa + " ");
        System.out.print(proxEsfera + " ");
        System.out.println(duracionViaje);
        
        if (duracionViaje >= 0 && duracionViaje <=20) {
            System.out.print("uno");
        }
        
        if (duracionViaje >= 21 && duracionViaje <=30){
            System.out.print("dos");
        }
        
        if (duracionViaje >= 31 && duracionViaje <=50){
            System.out.print("tres");
        }
        
        if (duracionViaje >= 51){
            System.out.print("cuatro");
        }
        
        }
    }
