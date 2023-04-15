package arreglos;

import java.util.Scanner;
import java.util.Random;

public class suma_columnas 
{

	public static void main(String[] args) 
	{
		Scanner get_data = new Scanner(System.in); 
		Random random = new Random();
		
		int n = 0, m = 0; 
		
		System.out.print("Ingrese la cantidad de filas: ");
		n = get_data.nextInt();
		
		System.out.print("Ingrese la cantidad de columnas: ");
		m = get_data.nextInt();
		
		int matriz[][] = new int[n][m]; 
		int array_col[] = new int[m];
		
		for (int f = 0; f < n; f++)
		{
			for (int c = 0; c < m; c++) 
			{
				matriz[f][c] = random.nextInt(10);
				System.out.print(matriz[f][c] + " ");
			}
			System.out.print("\n");
		}
		
		System.out.print("\n\n\n"); 
		
		plus_columns(matriz, array_col, n, m);
		
		for (int i = 0; i < m; i++)
			System.out.print(array_col[i] + " ");
		
		System.exit(0);

	}
	
	public static void plus_columns(int matriz[][], int array_col[], int n, int m)                           
	{
		for (int c = 0; c < m; c++)
			for (int f = 0; f < n; f++)
				array_col[c] += matriz[f][c]; 
	}
	
}
