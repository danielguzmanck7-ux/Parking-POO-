package ExamenesPasados;

import ExamenesPasados.Ejercicios.Robots.Empaquetador;
import ExamenesPasados.Ejercicios.Robots.Ensamblador;
import ExamenesPasados.Ejercicios.Robots.LineaProduccionException;
import ExamenesPasados.Ejercicios.Robots.Pintor;
import ExamenesPasados.Ejercicios.Robots.Recargable;
import ExamenesPasados.Ejercicios.Robots.Robots;
import java.util.ArrayList;

public class LineasProducion {

      private ArrayList<Robots> robots;

      public LineasProducion(ArrayList<Robots> robots){
            this.robots = new ArrayList<>();
      }

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
            if(r.necesitaMantenimiento()) ;
      }






























/* int mantenimiento = 0;
        int bateria = 0;
        int ambos = 0;

        for (Robots r : robots) {

            boolean necesitaMant = r.necesitaMantenimiento();
            boolean necesitaBat = false;

            if (r instanceof Recargable rec) {
                if (r instanceof Ensamblador e && e.getBateria() < 10)
                    necesitaBat = true;

                if (r instanceof Pintor p && p.getBateria() < 10)
                    necesitaBat = true;
            }

            if (necesitaMant && necesitaBat) ambos++;
            else if (necesitaMant) mantenimiento++;
            else if (necesitaBat) bateria++;
        }

        if (mantenimiento > 0 || bateria > 0 || ambos > 0) {
            throw new LineaProduccionException(
                    "Mantenimiento: " + mantenimiento +
                            " | Batería: " + bateria +
                            " | Ambos: " + ambos
            );
        }

        for (Robots r : robots) {
            try {
                r.trabajar();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
      }*/     
      
   }
}


