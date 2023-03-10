/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manos.a.la.obra.p9;

import Entidades.Animal;
import java.util.ArrayList;

/**
 *
 * @author droa
 */
public class ManosALaObraP9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        ArrayList<Animal> animales = new ArrayList<>();
        
        animales.add(new Animal());
        animales.add(new Animal().procrear());
        
        for(Animal aux: animales){
            aux.hacerRuido();
        }
        
    }
    
}
