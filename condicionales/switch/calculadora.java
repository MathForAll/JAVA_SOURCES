import javax.swing.JOptionPane;

public class calculadora 
{
	public static void main(String args[])
	{
		String opc = "";
		int a = 0, b = 0;
		opc = JOptionPane.showInputDialog("Seleccione la operacion a realizar \n"
										+ "[+] Sumar \n"
										+ "[-] Restar \n"
										+ "[*] Multiplicar \n"
										+ "[/] Dividir \n"
										+ "[^] Potencia \n"
										+ "[s] Raiz cuadrada\n");                                                 
		
		switch (opc)
		{
			case "+":
				a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
				b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
				
				JOptionPane.showMessageDialog(null, a + " + " + b + " = " + (a + b));
				break;
				
			case "-":
				a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
				b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
				
				JOptionPane.showMessageDialog(null, a + " - " + b + " = " + (a - b));
				break; 
				
			case "*":
				a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
				b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
				
				JOptionPane.showMessageDialog(null, a + " * " + b + " = " + (a * b));
				break;
				
			case "/":
				a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero" ));
				b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
				
				JOptionPane.showMessageDialog(null, a + " / " + b + " = " + (a / b));
				break;
				
			case "^":
				a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base: "));
				b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el exponente: "));
				
				JOptionPane.showMessageDialog(null, a + "^" + b + " = " +  (int)Math.pow(a, b) );
				break;
				
			case "s":
				a = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero: "));
				
				JOptionPane.showMessageDialog(null,"La raiz cuadrada de " + a + " = " + (int)Math.sqrt(a));                                      
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "La repuesta es incorrecta=");
				break;
		}
		
		System.exit(0);
	}
}
