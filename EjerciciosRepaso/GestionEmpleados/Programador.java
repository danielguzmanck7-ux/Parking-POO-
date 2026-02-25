package EjerciciosRepaso.GestionEmpleados;

public class Programador extends Empleado {

      private static final double CANTIDAD_EXTRA = 200;

      public Programador (String nombre,double salarioBase){
            super(nombre, salarioBase);
      }
      
      @Override
      public double calcularSueldoFinal(){
            
            double sueldofinal;

            sueldofinal  = salarioBase + CANTIDAD_EXTRA ;
            
            return sueldofinal;
      }
}
