public class Main {
    public static void main(String[] args) {
        ProductoAlimenticio alimenticio1 = new ProductoAlimenticio(
                "Leche Entera Alpina",
                "Bolsa 1x1.100 ml",
                "Lacteo/Huevos y refrigerados",
                "Leches",
                3100,
                "URL Foto 1",
                "2024-12-22"
        );
        ProductoElectronico electronico1 = new ProductoElectronico(
                "Radio Panasonic",
                "Radio AM/FM",
                "Articulo de Audio/Video",
                "Radios",
                150000,
                "URL Foto 2",
                12
        );

        System.out.println(alimenticio1.mostrarDetalles());
        System.out.println("Precio venta: " + alimenticio1.calcularPrecioVenta(0.12, 0.05));
        System.out.println(" ");
        System.out.println(electronico1.mostrarDetalles());
        System.out.println("Precio venta: " + electronico1.calcularPrecioVenta(10,25));

    }
}