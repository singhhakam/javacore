package string;

public class StringPool {

	public static void main(String[] args) {
		String name = "ABC";
		String address = "xyz";

		char[] brr = {'x','y','z'};
		
		
		System.out.println(name);
		System.out.println(brr);
		
		System.out.println(brr.toString());
		System.out.println(brr.equals(address.toCharArray().toString()));
		address.split("\\s");
		System.out.println();
			
	}

}
