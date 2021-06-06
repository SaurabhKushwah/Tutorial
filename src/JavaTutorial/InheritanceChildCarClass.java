package JavaTutorial;

public class InheritanceChildCarClass extends InheritanceParentCarClass {
	
	public void engine() {
		System.out.println("This is the implementation of Engine in Child Class");
	}
	
	public void color() {
		System.out.println("This is the implementation of Color in Child Class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InheritanceChildCarClass cc = new InheritanceChildCarClass();
		cc.brakes();
		cc.color();
		cc.engine();
		cc.gears();

	}

}
