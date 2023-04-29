public class circulo 
{
	public float radio;
	
	public circulo (float radio) 
	{
		this.radio = radio;
	}
	
	public void setRadio(float radio) 
	{
		this.radio = radio; 
	}
	
	public float getRadio() 
	{
		return radio;
	}
	
	public float area() 
	{
		return (float) (Math.PI * Math.pow(radio, 2));
	}
	
	public float longitud()
	{
		return (float) (2 * Math.PI * radio); 
	}	
}
