package inheritanceTest;

public final class Derived extends Base {
	int a= 99;
	
	public void m1(){
		System.out.println("THIS is M1 from Derived");
	}
	

	protected void m2(){
		System.out.println("this is M2 form Derived");
	}

	private void m3(){
		System.out.println("this is M3 from Derived");
	}

	
	public static void main(String[] args) {
		Base b = new Derived();
		Base bd = new Base();
		Derived d = new Derived();
		
		//b.a=10;
		System.out.println(b.a);
		System.out.println(bd.a);
		System.out.println(d.a);
		
		b.m1();
		bd.m1();
		d.m1();
		
		b.m2();
		//b.m3();
		
		bd.m2();
		//bd.m3();
		
		d.m2();
		d.m3();
		
		
		

	}

}
