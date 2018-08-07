package exception;

public class TestException {

	public static void main(String[] args) {
		int a;
		try{
			a= 1/0;
			System.out.println(a);
					
		}catch (Exception e){
			m1();
		}
		System.out.println("Exception");
	}
	
	
	public static void m1(){
		
		
		try{
			System.out.println("Exception m1");
		}catch (Exception e){
			e.printStackTrace();
		}
		
		
	}

}
