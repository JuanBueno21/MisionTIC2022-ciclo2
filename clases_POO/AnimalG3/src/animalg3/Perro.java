/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalg3;

/**
 *
 * @author usuario1
 */

//heredar interfaces se utiliza implements
public class Perro implements Animal{
    @Override
    public void comer(){
        System.out.println("Estoy comiendo");
    }
    @Override
    public void dormir(){
        System.out.println("ZZZZZZZ");
    }
    @Override
    public void cazar(){
        System.out.println("Estoy de caza");
    }
}
