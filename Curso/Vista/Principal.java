package Curso.Vista;

import Curso.Modelo.Curso;

public class Principal {
  public static void main(String[] args) {
    Curso nCurso = new Curso();

    nCurso.setNombre("ADSO");
    nCurso.setCodigo("118832");
    nCurso.setDocente("Pedro Perez");
    nCurso.setDuracion("1 año");
    nCurso.setCupos(20);
    System.out.println("El curso: " + nCurso.getNombre() + " con el codigo " + nCurso.getCodigo()
        + " impartido por el docente: " + nCurso.getDocente() + " tiene una duración de " + nCurso.getDuracion()
        + " y un total de: " + nCurso.getCupos() + " cupos");

        nCurso.actualizarDocente("Juan Men");
        nCurso.cancelarCurso(30);
        nCurso.inscribirEstudiante(10);
  }
}
