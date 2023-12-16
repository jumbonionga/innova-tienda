public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto(
                "Leche Entera Alpina",
                "Bolsa x 1.100 ml",
                "Lacteos/Huevos y refrigerados",
                "Leches",
                3100,
                "URL Foto 1"
        );
        Producto producto2 = new Producto(
                "Leche Alpina Deslactosada",
                "Bolsa x 1.100 ml",
                "Lacteos/Huevos y refrigerados",
                "Leches",
                3400,
                "URL Foto 2"
        );
        Producto producto3 = new Producto(
                "Leche Alpina Semi-Descremada",
                "Bolsa x 1.100 ml",
                "Lacteos/Huevos y refrigerados",
                "Leches",
                3500,
                "URL Foto 3"
        );
        Producto producto4 = new Producto(
                "Leche Alpina Deslactosada-Descremada",
                "Bolsa x 1.100 ml",
                "Lacteos/Huevos y refrigerados",
                "Leches",
                3500,
                "URL Foto 4"
        );
        Producto producto5 = new Producto(
                "Leche Alpina Descremada",
                "Bolsa x 1.100 ml",
                "Lacteos/Huevos y refrigerados",
                "Leches",
                3500,
                "URL Foto 5"
        );

        System.out.println(producto1.mostrarDetalles() + "\n");
        System.out.println(producto2.mostrarDetalles() + "\n");
        System.out.println(producto3.mostrarDetalles() + "\n");
        System.out.println(producto4.mostrarDetalles() + "\n");
        System.out.println(producto5.mostrarDetalles() + "\n");
    }
}