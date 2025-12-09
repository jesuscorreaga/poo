package Mascota.Modelo;

public class Mascota {
  private String nombre;
  private String especie;
  private String raza;
  private String edad;
  private boolean vacunas;

  public Mascota() {
  }

  public Mascota(String nombre, String especie, String raza, String edad, boolean vacunas) {
    this.nombre = nombre;
    this.especie = especie;
    this.raza = raza;
    this.edad = edad;
    this.vacunas  = vacunas;

  }

  public String getNombre(){
    return this.nombre;
  }
  public String getEspecie(){
    return this.especie;
  }
  public String getRaza(){
    return this.raza;
  }
  public String getEdad(){
    return this.edad;
  }
  public boolean getVacunas(){
    return this.vacunas;
  }

  public void setNombre(String nombre){
    this.nombre = nombre;
  }
  public void setEspecie(String especie){
    this.especie = especie;
  }
  public void setRaza(String raza){
    this.raza = raza;
  }
  public void setEdad(String edad){
    this.edad = edad;
  }
  public void setVacunas(boolean vacunas){
    this.vacunas = vacunas;
  }

  public void vacunar(){
    if (!this.vacunas) {
      this.vacunas = true;
      System.out.println("Vacunando a " + this.nombre);
    } else{
      System.out.println("Ya tiene las vacunas al día");
    }
  }

  public void alimentar(){
    System.out.println("Alimentando a: " + this.nombre);
  }

  public void jugar(){
    System.out.println("Jugando con: " + this.nombre);
  }

  
}
