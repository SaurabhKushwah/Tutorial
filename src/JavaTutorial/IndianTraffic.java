package JavaTutorial;

public class IndianTraffic implements CentralTraffic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CentralTraffic ct = new IndianTraffic();
		ct.greenGo();
		ct.yellowWait();
		ct.redStop();
		
		IndianTraffic it = new IndianTraffic();
		it.walkOnWalkSymbol();
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("Green Means GO");
	}

	@Override
	public void yellowWait() {
		// TODO Auto-generated method stub
		System.out.println("Yello Means WAIT");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Red Means STOP");
	}
	
	public void walkOnWalkSymbol() {
		System.out.println("Walk on WALK Symbol");
	}
}
