package fichero;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class EditarLineaCSV {

    public static void main(String[] args) {
        // Ruta del archivo CSV
        String rutaArchivo = "C:\\Users\\cuadr\\Desktop\\productos.csv";

        // Número de línea que deseas editar (empezando desde 0)
        int numeroLinea = 2;

        // Nueva línea que reemplazará a la existente
        String nuevaLinea = "1, gaasdfasdfrbanzo, 50, 200";

        // Llamar al método para editar la línea
        editarLineaCSV(rutaArchivo, numeroLinea, nuevaLinea);
    }

    public static void editarLineaCSV(String rutaArchivo, int numeroLinea, String nuevaLinea) {
        try {
            // Crear un lector de archivos
            BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo));
            
            // Crear un escritor de archivos temporal
            BufferedWriter escritorTemp = new BufferedWriter(new FileWriter("temp.csv"));

            String lineaActual;
            int contadorLineas = 0;

            // Leer el archivo línea por línea
            while ((lineaActual = lector.readLine()) != null) 
            {
                // Verificar si es la línea que se desea editar
                if (contadorLineas == numeroLinea) 
                {
                    // Reemplazar la línea existente por la nueva línea
                    escritorTemp.write(nuevaLinea);
                    escritorTemp.newLine();
                }
                else 
                {
                    // Mantener la línea original sin cambios
                    escritorTemp.write(lineaActual);
                    escritorTemp.newLine();
                }

                contadorLineas++;
            }

            lector.close();
            escritorTemp.close();

          
            // Renombrar el archivo temporal y sobreescribir el archivo original
            Path archivoOriginal = Path.of(rutaArchivo);
            Path archivoTemporal = Path.of("temp.csv");
            Files.move(archivoTemporal, archivoOriginal, StandardCopyOption.REPLACE_EXISTING);


            System.out.println("Línea editada correctamente.");
        } 
        catch (IOException e) 
        {
            System.out.println("Error al editar la línea: " + e.getMessage());
        }
    }
}
