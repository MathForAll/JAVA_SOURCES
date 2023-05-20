
public class universidad 
{
	public static void main(String args[])
	{
		estudiante Keeners = new estudiante("Keeners", (float) (1.6), 16, 120, "EXTROVERTIDO", "UNI", "2023-1086U" , "ING. SISTEMAS", (float) (90.5));
		
		Keeners.presentar();
		Keeners.hablar("HOLA");
		Keeners.estudiar();
		Keeners.informacion();
		
		System.exit(0);
	}

}
