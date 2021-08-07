
public class SingletonPractice {

	public static void main(String[] args) {
		
		//Here no matter how many copies of objects we create they all will have same value
		Abc obj = Abc.temp;

	}
	
}

class Abc
{
	//Steps to make any class Singleton
	//Step 1 == Define your object as static in class itself
	static Abc temp = new Abc();
	//Step 2 == Make your class private
	private Abc() 
	{
		
	}
	/*
	 * Define a private static method getInstance(PREFERABLE) which returns object
	 * as your class type in this case we return temp as return to anyone who wants
	 * to create the object of the class
	 */
	private static Abc getInstance() 
	{
		return temp;
	}
}
