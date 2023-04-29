package notas;

import java.util.Scanner;

public class estudiante 
{
	private String carnet; 
	private String nombre; 
	private float nts[] = new float[6];
	private float prom;
	
	Scanner get_data = new Scanner(System.in);
	
	public estudiante(String carnet, String nombre, float prom)
	{
		this.carnet = carnet; 
		this.nombre = nombre;
		this.prom = prom;
	}
	
	
	public void set_carnet()
	{
		System.out.println("\n\n\n\nEscriba un carnet: "); 
		this.carnet = get_data.next(); 
	}
	
	public String get_carnet()
	{
		return carnet; 
	}
	
	public void set_nombre()
	{
		System.out.println("\nEscriba un nombre: ");
		this.nombre = get_data.next(); 
	}
	
	public String get_nombre()
	{
		return nombre; 
	}
	
	public void set_notas()
	{
		for (int i = 0; i < 6; i++)
		{
			System.out.print("\nIngrese la nota#" + (i + 1) + " : ");
			nts[i] = get_data.nextFloat();
		}
	}
	
	/*
	public float[] get_notas()
	{
		return nts; 
	}
	*/
	
	public void get_notas()
	{
		System.out.println("Las notas del estudiante son: ");
		for (int i = 0; i < 6; i++)
			System.out.println("Nota# " +  (i + 1) + " : " + nts[i]);
	}
	
	public void set_prom(float prom)
	{
		this.prom = prom;
	}
	
	public float get_prom()
	{
		return prom; 
	}
	
	
	public float calcular_prom()
	{
		prom = 0;
		for (int i = 0; i < 6; i++)
			prom += nts[i];
		
		prom /= 6;
		
		return prom;
	}
	
	
	
	
	
	
}
