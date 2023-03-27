import javax.swing.*; 
public class condicionales 
{
	public static void main(String[] args)
	{
		int n; 
		n = Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero: "));
		/*
		if (n == 0)
			JOptionPane.showMessageDialog(null, "El numero es nulo");
		*/
		if (n > 0)
			JOptionPane.showMessageDialog(null, "El numero es positivo"); 
		else if (n == 0)
			JOptionPane.showMessageDialog(null, "El numero es nulo");
		else
			JOptionPane.showMessageDialog(null, "El numero es negativo");
		
		
		
		System.exit(0);
	}
}
