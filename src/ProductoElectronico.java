public class ProductoElectronico extends Producto{
    private final int garantiaMeses;

    public ProductoElectronico(String nombre, String descripcion, String categoria, String etiquetas, double precio, String urlFoto, int garantiaMeses) {
        super(nombre, descripcion, categoria, etiquetas, precio, urlFoto);
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public String mostrarDetalles() {
        return "Nombre producto: " + super.getNombre() + "\n" +
                "Descripcion: " + super.getDescripcion() + "\n" +
                "Categoria: " + super.getCategoria() + "\n" +
                "Etiquetas: " + super.getEtiquetas() + "\n" +
                "Precio: " + super.getPrecio() + "\n" +
                "Meses de garantia: " + this.garantiaMeses + "\n" +
                "URL Foto: " + super.getUrlFoto() + "\n";
    }
}
