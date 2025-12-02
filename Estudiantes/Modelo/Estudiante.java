package Estudiantes.Modelo;

public class Estudiante {
  private String codigo;
  private String nombre;
  private String carrera;
  private String edad;
  private double promedio;
  private boolean matriculado;

  public Estudiante() {
  }

  public Estudiante(String cod, String nom, String carr, String edad, double promedio, boolean matriculado) {

  }

  public boolean getMatriculado() {
    return this.matriculado;
  }

  public void setMatriculado(boolean matriculado) {
    this.matriculado = matriculado;
  }

  public String getCodigo() {
    return this.codigo;
  }

  public void setCodigo(String cod) {
    this.codigo = cod;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nom) {
    this.nombre = nom;
  }

  public String getCarrera() {
    return this.carrera;
  }

  public void setCarrera(String carr) {
    this.carrera = carr;
  }

  public String getEdad() {
    return this.edad;
  }

  public void setEdad(String edad) {
    this.edad = edad;
  }

  public double getPromedio() {
    return this.promedio;
  }

  public void setPromedio(double promedio) {
    this.promedio = promedio;
  }

  public void matricular() {
    if (this.promedio < 0 || this.promedio > 5) {
      System.out.println("El promedio no puede ser menor a 0 o mayor a 5.");
      this.matriculado = false;
      return;
    }
    if (this.promedio < 3.5) {
      System.out.println("El estudiante no puede ser matriculado.");
      this.matriculado = false;
    } else {
      System.out.println("El estudiante ha sido matriculado.");
      this.matriculado = true;
    }
  }

  public void retirar() {
    if (!this.matriculado) {
      System.out.println("El estudiante no esta matriculado.");
      return;
    } else {
      this.matriculado = false;
      System.out.println("El estudiante ha sido retirado exitosamente.");
    }
  }

  public void actualizarPromedio(double nuevoPromedio) {

    if (nuevoPromedio < 0 || nuevoPromedio> 5) {
      System.out.println("El promedio no es valido.");
      return;
    }
    this.promedio = nuevoPromedio;
    System.out.println("El nuevo promedio es: " + this.promedio);

    if (this.promedio < 3.5 && this.matriculado) {
      this.matriculado = false;
      System.out.println("El estudiante ha sido retirado por bajo rendimiento.");
    } 
    if (this.promedio >= 3.5 && !this.matriculado){
      this.matriculado = true;
      System.out.println("El estudiante ha sido matriculado.");
    }
  }

}
