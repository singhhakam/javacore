package inheritanceTest;

public class A {
	
	public int a=10;
	
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
		A a = new A();
		System.out.println(a.getA());
	}
}
