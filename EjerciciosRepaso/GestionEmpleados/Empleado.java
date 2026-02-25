package EjerciciosRepaso.GestionEmpleados;

public abstract class Empleado {

      protected String nombre;
      protected double salarioBase;

      public Empleado(String nombre, double salarioBase){
            this.nombre = nombre;
            this.salarioBase = salarioBase;
      }

      public abstract double calcularSueldoFinal();

      public String getNombre(){
            return nombre;
      }

      public double getSalarioBase(){
            return salarioBase;
      }

}
