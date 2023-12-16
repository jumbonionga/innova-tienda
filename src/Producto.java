public abstract class Producto {
    private String nombre, descripcion, categoria, etiquetas, urlFoto;
    private double precio;

    public Producto(String nombre, String descripcion, String categoria, String etiquetas, double precio, String urlFoto) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.etiquetas = etiquetas;
        this.urlFoto = urlFoto;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(String etiquetas) {
        this.etiquetas = etiquetas;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String mostrarDetalles() {
        return "Nombre producto: " + this.nombre + "\n" +
                "Descripcion: " + this.descripcion + "\n" +
                "Categoria: " + this.categoria + "\n" +
                "Etiquetas: " + this.etiquetas + "\n" +
                "Precio: " + this.precio + "\n" +
                "URL Foto: " + this.urlFoto;
    }
}
