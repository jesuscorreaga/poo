package Factura.Modelo;

public class Factura {
  private String numero;
  private String cliente;
  private String fecha;
  private int total;
  private String estadoDePago;

  public Factura() {

  }

  public Factura(String num, String cli, String fecha, int tot, String estado) {
    this.numero = num;
    this.cliente = cli;
    this.fecha = fecha;
    this.total = tot;
    this.estadoDePago = estado;
  }

  public String getNumero() {
    return this.numero;
  }

  public void setNumero(String num) {
    this.numero = num;
  }

  public String getCliente() {
    return this.cliente;
  }

  public void setCliente(String cli) {
    this.cliente = cli;
  }

  public String getFecha() {
    return this.fecha;
  }

  public void setFecha(String fecha) {
    this.fecha = fecha;
  }

  public int getTotal() {
    return this.total;
  }

  public void setTotal(int tot) {
    this.total = tot;
  }
  public String getEstado(){
    return this.estadoDePago;
  }

  public void setEstado(String estado){
    this.estadoDePago = estado;
  }

  public double calcularIva() {
    double iva = this.total * 0.19;
    double totalConIva = this.total + iva;
    System.out.println("Este es el valor de la factura con iva: $" + totalConIva);
    return totalConIva;
  }

  public void pagar(double valorPagado) {
    double totalAPagar = calcularIva();
    if(valorPagado == totalAPagar){
      this.estadoDePago = "Pagado";
      System.out.println("Pago total exitoso. Estado: " + this.estadoDePago);
    } else{
      this.estadoDePago = "No pago completo";
      System.out.println(this.estadoDePago);
    }
    
  }

  public void anular(){
    this.estadoDePago = " anulada";
    System.out.println("La factura: " + this.numero + "ha sido " +this.estadoDePago );
  }
}
