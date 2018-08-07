package statictest;

public abstract class Abc {
	
	public static final double FIE=3.14;
	int nonstatic = 6;

	public void set(int nonstatic){
		this.nonstatic=nonstatic;
	}
	
	public int get(){
		return nonstatic;
	}
	
	
	public static void main(String[] args) {
		//Abc abcobj =new Abc();
		//abcobj.set(10);
		
	//	System.out.println(abcobj.get());
		
		//System.out.println(abcobj.FIE);
		System.out.println(Abc.FIE);
		System.out.println(FIE);
		
	}

	
}
