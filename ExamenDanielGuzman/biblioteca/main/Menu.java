package ExamenDanielGuzman.biblioteca.main;

import ExamenDanielGuzman.biblioteca.excepciones.*;
import ExamenDanielGuzman.biblioteca.modelos.*;
import ExamenDanielGuzman.Gestor.*;
import java.util.*;

public class Menu {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int opcion;
            String buscar;

            
        Autor cervantes = new Autor("Miguel de Cervantes");
        Artista theBeatles = new Artista("The Beatles");
        Inventario recurso = new Inventario();
        

        // 2. Crear los recursos bibliográficos
        Libro libro = new Libro("Don Quijote de la Mancha", 1605, cervantes);
        Revista revista = new Revista("National Geographic", 2023, 105);
        CD cd = new CD("Abbey Road", 1969, theBeatles);

        System.out.println("Cargando Libros");
        recurso.anadirR(libro);
        System.out.println("Cargando CDS ");
        recurso.anadirR(revista);
        System.out.println("Cargando Revistas ");
        recurso.anadirR(cd);

            do {
                  System.out.print("\n1.Mostrar Todo Inventario \n2.Buscar un recurso por Titulo \n3.Prestar un recurso \n4.Devolver un recurso \55.Salir \n Elige una opcion:");
                  opcion = sc.nextInt();
            
                  return switch (opcion){
                  case 1 -> recurso.mostrarR();
                  case 2 -> recurso.buscarR();
                  case 3 -> recurso.prestar();
                  case 4 -> recurso.devolver();
                  case 5 -> System.out.println(" Saliendo ");
                  default -> System.out.println("Introduce una opcion valida ");
                  }
                  
            } while (opcion != 5);
      }

}
