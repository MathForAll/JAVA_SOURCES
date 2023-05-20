package polimorfismo_eje_2;

public class principal 
{
	public static void main (String args[])
    {
        calculos c = new calculos(); 
        
        // Cambia el color de fondo
        System.out.print("\033[40m");
        
        // Cambia el color del texto
        System.out.print("\033[32m");
        
        System.out.println(c.sumar(1, 2));
        System.out.println(c.sumar(1, 2, 3));
        System.out.println(c.sumar(1.23, 4.56));
        System.out.println(c.sumar(1.1f, 1.2f));
        
        System.exit(0);
    }
}
