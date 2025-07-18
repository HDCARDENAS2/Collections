package com.learn.java;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Ejercicios de colecciones en Java
        // * Importar las colecciones necesarias según el ejercicio.

        //-----------------------------------------------------------------------------------
        // Ejercicio 1: Almacena una lista de destinos de viaje que planeas visitar. El orden en que los agregas es importante y puedes tener el mismo destino varias veces.
        // Reglas: Usar una colección que mantenga el orden de inserción y permita duplicados.
        // solo se puede solucionar usando las colecciones sin usar logica de programación.  
        // Datos de ejemplo: "París", "Tokio", "Nueva York", "Londres", "París"

        //-----------------------------------------------------------------------------------
        // Ejercicio 2: Registra los correos electrónicos de los usuarios suscritos a un boletín. Cada correo electrónico debe ser único. El orden no importa.
        // Reglas: Usar una colección que no permita duplicados.
        // solo se puede solucionar usando las colecciones sin usar logica de programación.  
        // Datos de ejemplo: "user1@example.com", "user2@example.com", "user1@example.com"
 
         //-----------------------------------------------------------------------------------
        // Ejercicio 3: Crea un ranking de los puntajes más altos en un juego. Los puntajes deben ser únicos y estar ordenados de mayor a menor.
        // Reglas: Usar una colección que almacene elementos únicos y los mantenga ordenados de forma descendente.
        // solo se puede solucionar usando las colecciones sin usar logica de programación.  
        // Datos de ejemplo: 1200, 850, 1500, 850, 950
        
        //-----------------------------------------------------------------------------------
        // Ejercicio 4: Guarda el inventario de una tienda. Para cada producto (por su código único), almacena la cantidad disponible.
        // Reglas: Usar una colección de pares clave-valor para asociar un producto con su cantidad.
        // solo se puede solucionar usando las colecciones sin usar logica de programación.  
        // Datos de ejemplo: "A001" -> 10, "B002" -> 25, "C003" -> 5
       
        //-----------------------------------------------------------------------------------
        // Ejercicio 5: Tienes una lista de números. Recorre la lista y elimina todos los números pares.
        // Reglas: Iterar sobre una lista y eliminar elementos que cumplan una condición.
        // En este caso si se puede usar logica de programación.
        // Datos de ejemplo: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
       
        //-----------------------------------------------------------------------------------
        // Ejercicio 6: Almacena los resultados de un examen. Para cada estudiante (identificado por su ID), guarda su calificación. Luego, muestra solo los estudiantes que aprobaron (calificación >= 70).
        // Reglas: Usar un mapa, luego iterar sobre él para filtrar y mostrar los que cumplen una condición.
        // En este caso si se puede usar logica de programación.
        // Datos de ejemplo: "ID01" -> 85, "ID02" -> 60, "ID03" -> 95, "ID04" -> 50
        
        //-----------------------------------------------------------------------------------
        // Ejercicio 7: Tienes una lista de etiquetas para artículos de un blog, que puede contener duplicados. Necesitas filtrar una lista de etiquetas únicas, luego ordenarlas alfabéticamente.
        // Reglas: Convertir una lista con duplicados a una colección sin duplicados y ordenada.
        // solo se puede solucionar usando las colecciones sin usar logica de programación. 
        // Datos de ejemplo: "java", "programming", "collections", "java", "tutorial"
        List<String> etiquetasConDuplicados = Arrays.asList("java", "programming", "collections", "java", "tutorial");
        
    }
}