import java.util.*;

public class validar_int 
{

	public static void main(String[] args) 
	{
		//int n = 0;
		
		int a[] = new int[10]; 
		
		
		//n = get_int(); 
		//System.out.print(n);
		
		for (int i = 0; i < 10; i++)
			a[i] = get_int(); 
		
		for (int i = 0; i < 10; i++)
			System.out.println("#" + i + " = " + a[i]); 
		
		/*
		String n = "Hola Mundo"; 
		System.out.println(n.length()); 
		System.out.println(n.charAt(5));
		*/
		
		System.exit(0);
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
