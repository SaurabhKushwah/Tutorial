package JavaTutorial;

public class StaticDemo {
	
	//Instance variable as these are dependent on instance/object of the class
	String name;
	String address;
	String city;
	String country;
	//Static variable
	static String ISOCode = "IN";
	static int i = 0;
	
	StaticDemo(String n, String a, String c, String cou)
	{
		this.name = n;
		this.address = a;
		this.city = c;
		this.country = cou;
		i++;
	}
	
	public void getName() 
	{
		System.out.println(name + " " + i);
	}

	public void getAddress() 
	{
		System.out.println(address + " " + i);
	}
	
	public static void getISO()
	{
		System.out.println(ISOCode + " " + i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticDemo sd = new StaticDemo("Saurabh","EC1","Bangalore","India");
		StaticDemo sd1 = new StaticDemo("Deepali","EC2","Ban","India");
		
		sd.getAddress();
		sd.getName();
		sd1.getAddress();
		sd1.getName();
		
		System.out.println(StaticDemo.ISOCode);
		StaticDemo.getISO();
	}


}
