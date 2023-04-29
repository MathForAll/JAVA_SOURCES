package notas;

public class universidad
{

	public static void main(String[] args) 
	{
		//estudiante m3 = new estudiante("", "", 0);
		estudiante m3[] = new estudiante[3];
		
		for (int i = 0; i < 3 ; i++)
			m3[i] = new estudiante("", "", 0);
		
		
		for(int i = 0; i < 3; i++)
		{
			m3[i].set_carnet();
			m3[i].set_nombre();
			m3[i].set_notas();
			m3[i].calcular_prom();
		}
		
		for(int i = 0; i < 3; i++)
		{
			System.out.println("Carnet: " + m3[i].get_carnet());
			System.out.println("Nombre: " + m3[i].get_nombre());
			m3[i].get_notas();
			System.out.println("Promedio: " + m3[i].get_prom());
			
			System.out.println("\n\n\n");
		}
		
		System.exit(0);
	}

}
