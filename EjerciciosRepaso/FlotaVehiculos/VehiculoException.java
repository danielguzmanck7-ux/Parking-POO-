package EjerciciosRepaso.FlotaVehiculos;

public class VehiculoException extends Exception {

      private int velocidad;
      private String mensaje;

      public VehiculoException(int velocidad, String mensaje){
            this.velocidad = velocidad;
            this.mensaje = mensaje;
      }

      public int getVelocidad(){
            return velocidad;
      }
      public String getMensaje(){
            return mensaje;
      }

}
