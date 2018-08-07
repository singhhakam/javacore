package inheritanceTest;

public class B extends A{


	public int a;
	
	public void setA(int a){
		this.a = a;
	}
	
	public int getA(){
		return a;
	}
	
	static{
		A a = new A();
		a.setA(9);
		System.out.println(a.getA());
	}
	
	public static void main(String args[]){
		/*
		A a = new A();
		System.out.println(a.getA());
		
		A b = new B();
		
		System.out.println(b.getA());
		b.setA(990);
		
		System.out.println(b.getA());
		*/

	}

}