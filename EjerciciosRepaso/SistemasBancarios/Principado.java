package EjerciciosRepaso.SistemasBancarios;

public class Principado {

      public static void main(String[] args) {
            
            Cuenta cuenta = new Cuenta (3000);
            try{
                  System.out.println(" -- Saldo Inicial -- " + cuenta.getSaldo());

                  cuenta.retirar(100.6);
                  cuenta.ingresar(25.4);

                  System.out.println(" -- Saldo Final -- " + cuenta.getSaldo());

            }catch(SaldoInsufiencenteExcepcion e){
                  System.out.println(" Te equivocaste, " + e.getMessage());
            }
            System.out.println("---Acabaou---");
      }

}
