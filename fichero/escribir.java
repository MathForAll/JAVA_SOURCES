package fichero;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class escribir {

    public static void main(String[] args) {
        
    	String identificadores[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}; 
    	String nombre[] = {"arroz", "frijol", "azucar", "sal", "aceite", "cafe", "leche", "huevos", "pan", "jabon"};



        try 
        {
            // Crea un objeto FileWriter para escribir en el archivo
            FileWriter fileWriter = new FileWriter("C:\\Users\\cuadr\\Desktop\\productos.csv", false);
            //FileWriter fileWriter = new FileWriter("C:\\Users\\cuadr\\Desktop\\productos.csv", false);
            // TRUE no borra contenido, FALSE si
            
            // Crea un objeto BufferedWriter para escribir de forma eficiente
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            
            

            // Escribe el contenido en el archivo
            bufferedWriter.write("identifocador,nombre,cant,precio\n");

            for (int i = 0; i < identificadores.length; i++)
            {
            	bufferedWriter.write(identificadores[i] + ", " + nombre[i] + ", " + getRandomCantidad() + ", " + getRandomPrecio() + "\n");	
            }

            // Cierra el BufferedWriter
            bufferedWriter.close();

            System.out.println("Archivo creado correctamente.");
        }
        catch (IOException e) 
        {
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }
    }
    
    private static int getRandomCantidad() {
        return (int) (Math.random() * 20) + 1;
    }

    private static double getRandomPrecio() {
        return Math.random() * 50 + 10;
    }
}
