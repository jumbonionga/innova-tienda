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

    String getNombre() {
        return nombre;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }

    String getDescripcion() {
        return descripcion;
    }

    void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    String getCategoria() {
        return categoria;
    }

    void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    String getEtiquetas() {
        return etiquetas;
    }

    void setEtiquetas(String etiquetas) {
        this.etiquetas = etiquetas;
    }

    String getUrlFoto() {
        return urlFoto;
    }

    void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    double getPrecio() {
        return precio;
    }

    void setPrecio(double precio) {
        this.precio = precio;
    }

    String mostrarDetalles() {
        return "Nombre producto: " + this.nombre + "\n" +
                "Descripcion: " + this.descripcion + "\n" +
                "Categoria: " + this.categoria + "\n" +
                "Etiquetas: " + this.etiquetas + "\n" +
                "Precio: " + this.precio + "\n" +
                "URL Foto: " + this.urlFoto;
    }
}
