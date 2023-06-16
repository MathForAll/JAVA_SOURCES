package fichero;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class leer {

    public static void main(String[] args) {
        try {
            // Crear una instancia de la clase File con la ruta del archivo
            File archivo = new File("C:\\Users\\cuadr\\Desktop\\productos.csv");
            
            // Crear un objeto Scanner e inicializarlo con el archivo
            Scanner scanner = new Scanner(archivo);

            String linea = ""; 
            // Leer cada línea del archivo hasta que no haya más líneas
            while (scanner.hasNextLine()) {
                // Leer la siguiente línea del archivo
                linea = scanner.nextLine();
                
                // Imprimir la línea en la consola
                System.out.println(linea);
            }

            // Cerrar el objeto Scanner para liberar los recursos
            scanner.close();
        }
        catch (FileNotFoundException e)
        {
            // Manejar la excepción si el archivo no se encuentra
            System.out.println("Archivo no encontrado: " + e.getMessage());
        }
    }
}
