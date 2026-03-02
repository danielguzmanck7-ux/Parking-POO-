package EjerciciosRepaso.FlotaVehiculos;

public class Vehiculo {

      private int velocidad;

      public Vehiculo(int velocidad){
            this.velocidad = velocidad;
      }

      public void setVelocidad(int velocidad) {
            this.velocidad = velocidad;
      }
      public int getVelocidad(){
            return velocidad;
      }

      public void acelerar(int cantidad) throws VehiculoException{
            int suma = 0;
            suma = this.velocidad+cantidad;
            if(suma > 120) {
                  /*si no creabamos la clase simplemente throw new Illegal Argument Exception */
                  throw new VehiculoException(velocidad, " km/h, mucha velocidad reduce ");
            }else{
                  setVelocidad(suma);
            }
      }




      




}
