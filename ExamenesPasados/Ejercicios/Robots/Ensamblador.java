package ExamenesPasados.Ejercicios.Robots;

public class Ensamblador extends Robots{

      private TipoEmbalaje embalaje;
      private String tipo;
      private int bateria = 100;

      public Ensamblador(TipoEmbalaje embalaje){
            super();
            this.tipo = "ensamblador" + id;
            this.embalaje = embalaje; 
      }
      public Ensamblador(String nombre, TipoEmbalaje embalaje){
            super(nombre);
            this.embalaje = embalaje; 
      }

      public void trabajar() throws MantenimientoException{

            System.out.println(
                        """
                  ---------------
            1. Ensamblador """+this.getId()+ """ 
               
               ensamblando
                  ---------------      
                        """);
                        trabajosRealizados++;

            if(necesitaMantenimiento()){
                  throw new MantenimientoException(getId() + " ta cansado el robot rey");
            }
      }

      @Override 
      public int getLimiteTrabajos(){
            return 5;
      }
}
