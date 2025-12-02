package Libro.Modelo;

public class Libro {
  private String titulo;
  private String autor;
  private String editorial;
  private String iSBN;
  private int nPag;
  private boolean leido;
  private int pagXLeer;
  private int pagMarcada;
  private boolean prestado;
  private boolean enPosesion;

  public Libro() {

  }

  public Libro(String tit, String aut, String edit, String iSBN, int nPag, boolean leido, int pXLeer, int pMarcada,
      boolean pres, boolean enP) {
    this.titulo = tit;
    this.autor = aut;
    this.editorial = edit;
    this.iSBN = iSBN;
    this.nPag = nPag;
    this.leido = leido;
    this.pagXLeer = pXLeer;
    this.pagMarcada = pMarcada;
    this.prestado = pres;
    this.enPosesion = enP;
  }

  public boolean getPrestado() {
    return this.prestado;
  }

  public void setPrestado(boolean pres) {
    this.prestado = pres;
  }

  public boolean getEnPosesion() {
    return this.enPosesion;
  }

  public void setEnPosesion(boolean enP) {
    this.enPosesion = enP;
  }

  public int getPagMarcada() {
    return this.pagMarcada;
  }

  public void setPagMarcada(int pMarcada) {
    this.pagMarcada = pMarcada;
  }

  public int getPagXLeer() {
    return this.pagXLeer;
  }

  public void setNPagXleer(int pXLeer) {
    this.pagXLeer = pXLeer;
  }

  public String getTitulo() {
    return this.titulo;
  }

  public void setTitulo(String tit) {
    this.titulo = tit;
  }

  public String getAutor() {
    return this.autor;
  }

  public void setAutor(String aut) {
    this.autor = aut;
  }

  public String getEditorial() {
    return this.editorial;
  }

  public void setEditorial(String edit) {
    this.editorial = edit;
  }

  public String getISBN() {
    return this.iSBN;
  }

  public void setISBN(String iSBN) {
    this.iSBN = iSBN;
  }

  public int getNPag() {
    return this.nPag;
  }

  public void setNPag(int nPag) {
    this.nPag = nPag;
  }

  public boolean setLeido() {
    return this.leido;
  }

  public void setLeido(boolean leido) {
    this.leido = leido;
  }

  public void leer(int val) {

    if (pagXLeer + val <= this.nPag) {

      this.pagXLeer += val;

      System.out.println("Has leído " + val + " páginas. Total leído: " + pagXLeer);

      if (this.pagXLeer == this.nPag) {
        this.leido = true;
        System.out.println("¡Has terminado el libro!");
      }

    } else {
      System.out.println("No se pueden leer más páginas de las totales del libro.");
    }
  }

  public void marcarPagina(int val) {
    if (val < this.nPag) {
      this.pagMarcada = val;

    }

  }

  public boolean prestar() {
    if (!prestado) {
      prestado = true;
      System.out.println("El libro fue prestado con éxito.");
    } else {
      System.out.println("El libro ya está prestado.");
    }

    return prestado;
  }

  public boolean devolver() {
    if (prestado && !enPosesion) {
      prestado = false;
      enPosesion = true;
      System.out.println("El libro fue regresado con exito.");

    } else {
      System.out.println("El libro no esta prestado.");
    }
    return !prestado; // Ya no lo tienen prestado
  }
}