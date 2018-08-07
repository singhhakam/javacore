package string;

public class StringEqual {

	public static void main(String[] args) {
		String s1= new String ("abc");
		String s2 = new String("abc");
		final String s3=s1.intern();
		//String s3=s1;
		System.out.println(s1.equals(s2));
		System.out.println( s1==s2);
		System.out.println( s1==s3);
		System.out.println(s2==s3);
		
		System.out.println(s1.toString());
		System.out.println(s3.toString());
		
		String s4 = new String("abc");
		 
		String s5 = new String("abc");
		System.out.println(s4==s5);
		
		//System.out.println(s4.toCharArray().toString());
		char arr[]={'2','e'};
		//System.out.println(arr.toString());
		
		System.out.println(s1.toCharArray().toString());
		System.out.println(s2.toCharArray().toString());
		System.out.println(s3.toCharArray().toString());
		System.out.println(s4.toCharArray().toString());
		System.out.println(s5.toCharArray().toString());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.concat("ksdk").trim());
		System.out.println(s1.toLowerCase());
	}
	

}
