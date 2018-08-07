package string;



public class StringBufferTest {

	public static void main(String args[]){
	StringBuffer strbf = new StringBuffer();
	
	String str = new String("_0abc");
	
	System.out.println(str.hashCode());
	
	str = str+"dj";
	System.out.println(str.hashCode());
	
	
	
	System.out.println(str+="abc".hashCode());
	
	System.out.println(str.codePointAt(0));
	
	
	strbf.append("ksdj");
	System.out.println(strbf.hashCode());
	

	strbf.append("ksdj_abc");
	System.out.println(strbf.hashCode());
	
	
	
	
	
	}
	
}
