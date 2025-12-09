package Restaurante.Modelo;

public class Restaurante {
  private String nombre;
  private String especialidad;
  private String ubicacion;
  private int numeroDeClientesAtendidos;
  private double calificacion;
  private String menu;

  public Restaurante() {

  }

  public Restaurante(String nombre, String esp, String ubi, int nClientes, double calificacion , String menu) {
    this.nombre = nombre;
    this.especialidad = esp;
    this.ubicacion = ubi;
    this.numeroDeClientesAtendidos = nClientes;
    this.calificacion = calificacion;
    this.menu = menu;
  }

  public String getNombre(){
    return this.nombre;
  }
  public void setNombre(String nombre){
    this.nombre = nombre;
  }
  public String getEspecialidad(){
    return this.especialidad;
  }
  public void setEspecialidad(String esp){
    this.especialidad = esp;
  }
  public String getUbicacion(){
    return this.ubicacion;
  }
  public void setUbicacion(String ubi){
    this.ubicacion = ubi;
  }
  public int getNClientes(){
    return this.numeroDeClientesAtendidos;
  }
  public void setNClientes(int nClientes){
    this.numeroDeClientesAtendidos = nClientes;
  }
  public double getCalificacion(){
    return this.calificacion;
  }
  public void setCalificacion(double calificacion){
    this.calificacion = calificacion;
  }

  public void atenderCliente(){
    this.numeroDeClientesAtendidos++;
    System.out.println("Cliente atendido con éxito. Total clientes atendidos: " + this.numeroDeClientesAtendidos);
  }

  public void actualizarCalificacion(double nuevaCalificacion){
    this.calificacion = nuevaCalificacion;
    System.out.println("La nueva calificación es de: " + calificacion);
  }

  public void cambiarMenu(String nuevoMenu){
    this.menu = nuevoMenu;
    System.out.println("El nuevo menú es: " + this.menu);
  }
}
