package com.learn.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainChallenge {

    public static void main(String[] args) {

        //-----------------------------------------------------------------------------------
        // Ejercicio 
        // Crear una lista de destinos de viaje y eliminar aquellos que contienen la letra "a".
        
        List<String> destinos = new ArrayList<>();
        destinos.add("París");
        destinos.add("Tokio");
        destinos.add("Nueva York");
        destinos.add("Londres");
        destinos.add("París");

        System.out.println("Destinos de viaje -> " + destinos);

        // Intentar eliminar destinos que contienen la letra "a" con un loop for.
        try {
             for (String string : destinos) {
                if(string.contains("a")) {    
                    destinos.remove(string);
                }          
            }
        } catch (Exception e) {
            // Capturar la excepción y mostrar un mensaje de error.
            System.err.println("Error: Al intentar eliminar ciudades que contienen la letra a.");
        }

        // Intentar eliminar destinos que contienen la letra "a" de forma correcta utilizando un iterador.
        Iterator<String> it = destinos.iterator();
        
        while (it.hasNext()) {

            String string = it.next();

            // Se debe poder eliminar las ciudades con la letra a sin generar una excepción como la que genera el código en la línea 28
         
        
        }
        // La repuesta esperada seria la siguiente: Destinos sin la letra a -> [Tokio, Londres]
        System.out.println("Destinos sin la letra a -> " + destinos);
    }
}