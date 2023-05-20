import javax.swing.JOptionPane;

public class persona 
{
	public String nombre; 
	public float altura; 
	public int edad; 
	public float peso; 
	public String personalidad;
	

	
	public persona (String nombre, float altura, int edad, float peso, String personalidad)
	{
		this.nombre = nombre; 
		this.altura = altura; 
		this.edad = edad; 
		this.peso =  peso;
		this.personalidad  = personalidad; 
	}
	
	
	
	public void set_nombre(String nombre) 
	{
		this.nombre = nombre; 
	}
	
	public String get_nombre()
	{
		return nombre; 
	}



	public float getAltura() 
	{
		return altura;
	}



	public void setAltura(float altura) 
	{
		this.altura = altura;
	}



	public int getEdad() 
	{
		return edad;
	}



	public void setEdad(int edad) 
	{
		this.edad = edad;
	}



	public float getPeso() 
	{
		return peso;
	}



	public void setPeso(float peso) 
	{
		this.peso = peso;
	}



	public String getPersonalidad() 
	{
		return personalidad;
	}



	public void setPersonalidad(String personalidad) 
	{
		this.personalidad = personalidad;
	}
	
	public void presentar()
	{
		JOptionPane.showMessageDialog(null, "Mi nombre es: " +  nombre);
	}
	
	public void hablar(String texto)
	{
		JOptionPane.showMessageDialog(null, nombre + ": " + texto);
	}


}
