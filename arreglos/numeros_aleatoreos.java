package arreglos_bidimensionales;

import java.util.Random;


public class numeros_aletoreos 
{

	public static void main(String[] args) 
	{
		Random random = new Random(); 
		int a[] = new int[10]; 
		double b[] = new double[10]; 
		
		System.out.println("Numeros aleatoreos enteros \n\n");
		for (int i = 0; i < 10; i++)
		{
			a[i] = random.nextInt(500); // Devuelve un numero entre 0 y n - 1
			// random.nextInt(n); 			
			System.out.println(a[i]);
		}
			
		
		System.out.println("\n\nNumeros aleatoreos decimales \n\n");
		for (int i = 0; i < 10; i++) 
		{
			b[i] = random.nextDouble(); // Devuelve un numero entre [0 y 1) 
			System.out.println(b[i]); 
		}

		
		System.exit(0);
	}
}
