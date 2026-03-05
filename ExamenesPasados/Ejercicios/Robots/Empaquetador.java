package ExamenesPasados.Ejercicios.Robots;

public class Empaquetador extends Robots{

      private static int unidades = 0;

      public Empaquetador (){
            super();
            this.nombre = "empaquetador" + id;
            unidades++;
      }

      public void trabajar() throws MantenimientoException{


            System.out.println(
                        """
                  ---------------
               3. Empaquetador """+ this.getId() + """ 
               
               Empaquetando en bolsa 
                  ---------------      
                        """);
                        trabajosRealizados++;

            if(necesitaMantenimiento()){
                  throw new MantenimientoException(getId() + " ta cansado el robot rey ");
            }
      }
      @Override
      public int getLimiteTrabajos(){
            return 10;
      }
      public int getUnidadesEP(){
            return unidades;
      }

}
