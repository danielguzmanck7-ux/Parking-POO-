package ExamenesPasados.Ejercicios.Robots;

public class Pintor extends Robots implements Recargable{

      private static int unidades = 0;

      private int  r,v,a; 
      private int bateria = 100;

      public Pintor(int r, int a, int v){
            super();
            this.nombre = "pintor" + id;
            this.v = v;
            this.r = r;
            this.a = a;
            unidades++;
      }
      public int getA() {
            return a;
      }public int getR() {
            return r;
      }public int getV() {
            return v;
      }

      @Override
      public void trabajar() throws MantenimientoException{

            System.out.println(
                        """
                  ---------------
      2. Pintor """ +getId()+
                  
      """ 
      Pintando con color rojo """ +getR()+
                              
      """ 
      + verde """ +getV()+
                                          
      """ 
      + azul """ +getA()+
                                                      
                    """
                  ---------------      
                        """);
                        trabajosRealizados++;
            
            if(necesitaMantenimiento()){
                  throw new MantenimientoException(getId() + " ta cansado el robot rey");
            }
            bateria -= 10;
      }
      @Override
      public int getLimiteTrabajos(){
            return 3;
      }
      public int getUnidadesP(){
            return unidades;
      }
      @Override
      public void recargar(){
            bateria = 100;
      }
      public int getBateria(){
            return bateria;
      }



     

      

}
