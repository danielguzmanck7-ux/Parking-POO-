package Servicios;

import java.time.LocalDate;
import java.util.ArrayList;

public class Prob {

      public static void main(String[] args) {

            ArrayList<Servicios> lista = new ArrayList<>();

            lista.add(new TrabajoPintura("Juan Pérez", "Carlos López", LocalDate.of(2026, 3, 1), 60, 12));

            lista.add(new TrabajoPintura("Ana Martín","Empresa XYZ",
            LocalDate.of(2026, 3, 5),40, 15));

            lista.add(new RevisionAlarma("Hospital Central",LocalDate.of(2026, 3, 10), 9));

            lista.add(new RevisionAlarma("Colegio San José",LocalDate.of(2026, 3,6),7));

            double sumaTotal = 0;
            double sumaSueldos = 0;

            for (Servicios s : lista) {

                  sumaTotal = sumaTotal + s.costeTotal();
                  sumaSueldos = sumaSueldos + s.costeManoObra();

                  System.out.println(s.detalleServicio());
                  System.out.println();
            }

            System.out.println("TOTAL FACTURADO: " + sumaTotal);
            System.out.println("TOTAL SUELDOS: " + sumaSueldos);
      }
}
