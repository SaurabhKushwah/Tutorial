package JavaTutorial;

public abstract class AbstractParentAircraft {
	
	public void engine() {
		System.out.println("This is the engine of the aircraft");
	}
	
	public void safetyGuideline() {
		System.out.println("All aircraft need to adhere to the safety guidelines");
	}
	
	public abstract void bodyColor();

}
