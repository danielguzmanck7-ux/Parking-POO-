package ExamenesPasados.Examen;

public class BiblioException extends Exception {

      private String mensaje;

      public BiblioException (String mensaje){
            // super(mensaje);
            this.mensaje = mensaje;
      }

      public String getMensaje(){
            return mensaje;
      }
}
