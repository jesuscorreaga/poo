package Lampara.Modelo;

public class Lampara {
  private String tipo;
  private String color;
  private String potencia;
  private Boolean encendida;


  public Lampara(){

  }

  public Lampara(String tipo, String color, String potencia, Boolean encendida){
    this.tipo = tipo;
    this.color = color;
    this.potencia = potencia;
    this.encendida = encendida;
  }

  public String getTipo(){
    return this.tipo;
  }

  public void setTipo(String tipo){
    this.tipo = tipo;
  }

  public String getColor(){
    return this.color;
  }

  public void setColor(String color){
    this.color = color;
  }

  public String getPotencia(){
    return this.potencia;
  }

  public void setPotencia(String potencia){
    this.potencia = potencia;
  }
  public Boolean getEncendida(){
    return this.encendida;
  }

  public void setEncendida(Boolean encendida){
    this.encendida = encendida;
  }

  public void encender(){
    if (!this.encendida) {
      this.encendida = true;
      System.out.println("Lampara encendida");
    } else{
      System.out.println("Ya esta encendida");
    }
  }

  public void apagar(){
    if (this.encendida) {
      this.encendida = false;
      System.out.println("Apagando lampara.");
    } else{
      System.out.println("La lampara ya estaba apagada.");
    }
  }

  public void cambiarBombillo(){
    if (this.encendida) {
      System.out.println("Apague la lampara para cambiar el bombillo.");
    } else {
      System.out.println("Cambiando bombillo.");
    }
  }


}
