package Superheroes;

public class FiguraException extends Exception {

      private String codigo;
      private String mensaje;

      public FiguraException(String codigo, String mensaje) {
            this.codigo = codigo;
            this.mensaje = mensaje;
      }

      public String getMensaje() {
            return mensaje;
      }

      public String getCodigo() {
            return codigo;
      }

}
