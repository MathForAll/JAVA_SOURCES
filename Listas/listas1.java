package listas;

import java.util.*;

public class listas1 
{
	public static void main(String args[])
	{
		List<String> nombres = new ArrayList<>();
		// Una lista es casi lo mismo que un arreglo
		// a diferencia de este, la lista, tiene tamaño n
		
		
		nombres.add("Juan");
		nombres.add("Juana");
		nombres.add("Mario");
		nombres.add("Maria");
		nombres.add("Alex");
		
		for (String nombre : nombres)
			System.out.println("Hola soy " + nombre);
		
		System.out.println("En la posición 3 está " + nombres.get(3));
		System.out.println("Juan está en la posicion: " + nombres.indexOf("Juan"));
		
		// Tambien se puede borrar! 
		System.out.println("En la posición 4 está " + nombres.get(4));
		nombres.remove(4);
		
		try
		{
			System.out.println("En la posición 4 está " + nombres.get(4));			
		}
		catch(Exception e)
		{
			System.out.println("Indice inexistente!!!");
		}
		
		// Puedes borrarlo todo!
		nombres.clear();
		for (String nombre : nombres)
			System.out.println("Hola soy " + nombre);
		
		
		System.exit(0); 
	}

}
