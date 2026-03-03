package Supers;

import java.util.ArrayList;
import java.time.LocalDate;

public class Prove {

      public static void main(String[] args) {

            ArrayList<EsAlimento> alimentos = new ArrayList<>();
            
            Cereales c1 = new Cereales(null, 0, null);
            Vino v1 = new Vino(null, null , 0, 0);

            c1.setCaducidad(LocalDate.of(2026,6, 25));
            c1.setMarca("Flakes");
            c1.setPrecio(23);
            c1.setTipo("copos maiz");

            v1.setCaducidad(LocalDate.of(2026,7,11));
            v1.setMarca("Gato Negro");
            v1.setPrecio(25.3);
            v1.setTipo("Espumoso");

            alimentos.add(c1);
            alimentos.add(v1);

            int sumaCalorias = 0;

            for (EsAlimento alimento : alimentos) {
                  sumaCalorias += alimento.getCalorias();
            }

            System.out.println("Las calorias " + sumaCalorias);

      }
      
      

}
