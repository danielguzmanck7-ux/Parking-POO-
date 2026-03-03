package ExamenesPasados.Ejercicios.Robots;

public enum TipoEmbalaje {
      Caja("caja"),
      Bolsa("bolsa"),
      Plastico_burbujas("burbujas");


      private String descripcion;

      TipoEmbalaje(String descripcion){
            this.descripcion = descripcion;
      }
      public String getDescripcio(){
            return descripcion;
      }
}
