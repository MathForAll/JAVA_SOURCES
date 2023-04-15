package metodos;

public class fechas 
{

	public static void main(String[] args) 
	{
		int fecha1[] = {01, 01, 2005}; 
		int fecha2[] = {01, 05, 2005}; 
		
		distancia_dia(fecha1, fecha2);

	}
	
	public static void distancia_dia(int fecha1[], int fecha2[])
	{
		int meses[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 
		int dias = 0; 
		
		// fechaX[] = dias, meses, año
		
		
		if (fecha1[1] > fecha2[1])
			dias = (meses[fecha1[1] - 1] - fecha1[1]) + fecha2[1];
		else if (fecha1[1] < fecha2[1])
			dias = (meses[fecha2[1] - 1] - fecha2[1]) + fecha1[1];
		else
			if (fecha1[0] > fecha2[0])
				dias = fecha1[0] - fecha2[0]; 
			else
				dias = fecha2[0] - fecha1[0];
		
		
		if (fecha1[1] > fecha2[1])
			for (int i = fecha2[1]; i < fecha1[1] - 1; i++)
				dias += meses[i];
		else if (fecha1[1] < fecha2[1])
			for (int i = fecha1[1]; i < fecha2[1] - 1; i++)
				dias += meses[i];
		
		
		if (fecha1[2] > fecha2[2])
			dias += (fecha1[2] - fecha2[2]) * 365; 
		else
			dias += (fecha2[2] - fecha1[2]) * 365;
					
		
		System.out.println("La diferencia de dias es: " + dias); 
	}
}
