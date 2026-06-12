public class Categoria {
    private int idCategoria;
    private String nombre;

    public Categoria(int id, String nombre) {
        this.idCategoria = id;
        this.nombre = nombre;
    }

    public int getIdCategoria() { return idCategoria; }
    public void setIdCategoria(int id) { this.idCategoria = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    @Override
    public String toString() {
        return "Categoria{id=" + idCategoria + ", nombre='" + nombre + "'}";
    }
}
