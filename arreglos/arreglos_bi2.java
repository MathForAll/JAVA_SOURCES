package arreglos;

import java.util.Scanner;

public class arreglos_bi2 
{

	public static void main(String[] args) 
	{
		int n = 0, m = 0; 
		System.out.println("Ingresa n: "); 
		n = get_int(); 
		System.out.println("Ingresa m: "); 
		m = get_int(); 
		
		int a[][] = new int[n][m]; 
		add_elements(a, n, m); 
		print_elements(a, n, m); 

		System.out.println("Ingresa n: "); 
		n = get_int(); 
		System.out.println("Ingresa m: "); 
		m = get_int(); 
		
		int b[][] = new int[n][m]; 
		add_elements(b, n, m); 
		print_elements(b, n, m);
		
	}
	
	public static void add_elements(int a[][], int n, int m)
	{
		for (int f = 0; f < n; f++)
			for (int c = 0; c < m; c++)
				a[f][c] = get_int(); 
	}
	
	public static void print_elements(int a[][], int n, int m)
	{
		for(int f = 0; f < n; f++)
		{
			for(int c = 0; c < m; c++)
			{
				System.out.print("| "+ a[f][c] + "\t |" ); 						
			}
			System.out.println("");
			System.out.print("------------------------------------\n"); // System.out.print("\n");
		}
	}
	
	public static int get_int()
	{
		Scanner get = new Scanner(System.in); 
		String aux = ""; 
		Boolean valida = true; 
		
		do 
		{			
			System.out.print("Ingresa un numero: ");
			aux = get.next(); 
			
			valida = true; 
			for (int i = 0;  i < aux.length(); i++)
			{
				if (aux.charAt(i) < '0' || aux.charAt(i) > '9')                   
					valida = false;
			}
		}
		while (valida == false); 
		
		return Integer.parseInt(aux); 
	}

}
