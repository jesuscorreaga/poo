package Pelota.Modelo;

public class Pelota {
  private String tipo;
  private String color;
  private double diametro;
  private double peso;
  private String eUso;

  public Pelota() {
  }

  public Pelota(String tipo, String col, double diam, double peso, String eUso) {
    this.tipo = tipo;
    this.color = col;
    this.diametro = diam;
    this.peso = peso;
    this.eUso = eUso;
  }

  public String getTipo() {
    return this.tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getColor() {
    return this.color;
  }

  public void setColor(String col) {
    this.color = col;
  }

  public double getDiametro() {
    return this.diametro;
  }

  public void setDiametro(double diam) {
    this.diametro = diam;
  }

  public double getPeso() {
    return this.peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public String getEUso() {
    return this.eUso;
  }

  public void setEUso(String eUso) {
    this.eUso = eUso;
  }

  public void patear() {
    if (this.tipo.equalsIgnoreCase("futbol")) {
      System.out.println("Pateando pelota.");
    } else {
      System.out.println("No se puede patear una pelota que no sea de fútbol.");
    }
  }

  public void botar() {
    if (this.tipo.equalsIgnoreCase("basketball") || this.tipo.equalsIgnoreCase("voleibol")) {
      System.out.println("Botando pelota.");
    } else {
      System.out.println("No se puede botar una pelota que no sea de voleibol o basketball.");
    }
  }

  public void inflar(double val) {
    if (this.peso > 460) {
      System.out.println("La pelota no necesita aire.");
    } else {
      
      this.peso += val;
      if (this.peso > 460) {
        this.peso = 460;
      }
      System.out.println("Inflando pelota. Peso actual: " + this.peso);

    }
  }

  public void desinflar(double val) {
    if (this.peso < 360) {
      System.out.println("No se puede desinflar más .");
    } else {
      this.peso -= val;
      if (this.peso <360) {
        this.peso = 360;
      }
      System.out.println("Desinflando pelota. Peso actual: " + this.peso);
    }
  }
}
