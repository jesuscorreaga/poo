package Tienda.Modelo;

public class Tienda {
  private String nombre;
  private String direccion;
  private String categorias;
  private int productosDisponibles;
  private boolean abierta;

  public Tienda() {
  }

  public Tienda(String nombre, String direccion, String categorias, int productosDisponibles, boolean abierta) {
    this.nombre = nombre;
    this.direccion = direccion;
    this.categorias = categorias;
    this.productosDisponibles = productosDisponibles;
    this.abierta = abierta;
  }

  public String getNombre() {
    return this.nombre;
  }

  public String getDireccion() {
    return this.direccion;
  }

  public String getCategorias() {
    return this.categorias;
  }

  public int getProductosDisponibles() {
    return this.productosDisponibles;
  }

  public boolean getAbierta() {
    return this.abierta;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public void setCategorias(String categorias) {
    this.categorias = categorias;
  }

  public void setProductosDisponibles(int productosDisponibles) {
    this.productosDisponibles = productosDisponibles;
  }

  public void setAbierta(boolean abierta) {
    this.abierta = abierta;
  }

  public void apertura() {
    if (!this.abierta) {
      this.abierta = true;
      System.out.println("La tienda ha sido abierta.");
    } else {
      System.out.println("La tienda ya estaba abierta.");
    }
  }

  public void cierre() {
    if (this.abierta) {
      this.abierta = false;
      System.out.println("La tienda ha sido cerrada.");
    } else {
      System.out.println("La tienda ya estaba cerrada.");
    }
  }

  public void agregarProducto(int cantidad) {
    if (cantidad > 0) {
      this.productosDisponibles += cantidad;
      System.out.println("Se agregaron " + cantidad + " productos. Total: " + this.productosDisponibles);
    } else {
      System.out.println("Cantidad inválida. Debe ser mayor a 0.");
    }
  }

  public void venderProducto(int cantidad) {
    if (!this.abierta) {
      System.out.println("No se puede vender, la tienda está cerrada.");
      return;
    }

    if (cantidad <= 0) {
      System.out.println("Cantidad inválida.");
      return;
    }

    if (cantidad > this.productosDisponibles) {
      System.out.println("No hay suficientes productos. Solo quedan " + this.productosDisponibles);
      return;
    }

    this.productosDisponibles -= cantidad;
    System.out.println("Se vendieron " + cantidad + " productos. Restan: " + this.productosDisponibles);
  }
}
