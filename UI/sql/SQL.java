package sql;

import java.sql.*;


public class SQL 
{
    private final String url;
    private final  String username;
    private final  String password;

    public SQL() 
    {
        this.username = "root";
        this.url = "jdbc:mysql://localhost:3306/mfa";
        this.password = ""; 
    }

    public void conectar()
    {
        try 
        {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Conexión exitosa");
            // Aquí puedes ejecutar consultas o realizar otras operaciones con la base de datos
            connection.close();
        }
        catch (SQLException e) 
        {
            System.out.println("Error al conectar con la base de datos: " + e.getMessage());
        }
    }
    
    
    public void insert_persona(String nombre, String cedula, String numero)
    {
        try 
        {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            
            String query = "INSERT INTO persona (nombre, cedula, numero) VALUES('var_nombre', 'var_cedula', 'var_numero')";
            query = query.replace("var_nombre", nombre).replace("var_cedula", cedula).replace("var_numero",numero);
            
            
            
            int filasInsertadas = statement.executeUpdate(query);
            
            System.out.println("Filas insertadas: " + filasInsertadas);

            statement.close();
            connection.close();
            
            
        }
        catch (SQLException e) 
        {
            System.out.println("Error al ejecutar la consulta INSERT: " + e.getMessage());
        }
        
        
        
    }
}
