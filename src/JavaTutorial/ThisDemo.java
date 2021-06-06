package JavaTutorial;

public class ThisDemo {
	
	int i = 20;
	
	// This refers to the current object-object scope is at the class level
	
	public void getData()
	{
		int i =30;
		System.out.println(i);
		System.out.println(this.i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisDemo td = new ThisDemo();
		td.getData();
		
	}

}
