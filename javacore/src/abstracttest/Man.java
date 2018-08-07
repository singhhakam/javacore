package abstracttest;

public class Man extends Person{
	
	@Override
	public void man(){
		System.out.println("this is abstract man method");
	}
	
	public void man1(){
		System.out.println("main1");
	}
	
	public static void main(String args[]){
		Person p = new Man();
		Man m = new Man();
		p.man();
		p.work();
		
		m.man();
		m.man1();
		m.work();
	}
}
