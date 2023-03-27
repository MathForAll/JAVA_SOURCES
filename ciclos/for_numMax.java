import javax.swing.JOptionPane;

public class max_media_min_ciclo 
{
	public static void main (String args[])
	{
		int n = 0; 
		float suma = 0, aux = 0, max = 0, min = 0;
		n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros que va a introducir: "));                                 
		
		
		
		
		for (int i = 0; i < n; i++)
		{
			aux = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el numero " + (i + 1) )); 
			suma += aux; 
			
			if (aux > max)
				max = aux; 
			
			if (i == 0)
				min = max; 
			
			if (aux < min)
				min = aux; 
                
			if (i == 0)
				max = min; 
		}
		
		JOptionPane.showMessageDialog(null,"max: " + max + "\nmin: " + min + "\nMedia: " + (suma / n));
		System.exit(0);
	}
}
