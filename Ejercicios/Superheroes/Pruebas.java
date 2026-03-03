package Superheroes;

public class Pruebas {

      public static void main (String [] args){

      SuperHero batman = new SuperHero("Batman");
      batman.setDescripcion("Traje oscuro ");
      batman.setCapa(true);

      SuperHero mike = new SuperHero("Mike");
      mike.setDescripcion("Traje verde ");
      mike.setCapa(false);

      Dimension dim1 = new Dimension (30,10,20);
      Dimension dim2 = new Dimension (24, 32,15);

      Figura fig1 = new Figura("abc3", 35.5, dim1, batman);
      Figura fig2 = new Figura("cba4", 55.56, dim2, mike);

      Coleccion coleccion = new Coleccion("MB");

      coleccion.anadirFigura(fig1);
      coleccion.anadirFigura(fig2);

      coleccion.subirPrecio(20, "abc3");

      System.out.println(coleccion.toString());
      System.out.println("figuras con capa ");
      System.out.println(coleccion.conCapa());
      System.out.println("figura mas valiosa ");
      System.out.println(coleccion.masValioso());
      System.out.println(" valor total: " + coleccion.getValorColeccion());
      System.out.println(" volumen total: " + coleccion.getVolumenColeccion() + " cm ");

      }
}
