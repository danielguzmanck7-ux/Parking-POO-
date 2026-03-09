package ExamenDanielGuzman.biblioteca.main;

import ExamenDanielGuzman.biblioteca.excepciones.*;
import ExamenDanielGuzman.biblioteca.modelos.*;
import ExamenDanielGuzman.Gestor.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== INICIANDO SISTEMA DE BIBLIOTECA ===\n");

        // 1. Crear Autores y Artistas
        Autor cervantes = new Autor("Miguel de Cervantes");
        Artista theBeatles = new Artista("The Beatles");
        Inventario recurso = new Inventario();
        

        // 2. Crear los recursos bibliográficos
        Libro libro = new Libro("Don Quijote de la Mancha", 1605, cervantes);
        Revista revista = new Revista("National Geographic", 2023, 105);
        CD cd = new CD("Abbey Road", 1969, theBeatles);

        recurso.anadirR(libro);
        recurso.anadirR(revista);
        recurso.anadirR(cd);

        
        // 3. Mostrar información inicial (Todos deberían estar disponibles)
        System.out.println("--- Catálogo Inicial ---");
        libro.mostrarInformacion();
        revista.mostrarInformacion();
        cd.mostrarInformacion();
        System.out.println();

        // 4. Probar la lógica de préstamos y devoluciones con control de excepciones
        try {
            System.out.println("--- Realizando Préstamos ---");
            libro.prestar(); // Debería funcionar
            cd.prestar();    // Debería funcionar
            
            // Intentar prestar un libro que ya está prestado para forzar la excepción
            System.out.println("\nIntentando prestar el libro de nuevo...");
            libro.prestar(); 

        } catch (RecursoException e) {
            System.err.println("Error: " + e.getMessage());
        }

        try {
            System.out.println("\n--- Realizando Devoluciones ---");
            libro.devolver(); // Debería funcionar, estaba prestado
            
            // Intentar devolver la revista que NUNCA fue prestada para forzar la excepción
            System.out.println("\nIntentando devolver una revista no prestada...");
            revista.devolver();

        } catch (RecursoException e) {
            System.err.println("Error: " + e.getMessage());
        }

        // 5. Mostrar información final para ver cómo cambiaron los estados

        /*System.out.println("\n--- Catálogo Final ---");
        libro.mostrarInformacion(); // Disponible de nuevo
        revista.mostrarInformacion(); // Siempre estuvo disponible
        cd.mostrarInformacion(); // Sigue prestado (Disponible: false)*/
      
        recurso.buscarR("Don Quijote de la Mancha");
        recurso.mostrarR();

        /* public void anadirR(RecursoBibliografico re){
            for(RecursoBibliografico r:recurso){
                  recurso.add(re);
            }
      }
      public void mostrarR(){
            String d = " ";
            for(RecursoBibliografico r:recurso){
                  d += r.toString() + "\n";
            }
            System.out.print("\n El recurso " + d );
      }
      public String buscarR(String x){
            String d = " ";
            for(RecursoBibliografico r:recurso){
                  if(r.toString().equals(x))d+=r.toString();
                  else d = "null";
            }
            return d;
      } */
    }
}
