import java.io.*;

public class AdministradorArchivos {
    String path;

    public AdministradorArchivos(String path) {
        this.path = path;
    }

    // TODO: Implementar método para leer datos del archivo de inventario
    public void leerArchivo(String path) throws CargaDatosException {
        BufferedReader bufferedReader = null;
        // Implementar lógica de lectura de archivo
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // TODO: Implementar método para escribir datos en el archivo de inventario
    public void escribirArchivo(String datos, boolean append) throws GuardarDatosException {
        // Implementar lógica de escritura de archivo
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, append));
            bufferedWriter.write(datos);
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void verificarArchivo(String path) throws ArchivoNoEncontradoException {
        File file = new File(path);
        if (!file.exists()) {
            throw new ArchivoNoEncontradoException("File " + path + " doesn't exist");
        }
    }

    public void crearArchivo(String path) throws ArchivoYaExisteException {
        File file = new File(path);
        if (file.exists()) {
            throw new ArchivoYaExisteException("File " + path + " already exists");
        } else {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
