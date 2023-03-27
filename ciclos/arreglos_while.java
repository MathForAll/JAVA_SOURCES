import javax.swing.*;

public class arreglos_ciclos 
{

	public static void main(String[] args) 
	{
		float notas[] = new float[10]; 
		float suma = 0, promedio = 0; 
		int contador = 0; 
		
		/*do
		{
			notas[contador] = Float.parseFloat(JOptionPane.showInputDialog("Ingrese su nota #" + (contador + 1)));                                        
			suma += notas[contador]; 
			contador++; 
		}
		while(contador != 10);*/
		
		while(contador != 10)
		{
			notas[contador] = Float.parseFloat(JOptionPane.showInputDialog("Ingrese su nota #" + (contador + 1)));                                        
			suma += notas[contador]; 
			contador++; 
			
		}
		
		promedio = suma / 10; 
		
		JOptionPane.showMessageDialog(null, "Tu promedio es: " +  promedio);
		
		System.exit(0);
	}

}




