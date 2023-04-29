package recursividad;

public class eje_recursividad1 
{
	public static void main(String args[])
	{
		//for(int n=0; n<101;n++)
			//System.out.println(n);
		
		contador(0);
		
		System.out.print("hola");
		
		System.exit(0); 
	}
	
	public static void contador (int n) 
	{
		if (n == 101)
			System.exit(0);
		
		System.out.println(n); 
		n++;
		contador(n);
	}

}
