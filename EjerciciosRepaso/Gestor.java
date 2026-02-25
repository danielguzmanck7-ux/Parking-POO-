package EjerciciosRepaso;

public class Gestor extends Empleado {

      private static final double PORCENTAJE_EXTRA = 0.10;

      public Gestor(String nombre,double salarioBase){

            super(nombre, salarioBase);
      }
      
      @Override
      public double calcularSueldoFinal(){
            
            double sueldofinal;

            double extra = salarioBase * PORCENTAJE_EXTRA ;
            sueldofinal = salarioBase + extra;

            return sueldofinal;
      }
}
