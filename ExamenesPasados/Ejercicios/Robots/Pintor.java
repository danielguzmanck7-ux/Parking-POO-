package ExamenesPasados.Ejercicios.Robots;

public class Pintor extends Robots{

      private byte  r,v,a;
      private String tipo;

      public Pintor(byte r, byte a, byte v){
            super();
            this.tipo = "pintor" + id;
            this.v = v;
            this.r = r;
            this.a = a;
      }
      public byte getA() {
            return a;
      }public byte getR() {
            return r;
      }public byte getV() {
            return v;
      }

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
      }

     

      

}
