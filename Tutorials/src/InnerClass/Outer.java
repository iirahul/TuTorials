package InnerClass;

public class Outer {
		
		int abc;   // 1.Veriables
		int xyz;
		
		
		public void show() { 							//2.Methods
			System.out.println("Inside outer class");
		}
		
		
		
		class Inner {						// 3.Class
			
			public void show () {
				System.out.print("Inside Inner class");
			}
		}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer obj = new Outer();
		
		obj.show();
		
		Inner obj1 =obj.new Inner();     // We need object of outer class to define new inner class object.
		
		obj1.show();
		

	}

}
