package arreglos;

import java.util.*;
public class arreglos_bidimensionales 
{

	public static void main(String[] args) 
	{
		Scanner get_data = new Scanner(System.in);
		int matriz[][] = new int[3][3]; 
		
		for(int f = 0; f < 3; f++)
		{
			for(int c = 0; c < 3; c++)
			{
				System.out.print("Enter the value for [" + f + "][" + c + "]: ");                                    
				matriz[f][c] = get_data.nextInt(); 
			}			
		}
		
		for(int f = 0; f < 3; f++)
		{
			for(int c = 0; c < 3; c++)
			{
				System.out.print("| "+ matriz[f][c] + "\t |" ); 						
			}
			System.out.println("");
			System.out.print("------------------------------------\n"); // System.out.print("\n");
		}
		
		
		System.exit(0);
	}

}
