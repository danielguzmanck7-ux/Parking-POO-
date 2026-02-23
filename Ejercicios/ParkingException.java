public class ParkingException extends Exception {

      private final String mensaje;
      private final String matricula;

      public ParkingException (String mensaje, String matricula){
            
            // super(mensaje); //esta bitch nos va a llamar al constructor de dentro de la clase madre (Excepcion)para guardarlo en la excepcion base si decidimos utilizar super basicamente utilizamos ya el mensaje de la clase madre exception, osea, nos sobraria definirlo de nuevo

            this.mensaje = mensaje; 
            this.matricula = matricula;
      }

      public String getMensaje(){
            return mensaje;
      }
      public String getMatricula(){
            return matricula;
      }
}
