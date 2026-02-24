import java.util.*;

public class MainConMetodos {

public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      Parking parking = new Parking("Parking Centro", 10);
      int op;

      do{
            op = menu();
            accion(op,parking);

      }while(op != 4);

}
      public static int  menu(){
            Scanner sc = new Scanner(System.in);
            int opcion;

            System.out.println("""
             ------------------
                  1. entrar
                  2. salir
                  3. mostrar
                  4. salir
             -----------------
                               """);
            try {
                   System.out.print(" Escoge la opcion cari ");
                   opcion = sc.nextInt();

            }catch(Exception e){
                  opcion = 0;
            }
            return opcion;
      } 


      public static void accion(int opcion, Parking parking){
            switch(opcion){
                  case 1 -> entradaCoche(parking);
                  case 2 -> salidaCoche(parking);
                  case 3 -> System.out.print(parking.toString());
                  case 4 -> System.out.print(parking.toString() + "\n\n");
                  default -> System.out.println("te equivocaste");
            }
      }

      public static void entradaCoche(Parking parking){

      boolean correcto = false;
      Scanner sc = new Scanner (System.in);
            
      try{
                  System.out.print(parking.toString());
                  String m = sc.nextLine();
                  System.out.print(parking.toString());
                  int p = Integer.parseInt(sc.nextLine());

                  parking.entrada(m,p);
                  correcto = true;

      }catch (ParkingException e){
                  System.out.println("Error" + e.getMensaje());
                  System.out.println("Matricula " + e.getMatricula());
      }catch(NumberFormatException e){
                  System.out.println(" Formato numero incorrecto  " );
      }catch(Exception e){
                  System.out.println(" Error Desconocido  " );
            }
      }

      public static void salidaCoche(Parking parking){
            
            Scanner sc = new Scanner (System.in);
            boolean correcto = false;

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
            }catch(Exception e){
                  System.out.println(" Error desconocido " );

            }

      }
}
