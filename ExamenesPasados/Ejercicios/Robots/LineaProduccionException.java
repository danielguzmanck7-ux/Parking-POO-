package ExamenesPasados.Ejercicios.Robots;

public class LineaProduccionException extends Exception{

      private String mensaje;

      public LineaProduccionException(String mensaje){
            this.mensaje = mensaje;
      }
      public String getMensaje() {
            return mensaje;
      }

}
