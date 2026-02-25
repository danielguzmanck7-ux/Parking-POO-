package EjerciciosRepaso;

import java.util.ArrayList;

public class Principe {

      public static void main (String [] args){
            
            ArrayList <Empleado> empleados = new ArrayList <Empleado>();

            empleados.add(new Programador("Manu", 1200));
            empleados.add(new Gestor("Rick", 2000));

            for(Empleado emp : empleados){
                  System.out.println(emp.getNombre() + " Salario: " + emp.calcularSueldoFinal());
            }
      }
      
}
