import javax.swing.*; 

public class tabla_while 
{

	public static void main(String[] args) 
	{
		int n = 0; 
		int i = 0; 
		n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
		
		System.out.println("La tabla del numero: " + n + " es: ");
		while (i <= 12)
		{
			// n * i = (n * i)
			System.out.println(n + " * " + i + " = " + (n * i));
			i++;
		}
		System.exit(0);
	}
}
