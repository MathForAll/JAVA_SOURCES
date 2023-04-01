import java.util.*; 
public class pedir_n_numeros 
{

	public static void main(String[] args) 
	{
		Scanner get_data = new Scanner(System.in); 
		String opc = ""; 
		int contador = 0;
		int n = 0; 
		
		do
		{
			n = get_int(); 	
			contador++; 

			do
			{
				System.out.println("Desea continuar? ");
				opc = get_data.next(); 
			}
			while(!(opc.equalsIgnoreCase("si")) && !(opc.equalsIgnoreCase("no")));                            
				//  FALSE                       &&            TRUE                                
				// si SI Si sI
				// no NO No nO
		}
		while(opc.equalsIgnoreCase("si")); 
		
		
		
		System.out.println("Se introdujeron: " + contador + " numeros");
		
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
