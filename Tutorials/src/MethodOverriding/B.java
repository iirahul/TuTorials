package MethodOverriding;

public class B extends A{
	@Override                     //cut paste and run the program
	public void show() {          // here show  method inside B will display because it is overriding A.    
								// change show to show1 and run the program.  
		//super.show();			// 									
		System.out.print("inside B");
	}


}
