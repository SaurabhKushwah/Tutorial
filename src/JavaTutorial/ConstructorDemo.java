package JavaTutorial;

public class ConstructorDemo {
	
	
	//Constructor doesn't return any value
	
	public ConstructorDemo() {
		System.out.println("I am in the constructor");
	}
	
	public void getData() {
		System.out.println("This is getData method");
	}
	
	public ConstructorDemo(int a, int b) {
		int c= a+b;
		System.out.println("Addition is : " + c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorDemo cd = new ConstructorDemo();
		ConstructorDemo c = new ConstructorDemo(5,10);

	}

}
