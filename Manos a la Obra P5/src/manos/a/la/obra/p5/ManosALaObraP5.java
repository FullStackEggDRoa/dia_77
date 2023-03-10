/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manos.a.la.obra.p5;

import Entidades.Animal;
import Entidades.Gato;
import Entidades.Perro;
import java.util.ArrayList;

/**
 *
 * @author droa
 */
public class ManosALaObraP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <Animal> animales = new ArrayList<>();
        
        animales.add(new Animal());
        animales.add(new Perro());
        animales.add(new Gato());
        
        System.out.println("..:: Ejecutar Ruidos ::.. ");
        System.out.println("");
        
        for(Animal aux : animales){
            aux.hacerRuido();
            System.out.println("");
        }
        
        
        
    }
    
}
