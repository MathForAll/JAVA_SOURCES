package recursividad;

public class factorial 
{

	public static void main(String[] args) 
	{
		int f = calcular_factorial(6);
		System.out.println(f); 
		/*
		
		for (int i = 6; i  >= 1; i--)
			f *= i; 
			
		System.out.println(f);
		*/
		System.exit(0);
	}
	
	public static int calcular_factorial(int f)
	{
		if (f == 1)
			return 1;
		
		return f * calcular_factorial(f -= 1);
	}
	
}
