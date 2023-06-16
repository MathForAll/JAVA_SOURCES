package fichero;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class eliminar {

    public static void main(String[] args) 
    {
        // Ruta del archivo CSV
        String rutaArchivo = "C:\\Users\\cuadr\\Desktop\\productos.csv";

        // Número de línea que deseas eliminar (empezando desde 0)
        int numeroLinea = 2;



        // Llamar al método para editar la línea
        eliminarLineaCSV(rutaArchivo, numeroLinea);
    }

    public static void eliminarLineaCSV(String rutaArchivo, int numeroLinea) 
    {
        try 
        {
            // Crear un lector de archivos
            BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo));
            
            // Crear un escritor de archivos temporal
            BufferedWriter escritorTemp = new BufferedWriter(new FileWriter("temp.csv"));

            String lineaActual;
            int contadorLineas = 0;

            // Leer el archivo línea por línea
            while ((lineaActual = lector.readLine()) != null) 
            {
                // Verificar si es la línea que se desea eliminar
                if (contadorLineas != numeroLinea) 
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
