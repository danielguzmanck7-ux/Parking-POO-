package EjerciciosRepaso.SistemasBancarios;

public class Cuenta implements Operable {

     private double saldo; 

     public Cuenta (double saldo){
            this.saldo = saldo;
     }

     public double getSaldo(){
      return saldo;
     }

     @Override
     public void ingresar (double cantidad){

      if(cantidad > 0){
                  saldo = saldo + cantidad;
            }
      
     }

     @Override
     public void retirar (double cantidad) throws SaldoInsufiencenteExcepcion {
            if(cantidad > saldo){
                  throw new SaldoInsufiencenteExcepcion(" amigo no puedes retirar mas dinero del que tienes ");
            }
            if(cantidad > 0){
                  saldo = saldo - cantidad;
            }
      }

     }
