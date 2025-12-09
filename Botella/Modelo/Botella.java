package Botella.Modelo;

public class Botella {
  private String contenido;
  private int capacidadTotal;
  private int nivelActual;
  private Boolean abierta;

  public Botella() {
  }

  public Botella(String cont, int cap, int nivel, Boolean abierta) {
    this.contenido = cont;
    this.capacidadTotal = cap;
    this.nivelActual = nivel;
    this.abierta = abierta;
  }

  public String getContenido() {
    return this.contenido;
  }

  public void setContenido(String cont) {
    this.contenido = cont;
  }

  public int getCapacidad() {
    return this.capacidadTotal;
  }

  public void setCapacidad(int cap) {
    this.capacidadTotal = cap;
  }

  public int getNivel() {
    return this.nivelActual;
  }

  public void setNivel(int nivel) {
    this.nivelActual = nivel;
  }

  public Boolean getAbierta() {
    return this.abierta;
  }

  public void setAbierta(Boolean abierta) {
    this.abierta = abierta;
  }

  public void abrir() {
    if (!this.abierta) {
      this.abierta = true;
      System.out.println("La botella se abrio.");
    } else {
      System.out.println("La botella ya estaba abierta.");
    }
  }

  public void cerrar() {
    if (this.abierta) {
      this.abierta = false;
      System.out.println("La botella ha sido cerrada.");
    } else {
      System.out.println("La botella ya estaba cerrada.");
    }
  }

  public void servir() {
    if (!this.abierta) {
      System.out.println("No se puede servir. La botella esta cerrada");
      return;
    }

    if (this.nivelActual <= 0) {
      System.out.println("No se puede servir la botella esta vacia.");
      return;
    }

    int cantidadAServir = 200;

    if (this.nivelActual >= cantidadAServir) {
      this.nivelActual -= cantidadAServir;
      System.out.println("Se sirvieron: " + cantidadAServir + " ml. Nivel actual: " + this.nivelActual + " ml.");

    } else {
      System.out.println("Solo queda: " + this.nivelActual + " ml. Se sirvio todo.");
      this.nivelActual = 0;
    }
  }

  public void llenar(int cantidad) {
    if (cantidad <= 0) {
      System.out.println("La cantidad debe ser mayor a 0.");
      return;
    }

    if (this.nivelActual == this.capacidadTotal) {
      System.out.println("La botella ya está llena.");
      return;
    }

    if (this.nivelActual + cantidad <= this.capacidadTotal) {
      this.nivelActual += cantidad;
      System.out.println("Se agregaron " + cantidad + " ml. Nivel actual: " + this.nivelActual + " ml.");
    } else {
      int sobrante = (this.nivelActual + cantidad) - this.capacidadTotal;
      this.nivelActual = this.capacidadTotal;
      System.out.println("Se llenó la botella pero sobraron " + sobrante + " ml.");
    }
  }
}
