package Portatil.Modelo;

public class Portatil {
  private String marca;
  private String memeoriaRam;
  private String almacenamiento;
  private int bateria;
  private boolean encendido;


  public Portatil(){}

  public Portatil(String marca, String memoria, String almacenamiento, int bateria, boolean encendido){


    this.marca = marca;
    this.memeoriaRam = memoria;
    this.almacenamiento = almacenamiento;
    this.bateria = bateria;
    this.encendido = encendido;


  }

  public String getMarca(){
    return this.marca;
  }
  
  public String getMemoria(){
    return this.memeoriaRam;
  }
  public String getAlmacenamiento(){
    return this.almacenamiento;
  }
  public int getBateria(){
    return this.bateria;
  }
  public boolean getEncendido(){
    return this.encendido;
  }

  public void setMarca(String marca){
    this.marca = marca;
  }

  public void setMemoria(String memoria){
    this.memeoriaRam = memoria;
  }

  public void setAlmacenamiento(String almacenamiento){
    this.almacenamiento = almacenamiento;
  }

  public void setBateria(int bateria){
    if(bateria < 0){
      this.bateria = 0;
    } else if(bateria > 100){
      this.bateria = 100;
    } else{
      this.bateria = bateria;
    }
  }

  public void setEncendido(boolean encendido){
    this.encendido = encendido;
  }

  public void encender(){
    if (!this.encendido && this.bateria > 0) {
      this.encendido = true;
      System.out.println("El portatil ha encendido y tiene una carga de: " + this.bateria);
    } else{
      System.out.println("El portatil ya esta encendido y tiene una carga de: " + this.bateria);
    }
  }

  public void apagar(){
    if (this.encendido) {
      this.encendido = false;
      System.out.println("Apagando el portatil. ");
    } else{
      System.out.println("El portatil ya se encuentra apagado");
    }
  }

  public void cargarBateria(int carga){
    if (carga <= 0) {
      System.out.println("La carga no puede ser menor a 0.");
      return;
    } 
    setBateria(this.bateria + carga);

    System.out.println("La nueva carga de la bateria es: " + this.bateria + " %");
    
  }

}
