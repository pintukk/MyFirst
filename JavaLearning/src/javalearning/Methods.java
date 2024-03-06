package javalearning;

public class Methods {

	
	
	public static void call() {
		
		System.out.println("This is call method");
	}
	
public void speak() {
		
		System.out.println("This is speak method");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("This is first" );
		
		call();
		
		Methods m=new Methods();
		m.speak();

	}

}
