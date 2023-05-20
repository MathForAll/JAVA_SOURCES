package polimorfismo_eje_1;

public class principal 
{

	public static void main(String[] args) 
	{
		animals animal = new animals(); 
		animals dog = new dog(); 
		animals cat = new cat(); 
		
		animal.makeSound();
		dog.makeSound();
		cat.makeSound(); 

	}

}
