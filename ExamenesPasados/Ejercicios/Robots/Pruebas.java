package ExamenesPasados.Ejercicios.Robots;

import java.util.ArrayList;

public class Pruebas {
      
      public static void main(String[] args) {

            // Parte 4: probar mantenimiento
            Ensamblador e = new Ensamblador();

            try {
                  while (true) {
                        e.trabajar();
                  }
            } catch (Exception ex) {
                  System.out.println(ex.getMessage());
            }

            // Parte 6: colección recargable
            ArrayList<Recargable> recargables = new ArrayList<>();

            Ensamblador e1 = new Ensamblador();
            Pintor p1 = new Pintor((byte) 100, (byte) 50, (byte) 120);

            recargables.add(e1);
            recargables.add(p1);

            for (Recargable r : recargables) {
                  r.recargar();
            }

            // Parte 7 y 8

            LineasProducion linea = new LineasProducion();

            linea.anadirRobot(new Pintor(8, 7, 8));
            linea.anadirRobot(new Empaquetador());
            linea.anadirRobot(new Ensamblador(TipoEmbalaje.Bolsa), 4);

            try {
                  linea.start();
            } catch (Exception ex) {
                  System.out.println(ex.getMessage());
            }
            
      }

}
