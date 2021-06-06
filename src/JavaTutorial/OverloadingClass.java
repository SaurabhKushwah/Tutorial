package JavaTutorial;

public class OverloadingClass {
	
	public void getData(int a) {
		System.out.println("Integer : " + a);
	}
	
	public void getData(String a) {
		System.out.println("String : " + a);
	}
	
	public void getData(int a, int b) {
		System.out.println("Sum : " + (a+b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingClass oc = new OverloadingClass();
		oc.getData(1);
		oc.getData("Saurabh");
		oc.getData(2, 3);
	}

}
