public class Producto {
    private int idProducto;
    private String nombre;
    private double precioCompra;
    private double precioVenta;
    private int cantidadMax;
    private int cantidadMin;
    private Categoria categoria;

    public Producto(int id, String nombre, double pC, double pV, Categoria cat) {
        this.idProducto = id;
        this.nombre = nombre;
        this.precioCompra = pC;
        this.precioVenta = pV;
        this.categoria = cat;
    }

    public int getIdProducto() { return idProducto; }
    public void setIdProducto(int id) { this.idProducto = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getPrecioCompra() { return precioCompra; }
    public void setPrecioCompra(double precioCompra) { this.precioCompra = precioCompra; }

    public double getPrecioVenta() { return precioVenta; }
    public void setPrecioVenta(double precioVenta) { this.precioVenta = precioVenta; }

    public int getCantidadMax() { return cantidadMax; }
    public void setCantidadMax(int cant) { this.cantidadMax = cant; }

    public int getCantidadMin() { return cantidadMin; }
    public void setCantidadMin(int cant) { this.cantidadMin = cant; }

    public Categoria getCategoria() { return categoria; }
    public void setCategoria(Categoria cat) { this.categoria = cat; }

    @Override
    public String toString() {
        return "Producto{id=" + idProducto + ", nombre='" + nombre +
               "', precioVenta=" + precioVenta + ", categoria=" + categoria + "}";
    }
}
