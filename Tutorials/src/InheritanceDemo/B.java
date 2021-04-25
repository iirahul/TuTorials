package InheritanceDemo;

public class B extends A {
	public B() {
		
		
		System.out.println("Inside B constructor No Arguments");  // Constructor
	}
	
	public B(int i) {
		super(i);  //-----------------------------------------------------------
		System.out.println("Inside B constructor WITH Arguments"); // Constructor
	}

}
