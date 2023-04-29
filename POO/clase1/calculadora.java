public class calculadora 
{
	public static void main(String[] args) 
	{
		circulo c = new circulo(0);
		rectangulo r = new rectangulo(0, 0);

		c.setRadio(2);
		System.out.println(c.area());
		System.out.println(c.longitud());
		
		r.setA(2);
		r.setB(2);
		
		System.out.println(r.area());
		System.out.println(r.perimetro());
	}

}
