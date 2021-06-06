package JavaTutorial;

public class AbstractChildEmirite extends AbstractParentAircraft{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractChildEmirite a = new AbstractChildEmirite();
		a.bodyColor();
		a.engine();
		a.safetyGuideline();

		// The object of the Abstract class can not be created
		// Methods can not be declared as private in Abstract
	}

	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		
		System.out.println("Body Color also has to be Unique and in Golden");
	}

}
