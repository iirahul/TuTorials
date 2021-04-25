
class A{
	void show() {

		
		System.out.println("Inside A "); 
 }
}

    class B extends A {
    	
	void show() {
		System.out.println("Inside B"); 
}
    }
	class C extends A {
		
	void show() {
		System.out.println("Inside C "); 
	}
}


public class DynamicMethodDispatch {
	public static void main(String[] args) {
		
		A obj = new B();   // Runtime Polymorphism
		
		obj.show();
		
		obj = new C();
		
		obj.show();
		
		
		

}
	
}
