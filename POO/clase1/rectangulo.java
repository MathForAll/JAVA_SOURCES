public class rectangulo 
{
	public float a;
	public float b;
	
	public rectangulo(float a, float b)
	{
		this.a = a; 
		this.b = b; 
	}
	
	public void setA(float a)
	{
		this.a = a;
	}
	
	public void setB(float b)
	{
		this.b = b; 
	}
	
	public float getA()
	{
		return a;
	}
	
	public float getB()
	{
		return b;
	}
	
	public float area()
	{
		return a * b; 
	}
	
	public float perimetro()
	{
		return 2 * (a + b);
	}
	
}
