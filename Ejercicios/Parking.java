import java.util.ArrayList;

import java.util.*;

public class Parking {

      private ArrayList<String> matriculas;
      private String nombre;

      public Parking(String nombre, int nPlazas) {

            this.nombre = nombre;
            matriculas = new ArrayList<String>();

            for (int i = 0; i < nPlazas; i++) {
                  matriculas.add(null);
            }
      }

      public String getNombre() {
            return nombre;
      }

      public void entrada(String matricula, int plaza) throws ParkingException {

            if (matricula == null || matricula.length() < 4) {
                  throw new ParkingException(" matricula incorrecta ", matricula);
            }
            if (plaza < 0 || plaza >= matriculas.size()) {
                  throw new ParkingException(" plaza inexistente ", matricula);
            }
            if (matriculas.get(plaza) != null) {
                  throw new ParkingException(" plaza ocupada ", matricula);
            }
            if (matriculas.contains(matricula)) {
                  throw new ParkingException(" matricula repetida ", matricula);
            }
            matriculas.set(plaza, matricula);
      }

      public int salida(String matricula) throws ParkingException {

            int plazaLiberada = -1;

            if (!matriculas.contains(matricula)) {
                  throw new ParkingException(" matricula no existente ", matricula);
            }
            // Este de abajo es una forma mas simple del FOR, utiliza indexOf que es un
            // metodo encargado de devolver el lugar donde se encuentra esa matricula
            // especifica. Despues de eso simplemente coges ese sitio, lo pones a nulo y
            // despues lo devuelves
            /*
             * int plaza = matriculas.indexOf(matricula);
             * matriculas.set(plaza,null);
             * return plaza;
             */

            // recorremos todo el array list y despes miramos cada una de las matriculas que
            // tiene adentro
            for (int i = 0; i < matriculas.size(); i++) {
                  if (matricula.equals(matriculas.get(i))) {
                        matriculas.set(i, null);
                        plazaLiberada = i;
                  }
            }
            return plazaLiberada;
      }

      public int getPlazasTotales() {
            return matriculas.size();
      }

      // lo recorremos y vemosque en el espacio no haya null, si hay null pues
      // seguimos, si no hay pues agregamos 1
      public int getPlazasOcupadas() {
            int ocupadas = 0;

            for (String m : matriculas) {
                  if (m != null)
                        ;
                  ocupadas++;
            }
            return ocupadas;
      }

      public int getPlazasPlazasLibres(){
            return getPlazasTotales() - getPlazasOcupadas();
      }

      @Override
      public String toString(){

            String resultado = nombre + "\n";
            resultado += "---------------\n";

            for (int i = 0 ; i < matriculas.size() ; i++){
                  if(matriculas.get(i) == null){
                        resultado += "Plaza" + i + ": (Vacia)\n";
                  }else{
                        resultado += "Plaza" + i + matriculas.get(i) + "\n";
                  }
            }
            return resultado;
      }
}
