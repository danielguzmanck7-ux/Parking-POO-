package EjerciciosRepaso.TiendaOnline;

public class ProductoFisico extends Producto implements Enviable{

      public ProductoFisico(String nombre, double precio){
            super(nombre,precio);
      }
      @Override
      public double calcularGastosEnvio(){
             double cantidad = 5 + getPrecio();
             return cantidad;
      }


}
