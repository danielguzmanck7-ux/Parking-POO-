package EjerciciosRepaso.TiendaOnline;

import java.util.ArrayList;

public class Proba {

      public static void main(String [] args){

            ArrayList<Producto> conjunto = new ArrayList<>(2);

            conjunto.add(new ProductoFisico("cuaderno", 25));
            conjunto.add(new ProductoDigital("libro", 35));

            double total = 0;

            for(Producto p : conjunto){
                  double precioFinal = p.getPrecio();

                  if (p instanceof Enviable){
                        Enviable e = (Enviable)p;
                        precioFinal += e.calcularGastosEnvio(); 
                  }
                  total += precioFinal;

                  System.out.println("Producto " + p.getNombre() + " precio " + precioFinal);
            }
            System.out.println("Total compra " + total);
      }

}
