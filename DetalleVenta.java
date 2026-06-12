public class DetalleVenta {
    private int idDetalle;
    private int cantidad;
    private double subtotal;
    private Producto producto;

    public DetalleVenta(int ic, int cant, Producto prod) {
        this.idDetalle = ic;
        this.cantidad = cant;
        this.producto = prod;
        calcularSubtotal();
    }

    public int getIdDetalle() { return idDetalle; }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cant) {
        this.cantidad = cant;
        calcularSubtotal();
    }

    public Producto getProducto() { return producto; }
    public void setProducto(Producto prod) {
        this.producto = prod;
        calcularSubtotal();
    }

    public double calcularSubtotal() {
        this.subtotal = cantidad * producto.getPrecioVenta();
        return this.subtotal;
    }

    public double getSubtotal() { return subtotal; }

    @Override
    public String toString() {
        return "DetalleVenta{id=" + idDetalle + ", cantidad=" + cantidad +
               ", subtotal=" + subtotal + ", producto=" + producto.getNombre() + "}";
    }
}
