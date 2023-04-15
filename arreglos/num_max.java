package arreglos;

import java.util.Random;
//import java.util.*;

public class n_max {

	public static void main(String[] args) {
		
		Random random = new Random(); 
		//Scanner get_data = new Scanner(System.in);
		
		int a[] = new int[10]; 
		
		
		for (int i = 0; i < 10; i++) 
		{
			//System.out.print("Ingresa un dato: "); 
			//a[i] = get_data.nextInt(); 
			a[i] = random.nextInt(531) * (-1); 
			System.out.println(a[i]);
		}	
		
		num_max(a); 
		
		System.exit(0);	
	}
	
	public static void num_max(int a[])
	{
		int max = a[0]; 
		
		for (int i = 1; i < 10; i++)
			if (a[i] > max)
					max = a[i];
		
		System.out.println("El numero mas grande es: " + max);
	}
	
	
}
