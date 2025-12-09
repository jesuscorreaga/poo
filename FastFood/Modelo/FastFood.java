package FastFood.Modelo;

public class FastFood {
    private String nombre;
    private String direccion;
    private String menuDelDia;
    private int pedidosActivos;
    private int numeroEmpleados;

    public FastFood() {

    }

    public FastFood(String nombre, String direccion, String menu, int pedidos, int empleados) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.menuDelDia = menu;
        this.pedidosActivos = pedidos;
        this.numeroEmpleados = empleados;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public String getMenuDelDia() {
        return this.menuDelDia;
    }

    public int getPedidosActivos() {
        return this.pedidosActivos;
    }

    public int getNumeroEmpleados() {
        return this.numeroEmpleados;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setMenuDelDia(String menuDelDia) {
        this.menuDelDia = menuDelDia;
    }

    public void setPedidosActivos(int pedidosActivos) {
        this.pedidosActivos = pedidosActivos;
    }

    public void setNumeroEmpleados(int numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }

    public void registrarPedido(int cantidad) {
        this.pedidosActivos += cantidad;
        System.out.println(
                "Se registraron " + cantidad + " nuevos pedidos. Total pedidos activos: " + this.pedidosActivos);
    }

    public void cancelarPedido(int cantidad) {
        if (cantidad <= this.pedidosActivos) {
            this.pedidosActivos -= cantidad;
            System.out.println("Se cancelaron " + cantidad + " pedidos. Pedidos restantes: " + this.pedidosActivos);
        } else {
            System.out.println("Error: No se pueden cancelar más pedidos de los existentes.");
        }
    }

    public void cambiarMenu(String nuevoMenu) {
        this.menuDelDia = nuevoMenu;
        System.out.println("El menú del día ahora es: " + this.menuDelDia);
    }

    public void contratarEmpleado(int cantidad) {
        this.numeroEmpleados += cantidad;
        System.out.println("Se contrataron " + cantidad + " empleados. Total empleados ahora: " + this.numeroEmpleados);
    }
}
