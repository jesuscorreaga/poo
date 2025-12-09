package FastFood.Vista;

import FastFood.Modelo.FastFood;

public class Principal {
  public static void main(String[] args) {
    FastFood res = new FastFood();

    res.setNombre("Perros perritos");
    res.setDireccion("Cr 10 # 9 - 8");
    res.setMenuDelDia("Perro mexicano");
    res.setPedidosActivos(10);
    res.setNumeroEmpleados(5);

    System.out.println("El restaurante: " + res.getNombre() + " ubicado en la: " + res.getDireccion()
        + " tiene como menu del día:  " + res.getMenuDelDia() + " con " + res.getPedidosActivos()
        + "  pedidos activos y " + res.getNumeroEmpleados() + " empleados");

        res.cancelarPedido(2);
        res.contratarEmpleado(3);
        res.registrarPedido(9);
        res.cambiarMenu("Perro griego");
  }
}
