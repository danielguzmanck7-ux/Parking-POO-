package EjerciciosRepaso.FlotaVehiculos;

public class Pro {

      public static void main(String[] args) {
            
            Vehiculo [] flota = new Vehiculo[2];

            flota[0] = new Coche (55);
            flota[1] = new Camion(56);

            for(Vehiculo v : flota){
                  try{
            v.acelerar(100);
            System.out.print(" Al coche/camion acelerale " + v.getVelocidad());
            }catch (VehiculoException e){
                  System.out.println("Frenaaa" + e.getMensaje());
                  }
             }
      }
}