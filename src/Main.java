import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        ProductoAlimenticio alimenticio1 = new ProductoAlimenticio(
//                "Leche Entera Alpina",
//                "Bolsa 1x1.100 ml",
//                "Lacteo/Huevos y refrigerados",
//                "Leches",
//                3100,
//                "URL Foto 1",
//                "2024-12-22"
//        );
//        ProductoElectronico electronico1 = new ProductoElectronico(
//                "Radio Panasonic",
//                "Radio AM/FM",
//                "Articulo de Audio/Video",
//                "Radios",
//                150000,
//                "URL Foto 2",
//                12
//        );
//
//        System.out.println(alimenticio1.mostrarDetalles());
//        System.out.println("Precio venta: " + alimenticio1.calcularPrecioVenta(0.12, 0.05));
//        System.out.println(" ");
//        System.out.println(electronico1.mostrarDetalles());
//        System.out.println("Precio venta: " + electronico1.calcularPrecioVenta(10, 25));
        // TODO: Definir si el path al archivo debe ir quemado o configurable
        String path = "inventario.csv";
        //List<Producto> inventario = new ArrayList<>();

        // TODO: Definir si se debe incluir el header del inventario
        String dataHeader = "Nombre,Descripcion,Categoria,Etiquetas,Precio,URL Foto";

        // Crear nuevo objeto de Administrador de Archivo
        AdministradorArchivos fileAdmin = new AdministradorArchivos(path);

        // Verificar si el Archivo designado en 'path' ya existe
        try {
            fileAdmin.verificarArchivo(path);
        } catch (ArchivoNoEncontradoException e) {
            // Si no existe...
            System.out.println(e.getMessage());
            // ... crear archivo
            System.out.println("Creando archivo " + path);
            try {
                fileAdmin.crearArchivo(path);
            } catch (ArchivoYaExisteException ex) {
                System.out.println(ex.getMessage());
            }
        }

        // Escribir el encabezado del CSV.
        try {
            fileAdmin.escribirArchivo(dataHeader,false);
        } catch (GuardarDatosException e) {
            throw new RuntimeException(e);
        }

        // Leer archivo
        try {
            fileAdmin.leerArchivo(path);
        } catch (CargaDatosException e) {
            throw new RuntimeException(e);
        }

    }
}