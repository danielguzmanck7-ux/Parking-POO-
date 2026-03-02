package EjerciciosRepaso.FlotaVehiculos;

public class Camion extends Vehiculo{

      private int velocidad;

      public Camion(int velocidad){
            super(velocidad);
      }

      @Override
      public void acelerar(int cantidad)throws VehiculoException{
            super.acelerar(cantidad);
            System.out.println(" El camion acelera lento ");
      }

      public int getVelocidadCa() {
            return velocidad;
      }
      public void setVelocidadCa(int velocidad){
            this.velocidad = velocidad;
      }

}
