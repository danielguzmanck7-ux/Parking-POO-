package ExamenesPasados.Examen;

import java.time.LocalDate;
import java.util.ArrayList;

public class Demostrador {

      public static void main(String[] args) {

            ArrayList<RecursosB> biblioteca = new ArrayList<>(5);

            biblioteca.add(new Libro("saly", LocalDate.of(1987,5,23), true, "mario"));

            biblioteca.add(new CD("saly", LocalDate.of(1937, 5, 13), false, "mario"));

            biblioteca.add(new Revista("saly", LocalDate.of(1987, 5, 23), false, 16));

            Persona [] nombres = new Persona [2];
            nombres[0] = new Artista("manu");
            nombres[1] = new Autor("rick");

            for(Persona nombre : nombres){
                  System.out.print(nombre);
            }
            
                  for(RecursosB stock:biblioteca){
                        
                        try{

                        stock.mostrarInformacion();
                        stock.prestar();
                        stock.devolver();
                        
                        }catch(BiblioException e){
                  System.out.println(" Error " + e.getMensaje());
                  }
            }
            

            
      }

}
