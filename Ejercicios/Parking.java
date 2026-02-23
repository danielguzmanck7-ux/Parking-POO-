import java.util.ArrayList;

import java.util.*;

public class Parking {

      private ArrayList<String> matriculas;
      private String nombre; 

      public Parking (String nombre, int nPlazas){

      this.nombre = nombre;
      matriculas = new ArrayList<String>();

      for(int i = 0 ; i < nPlazas; i++){
            matriculas.add(null);
      }
}

      public String getNombre(){
            return nombre;
      }

      public void entrada (String matricula, int plaza ) throws ParkingException{

            if (matricula == null || matricula.length() < 4){
                  throw new ParkingException(" matricula incorrecta ", matricula);
            }
            if (plaza < 0  || plaza >= matriculas.size()){
                  throw new ParkingException(" plaza inexistente ", matricula);
            }
            if (matriculas.get(plaza) != null){
                  throw new ParkingException(" plaza ocupada ", matricula);
            }
            if (matriculas.contains(matricula)){
                  throw new ParkingException(" matricula repetida ", matricula);
            }
            matriculas.set(plaza, matricula);
      }

      public int salida(String matricula) throws ParkingException{

            int plazaLiberada = -1;

            if (!matriculas.contains(matricula)){
                  throw new ParkingException(" matricula no existente ", matricula);
            }
            // Este de abajo es una forma mas simple del FOR, utiliza indexOf que es un metodo encargado de devolver el lugar donde se encuentra esa matricula especifica. Despues de eso simplemente coges ese sitio, lo pones a nulo y despues lo devuelves  
            /* int plaza = matriculas.indexOf(matricula);
            matriculas.set(plaza,null);
            return plaza;*/
      }
}
