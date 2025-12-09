package Curso.Modelo;

public class Curso {
  private String nombre;
  private String codigo;
  private String duracion;
  private String docente;
  private int cuposDisponibles;
  private int cuposTotales;

  public Curso() {

  }

  public Curso(String nombre, String codigo, String duracion, String docente, int cupos) {
    this.nombre = nombre;
    this.codigo = codigo;
    this.duracion = duracion;
    this.docente = docente;
    this.cuposDisponibles = cupos;
    this.cuposTotales = cupos;
  }

  public String getNombre() {
    return this.nombre;
  }

  public String getCodigo() {
    return this.codigo;
  }

  public String getDuracion() {
    return this.duracion;
  }

  public String getDocente() {
    return this.docente;
  }

  public int getCupos() {
    return this.cuposDisponibles;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public void setDuracion(String duracion) {
    this.duracion = duracion;
  }

  public void setDocente(String docente) {
    this.docente = docente;
  }

  public void setCupos(int cupos) {
    this.cuposDisponibles = cupos;
    this.cuposTotales = cupos;
  }

  public void inscribirEstudiante(int estudiante) {

    if (estudiante <= 0) {
      System.out.println("Debe de inscribirse al menos un estudiante.");
      return;
    }
    if (estudiante > this.cuposDisponibles) {
      System.out.println("No se pueden matricular, no hay suficientes cupos.");
      return;
    }

    this.cuposDisponibles -= estudiante;
    System.out.println(estudiante + " Estudiante(s) inscrito quedan disponibles " + this.cuposDisponibles);

  }

  public void cancelarCurso(int estudiante) {
    if (estudiante <= 0) {
      System.out.println("Debe cancelar al menos un estudiante.");
      return;
    }
    if (this.cuposDisponibles + estudiante > this.cuposTotales) {
      System.out.println("No se pueden cancelar más de los cupos totales: " + this.cuposTotales);
      return;
    }

    this.cuposDisponibles += estudiante;
    System.out.println("Se canceló la inscripción de " + estudiante +
        " estudiante(s). Cupos disponibles: " + this.cuposDisponibles);
  }

  public void actualizarDocente(String nuevoDocente) {
    this.docente = nuevoDocente;
    System.out.println("El nuevo docente es: " + this.docente);
  }

}
