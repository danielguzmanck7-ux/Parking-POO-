import java.util.*;

public class Principal {
    
public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      Parking parking = new Parking("Parking Centro", 10);

      int opcion = 0;

      do{
            System.out.println("\n--- Menu ---");
            System.out.println("1. Entrar ");
            System.out.println("2. Salida Coche ");
            System.out.println("3. Mostrar");
            System.out.println("4. Salir ");
            System.out.print("Seleccione una opcion: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch(opcion){
                  case 1:
                        try{
                              System.out.println("Introduce la matricula");
                              String matricula = sc.nextLine();
                              System.out.println("Introduce la plaza");
                              int plaza = Integer.parseInt(sc.nextLine());

                              parking.entrada(matricula, plaza);

                              System.out.print(" -exito- " );

                              System.out.println("plazas Totales " + parking.getPlazasTotales());
                              System.out.println("plazas Libres " + parking.getPlazasLibres());
                              System.out.println("plazas Ocupadas " + parking.getPlazasOcupadas());

                        }catch(ParkingException e){
                              System.out.println("Error" + e.getMensaje());
                              System.out.println("Matricula " + e.getMatricula());
                        }
                        break;

                  case 2:
                        try{

                              System.out.println("Introduce la matricula");
                              String matricula = sc.nextLine();

                              int plaza = parking.salida(matricula);

                              System.out.println("plazas Totales " + parking.getPlazasTotales());
                              System.out.println("plazas Libres " + parking.getPlazasLibres());
                              System.out.println("plazas Ocupadas " + parking.getPlazasOcupadas());

                              System.out.println(" -exito- , plaza " + plaza + " liberada");

                        }catch (ParkingException e){
                              System.out.println("Error" + e.getMensaje());
                              System.out.println("Matricula " + e.getMatricula());
                        }
                        break;
                  case 3:
                              System.out.print(parking.toString());                    
                        break;
                  case 4:
                              System.out.print("saliendo pa");                   
                        break;

                  default:
                        System.out.println("opcion incorrecta pa");
        }

      }while (opcion != 4);
      
      sc.close();
  }
}
