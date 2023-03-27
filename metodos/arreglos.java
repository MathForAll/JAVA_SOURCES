import java.util.Scanner;

public class arreglos 
{

	public static void main(String[] args) 
	{
		int presion[] = new int[5]; 
		int volumen[] = new int[5];
		int temperatura[] = new int[5];
		
		for(int i = 0; i < 5; i++)
		{
			presion[i] = get_int();
			volumen[i] = get_int(); 
			temperatura[i] = get_int();
		}
		
		c_masa(presion, temperatura, volumen); 
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
	
	
	
	public static void c_masa(int presion[], int temperatura[], int volumen[]) 
	{
		String masa = "";
		float aux; 
		for (int i = 0; i < 5; i++)
		{
			aux = (presion[i] * volumen[i]) / (float)(0.37 * temperatura[i] + 460); 
			masa += "#" + i + " = " + aux + "\n"; 
		}
		System.out.print(masa); 
	}
}
