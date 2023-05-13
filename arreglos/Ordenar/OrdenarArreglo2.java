package pruebas;

import java.util.Arrays;

public class OrdenarArreglo2 
{

	public static void main(String[] args) 
	{
		
		int[] arr = new int[]{12,3,5,21,4,85,6,9,2,1};
		
		// Ciclo For Each (por cada elemento)
		// Recorre todo el arreglo, no hay que especificarle inicio ni fin
		// java recorrerá desde el primer elemento hasta el último
		// Nota la variable del ciclo debe de ser del mismo tipo de dato que el arreglo. 
		
		for (int i : arr) 
		{
			System.out.print(i + " ");
		}
		
		// Ordena el arreglo
		// Recordar que un arreglo que es modificado en un método, será modificado en el principal
		Arrays.parallelSort(arr);
		
		System.out.println("\nORDENADO");
		
		
		for (int i : arr) 
		{
			System.out.print(i + " ");
		}
		
		System.exit(0);

	}

}
