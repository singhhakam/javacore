package javacore;

public class ScopeOfVariables {
	public static int a=10;
	
	
	
	
	public static void main(String args[]){
		
		ScopeOfVariables varObj= new ScopeOfVariables();
		
		System.out.println(ScopeOfVariables.a++);
		System.out.println(varObj.a);
		System.out.println(a);
	}

}
