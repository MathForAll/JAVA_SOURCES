import javax.swing.JOptionPane;

public class metodos_1 {

	public static void main(String[] args) 
	{
		int n = 0;
		
		n = suma(5, 3);
		JOptionPane.showMessageDialog(null, n);
		
		
		n = suma(55, 333);
		JOptionPane.showMessageDialog(null, n);
		
		
		
		n = suma(20, 37);
		JOptionPane.showMessageDialog(null, n);
		
		System.exit(0);
	}
	
	public static int suma (int a, int b)
	{
		int c = 0;
		c = a + b; 
		return c; 
	}
	

}
