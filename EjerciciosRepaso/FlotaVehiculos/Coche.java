package EjerciciosRepaso.FlotaVehiculos;

public class Coche extends Vehiculo{

      private int velocidad;

      public Coche(int velocidad){
            super(velocidad);
      }

      public int getVelocidadCo() {
            return velocidad;
      }

      public void setVelocidadCo(int velocidad){
            this.velocidad = velocidad;
      }

}
