import javax.swing.*;
import java.util.Scanner;

public class area_circulo 
{

	public static void main(String[] args) 
	{
	    Scanner getD = new Scanner (System.in);   
	    
		int r = 0;
		float a;
		System.out.print("Ingrese un radio: "); 
		r = getD.nextInt(); 
		a = (float)(Math.PI * Math.pow(r, 2));
		JOptionPane.showMessageDialog(null, "El valor del area es: " + a);
	
	}

}
