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

//por defecto al utilizar la palabra clave interface --> ya se establece el abstract 
public interface Animal extends AnimalSalvaje {
    //todos los metodos son abstractos --> entonces ninguno puee tener lógica o cuerpo
    public void comer();
    
    public void dormir();
    
    
}
