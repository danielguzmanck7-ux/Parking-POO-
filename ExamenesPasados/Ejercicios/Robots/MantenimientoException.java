package ExamenesPasados.Ejercicios.Robots;

public class MantenimientoException extends Exception{

      private String mensaje;

      public MantenimientoException(String mensaje){
            this.mensaje = mensaje;
      }
      public String getMensaje() {
            return mensaje;
      }
}
