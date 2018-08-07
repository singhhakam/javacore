package objectClone;

public class ObjectClone implements Cloneable {
	
	
	int age;
	String name ;
	
	
	ObjectClone(int age, String name){
		this.age=age;
		this.name= name;
		
	}

	public Object clone()throws CloneNotSupportedException{
		return super.clone();
	}
	
	
	public static void main(String[] args) {
		
		try{
		ObjectClone oc1 = new ObjectClone(21, "Sachin");
		ObjectClone oc2 = new ObjectClone(12, "ANkit");
		
		
		ObjectClone oc3 = (ObjectClone)oc1.clone();
		
		
		System.out.println(oc1.name);
		System.out.println(oc2.name);
		System.out.println(oc3.name);
		
		}catch(CloneNotSupportedException c){
			System.out.println(c);
		}
	}
}
