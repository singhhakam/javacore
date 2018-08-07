package finalkeyword;

public class NormalClass{
	final static int data;
	final  int number;
	
	 NormalClass(){
		this.number=10;
	}
	
	static{
		data=11;
	}

	public final void finalMethod(){
		System.out.println("final Method");
	}
	
	public static void main(String srgs[]){
		System.out.println("this is NormalClass");
		System.out.println(NormalClass.data);
		NormalClass nc = new NormalClass();
		System.out.println(nc.number);
	}
	
	
}
