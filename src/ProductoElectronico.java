public class ProductoElectronico extends Producto implements Vendible {
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
                "URL Foto: " + super.getUrlFoto();
    }

    @Override
    public double calcularPrecioVenta(double impuesto, double descuento) {
        double precioVenta;
        if(descuento > 1) {
            precioVenta = this.getPrecio() * (1-descuento/100);
        } else {
            precioVenta = this.getPrecio() * (1-descuento);
        }
        precioVenta = precioVenta * (1 + (impuesto > 1 ? impuesto/100 : impuesto));

        return precioVenta;
    }
}
