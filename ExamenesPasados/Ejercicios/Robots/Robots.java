package ExamenesPasados.Ejercicios.Robots;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Robots {

      private static int contador = 0;

      protected int id;
      protected String nombre;
      protected LocalDate fechaCreacion;
      protected int trabajosRealizados;

      public Robots(String nombre){
            this.id = contador++;
            this.nombre = nombre;
            this.trabajosRealizados = 0;
      }

      public Robots(){
          this.id = contador++;
          this.trabajosRealizados = 0;
      }
      
      public abstract void trabajar() throws MantenimientoException;

      protected abstract int getLimiteTrabajos();

      public boolean necesitaMantenimiento(){
            return trabajosRealizados >= getLimiteTrabajos();
      }

      protected long getAntiguedad(){
            if(fechaCreacion == null){
                  return 0;
            }
           return ChronoUnit.DAYS.between(fechaCreacion, LocalDate.now());
      }

      public static int getContador() {
            return contador;
      }
      public LocalDate getFechaCreacion() {
            return fechaCreacion;
      }
      public int getId() {
            return id;
      }
      public String getNombre() {
            return nombre;
      }
      public int getTrabajosRealizados() {
            return trabajosRealizados;
      }
      public static void setContador(int contador) {
            Robots.contador = contador;
      }
      public void setFechaCreacion(LocalDate fechaCreacion) {
            this.fechaCreacion = fechaCreacion;
      }
      public void setNombre(String nombre) {
            this.nombre = nombre;
      }
      public void setTrabajosRealizados(int trabajosRealizados) {
            this.trabajosRealizados = trabajosRealizados;
      }

}
