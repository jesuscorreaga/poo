package Estudiantes.Vista;

import Estudiantes.Modelo.Estudiante;

public class Principal {
  public static void main(String[] args) {
    Estudiante est = new Estudiante();
    est.setNombre("Jesús");
    est.setCodigo("1");
    est.setCarrera("ADSO");
    est.setEdad("30");
    est.setPromedio(5);
    est.setMatriculado(true);
    System.out.println("Nombre estudiante: " + est.getNombre());
    System.out.println("Codigo estudiante: " + est.getCodigo());
    System.out.println("Carrera del estudiante: " + est.getCarrera());
    System.out.println("Edad estudiante: " + est.getEdad());
    System.out.println("Promedio estudiante: " + est.getPromedio());
    est.actualizarPromedio(1);
    System.out.println(est.getMatriculado());


  }
}
