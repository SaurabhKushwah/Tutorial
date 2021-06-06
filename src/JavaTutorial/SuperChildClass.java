package JavaTutorial;

public class SuperChildClass extends SuperParentClass{
	
	String name = new String("Super Child Class");
	
	public void getName() {
		System.out.println(name);
		System.out.println(super.name);
	}

	public void getData()
	{
		System.out.println("In Child Class get data method");
		super.getData();
	}
	
	public SuperChildClass()
	{
		super(); //This always has to be the first line in the constructor if we are calling the parent class constructor
		System.out.println("Super Child Class Constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperChildClass scc = new SuperChildClass();
		scc.getName();
		scc.getData();
	}

}
