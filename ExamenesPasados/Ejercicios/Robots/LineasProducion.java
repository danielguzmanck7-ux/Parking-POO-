package ExamenesPasados.Ejercicios.Robots;

import java.util.ArrayList;

public class LineasProducion {

      private ArrayList<Robots> robots = new ArrayList<>();

      public int[] getUnidades(){
            int pint = 0;
            int ensam = 0;
            int empa = 0;
            
            for(Robots r:robots){
            ensam +=(r instanceof Ensamblador) ? 1:0;
            pint  += (r instanceof Pintor) ? 1:0;
            empa  += (r instanceof Empaquetador) ? 1:0;
            }
                  return new int[] {pint,ensam,empa};
      }
      public void anadirRobot(Robots robot){
            robots.add(robot);
      }
      public void anadirRobot(Robots robot, int posicion){
            robots.add(posicion, robot);
      }

      public void start()throws LineaProduccionException{

            int mantenimiento = 0;
            int bateria = 0;
            int ambos = 0;

      for(Robots r : robots){
            boolean necesitaMant = r.necesitaMantenimiento();
            boolean necesitaBat  = false;
      
            if (r instanceof Recargable){
                  if(r instanceof Ensamblador e && e.getBateria() < 10){
                        necesitaBat = true;
                  }
                  if(r instanceof Pintor x && x.getBateria() < 10){
                        necesitaBat = true;
                  }               
            }
            if (necesitaBat && necesitaMant)ambos++;
            else if (necesitaBat)bateria++;
            else if (necesitaMant)mantenimiento++;
      }

      if (bateria > 0 | mantenimiento > 0 | ambos > 0 )
      throw new 
      LineaProduccionException("Problemas: \n --falta bateria " + bateria + 
      " --falta mantenimiento " + mantenimiento+ " --faltan ambos " + ambos);

      for(Robots r:robots){
            try {
                  r.trabajar();
            } catch (Exception e) {
                  System.out.println("Error " + e.getMessage());
            }
      }  
   }
}


