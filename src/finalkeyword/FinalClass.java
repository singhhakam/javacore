package finalkeyword;

public final class FinalClass extends NormalClass{
	
	public void test(){
		System.out.println("This is final class");
	}
	
	
	public static void main(String args[]){
		
		FinalClass fc = new FinalClass();
		fc.finalMethod();
	}

}
