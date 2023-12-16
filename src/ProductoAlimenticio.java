public class ProductoAlimenticio extends Producto {
    private final String fechaCaducidad;

    public ProductoAlimenticio(String nombre, String descripcion, String categoria, String etiquetas, double precio, String urlFoto, String fechaCaducidad) {
        super(nombre, descripcion, categoria, etiquetas, precio, urlFoto);
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public String mostrarDetalles() {
        return "Nombre producto: " + super.getNombre() + "\n" +
                "Descripcion: " + super.getDescripcion() + "\n" +
                "Categoria: " + super.getCategoria() + "\n" +
                "Etiquetas: " + super.getEtiquetas() + "\n" +
                "Precio: " + super.getPrecio() + "\n" +
                "Fecha de Caducidad: " + this.fechaCaducidad + "\n" +
                "URL Foto: " + super.getUrlFoto() + "\n";

    }

}
