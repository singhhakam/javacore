package interfacetest;

public class TataNano implements Car,DataInterface {
	
	
	@Override
	public void speed(){
		System.out.println("Max speed 120 KM/hr");
	}
	
	@Override
	public void company(){
		System.out.println("TATA Motors");
	}
	
	public static void main(String[] args) {
		System.out.println("Test");
		TataNano tn= new TataNano();
		Car c = new TataNano();
		c.company();
		c.speed();
	
		tn.company();
		tn.speed();
		
		System.out.println(tn.WHEELS);
		
		System.out.println(tn.SPEED);
	}

}
