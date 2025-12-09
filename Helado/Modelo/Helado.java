package Helado.Modelo;

public class Helado {
  private String sabor;
  private String tamano;
  private int precio;
  private String estado;

  public Helado(){

  }

  public Helado(String sabor, String tamano, int precio, String estado){
    this.sabor = sabor;
    this.tamano = tamano;
    this.precio = precio;
    this.estado = estado;
   }

   public String getSabor(){
    return this.sabor;
   }

   public void setSabor(String sabor){
    this.sabor = sabor;
   }

   public String getTamano(){
    return this.tamano;
   }

   public void setTamano(String tamano){
    this.tamano = tamano;
   }

   public int getPrecio(){
    return this.precio;
   }

   public void setPrecio(int precio){
    this.precio = precio;
   }

   public String getEstado(){
    return this.estado;
   }

   public void setEstado(String estado){
    this.estado = estado;
   }

   public void derretir(){
    if (this.estado.equalsIgnoreCase("congelado")) {
      this.estado = "derretido";
      System.out.println("El estado se esta derritiendo. ");
    } else if(this.estado.equalsIgnoreCase("derretido")){
      System.out.println("El helado ya esta derretido");
    } else {
      System.out.println("Error.");
    }
   }

   public void servir(){
    if (this.estado.equalsIgnoreCase("congelado")) {
      System.out.println("Sirviendo helado de: " + this.sabor + " de tamaño: " + this.tamano);
      this.estado = "servido";
      System.out.println("El helado fue: " + this.estado);
    } else if(this.estado.equalsIgnoreCase("derretido")){
      System.out.println("No sé puede servir un helado derretido.");
    } else if(this.estado.equalsIgnoreCase("servido")){
      System.out.println("El helado ya fue servido previamente.");
    } else {
      System.out.println("Error.");
    }
   }

   public void cambiarSabor(String nuevoSabor){
    System.out.println("Sabor actual: " + this.sabor);
    this.sabor = nuevoSabor;
    System.out.println("Nuevo sabor asignado: " + this.sabor);
   }
}
