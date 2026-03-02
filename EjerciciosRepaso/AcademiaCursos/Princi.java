package EjerciciosRepaso.AcademiaCursos;

public class Princi {

      public static void main(String[] args) {

            Curso curso = new Curso("Programación Java", 2);

        try {
            curso.matricularAlumno(new Alumno("Ana"));
            curso.matricularAlumno(new Alumno("Luis"));
            curso.matricularAlumno(new Alumno("Carlos")); // provoca excepción

            }catch (AlumnoException e){
            System.out.println(" Error: " + e.getMensaje() + " lo siento ");
            }finally{
                  curso.emitirDiploma();
            }
            
            
      }

}
