package javalearning;

public class StaticAndNonStatic {
	
	static int b=30;
	int c=50;
	
	 static void mumbai() {
		
		System.out.println("You're in Mumbai");
		
	}
	
	void delhi() {
		System.out.println("You're in Delhi");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("You're in Main Method");
		mumbai();
		
		StaticAndNonStatic s=new StaticAndNonStatic();
		
		s.delhi();
		
		System.out.println(s.c);
		System.out.println(b);
		
		
		

	}

}
