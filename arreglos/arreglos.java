import javax.swing.*;

public class arreglos 
{
	public static void main (String[] args)
	{
		// tipo_dato nombre[] = new tipo_dato[n];
		int edades[] = new int[8];
		float promedio; 
		
		edades[0] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad #1"));
		edades[1] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad #2"));
		edades[2] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad #3"));
		edades[3] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad #4"));
		edades[4] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad #5"));
		edades[5] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad #6"));
		edades[6] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad #7"));
		edades[7] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad #8"));
		
		
		promedio = edades[0] + edades[1] + edades[2] + edades[3] + edades[4] + edades[5];
		promedio += edades[6] + edades[7];
		promedio /= 8; 
		
		JOptionPane.showMessageDialog(null, "El promedio de las edades es: " + promedio);
		
		// x = x + 1  ==> x += 1; ==> x++;
		// x = x - 1  ==> x -= 1; ==> x--;
		// y = y * x  ==> y *= x; 
		// y = y / 5  ==> y /= 5; 
		
		
		System.exit(0);
	}
}
