package EjerciciosRepaso.AcademiaCursos;

import java.util.ArrayList;
import java.util.Scanner;

public class Curso implements Certificable {

      private String nombre;
      private int limite;
      ArrayList <Alumno> lista;
      Scanner sc = new Scanner (System.in);

      public Curso (String nombre, int limite){
            this.limite = limite;
            this.nombre = nombre;
            this.lista = new ArrayList<>();
      }

      @Override
      public  void emitirDiploma(){
            System.out.println("\n=== DIPLOMAS DEL CURSO: " + nombre + " ===");

        for (Alumno a : lista) {
            System.out.println("Diploma emitido para: " + a.getNombre());
      }
}

      public void matricularAlumno(Alumno a) throws AlumnoException {

            if(lista.size() >= limite){
                  throw new AlumnoException(
                        "no se puede matricular " + a.getNombre() + ". Curso LLeno");
            }
            lista.add(a);
            System.out.println("Alumno matriculado: " );

      }
}

