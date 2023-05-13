package listas;

import java.util.*;

public class lista2 
{

	public static void main(String[] args) 
	{
		
		List<Integer> n = new ArrayList<>();
		
		llenar_lista(n);
		
		for (int elemento : n)
			System.out.println(elemento);
		
		
		System.exit(0);
	}
	
	// Funcionan igual que los arreglos, si los modificas
	// en un metodo, se modifican en el principal
	public static void llenar_lista(List<Integer> n)
	{
		Random random = new Random();
		
		for (int i = 0; i < 10; i++)
			n.add(random.nextInt(500));
	}

}
