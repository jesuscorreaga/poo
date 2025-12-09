package Impresora.Modelo;

public class Impresora {
  private String marca;
  private String modelo;
  private Boolean tintaDisponible;
  private Boolean papelDisponible;
  private Boolean enUso;

  public Impresora() {

  }

  public Impresora(String marca, String modelo, Boolean tinta, Boolean papel, Boolean enUso) {
    this.marca = marca;
    this.modelo = modelo;
    this.tintaDisponible = tinta;
    this.papelDisponible = papel;
    this.enUso = enUso;
  }

  public String getMarca() {
    return this.marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return this.modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public Boolean getTinta() {
    return this.tintaDisponible;
  }

  public void setTinta(Boolean tinta) {
    this.tintaDisponible = tinta;
  }

  public Boolean getPapel() {
    return this.papelDisponible;
  }

  public void setPapel(Boolean papel) {
    this.papelDisponible = papel;
  }

  public Boolean getUso() {
    return this.enUso;
  }

  public void setUso(Boolean enUso) {
    this.enUso = enUso;
  }

  public void imprimir() {
    if (this.papelDisponible == true && this.tintaDisponible == false) {
      System.out.println("Falta tinta.");

    } else if (this.papelDisponible == false && this.tintaDisponible == true) {
      System.out.println("Falta papel.");
    } else if (this.papelDisponible == false && this.tintaDisponible == false) {
      System.out.println("No hay papel, ni tinta");
    } else {
      System.out.println("Imprimiendo archivos...");
    }
  }

  public void cargarPapel() {
    if (this.enUso == true) {
      System.out.println("Esta en uso no se puede cargar");
    } else {
      if (this.papelDisponible == false) {
        System.out.println("Cargando papel");
        this.papelDisponible = true;
      } else {
        System.out.println("Ya la impresora esta cargada de papel.");
      }
    }

  }

  public void recargarTinta() {

    if (this.enUso == true) {
      System.out.println("No se puede recargar estando en uso.");
    } else {
      if (this.tintaDisponible == false) {
        System.out.println("Recargando tinta");
        this.tintaDisponible = true;
      } else {
        System.out.println("No se puede agregar más tinta.");
      }
    }

  }

}
