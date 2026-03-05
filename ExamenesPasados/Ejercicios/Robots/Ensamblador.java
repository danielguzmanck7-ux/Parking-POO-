package ExamenesPasados.Ejercicios.Robots;

public class Ensamblador extends Robots implements Recargable{

      private static int unidades = 0;

      private TipoEmbalaje embalaje;
      private int bateria = 100;

      public Ensamblador(){
            super();
            this.nombre = "ensamblador" + id;
      }

      public Ensamblador(TipoEmbalaje embalaje){
            super();
            this.nombre = "ensamblador" + id;
            this.embalaje = embalaje; 
            unidades++;
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
            bateria -= 10;
      }

      @Override 
      public int getLimiteTrabajos(){
            return 5;
      }
      public int getUnidadesES(){
            return unidades;
      }
      @Override
      public void recargar(){
            bateria = 100;
      }
      public int getBateria(){
            return bateria;
      }

}
