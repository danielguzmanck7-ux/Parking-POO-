package EjerciciosRepaso.SistemasBancarios;

public interface Operable {

      void ingresar (double cantidad);

      void retirar (double cantidad) throws SaldoInsufiencenteExcepcion;
      
}
