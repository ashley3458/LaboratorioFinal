import java.util.ArrayList;

public class Venta {
    private int idVenta;
    private String fecha;
    private double total;
    private Cliente cliente;
    private Empleado empleado;
    private ArrayList<DetalleVenta> detalles;

    public Venta(int id, String fecha, Cliente cliente, Empleado emp) {
        this.idVenta = id;
        this.fecha = fecha;
        this.cliente = cliente;
        this.empleado = emp;
        this.detalles = new ArrayList<>();
        this.total = 0;
    }

    public int getIdVenta() { return idVenta; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cli) { this.cliente = cli; }

    public Empleado getEmpleado() { return empleado; }
    public void setEmpleado(Empleado emp) { this.empleado = emp; }

    public void agregarProducto(DetalleVenta det) {
        detalles.add(det);
    }

    public double calcularTotal() {
        total = 0;
        for (DetalleVenta d : detalles) {
            total += d.calcularSubtotal();
        }
        return total;
    }

    public double getTotal() { return total; }

    public ArrayList<DetalleVenta> getDetalles() { return detalles; }

    @Override
    public String toString() {
        return "Venta{id=" + idVenta + ", fecha='" + fecha +
               "', cliente=" + cliente.getNombre() +
               ", empleado=" + empleado.getNombre() +
               ", total=" + calcularTotal() + "}";
    }
}
