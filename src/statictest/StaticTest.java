package statictest;

public class StaticTest {

	static int var1 = 10;
	public  static void test1(int i){
		System.out.println("method static i");
	}
	
	public  static void test1(long l){
		System.out.println("method static l");
	}
	
	public  static void test1(double d){
		System.out.println("method static d");
	}
	
	static{
		
		System.out.println(var1);
	}
	
	public static void main(String args[]){
		int i=7; long l=9; double d=9;
		System.out.println("hello");
		StaticTest.test1(d);
		test1(l);
		
	}
   	
}
