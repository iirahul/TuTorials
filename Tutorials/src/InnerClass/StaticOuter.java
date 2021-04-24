package InnerClass;

public class StaticOuter {
	

		
		int abc;   										// 1.Veriables
		int xyz;
		
		
		public void display() { 							//2.Methods
			System.out.println("Inside outer class");
		}
		
		
		static class Inner {									// 3.Class
			
			public void show () {
				System.out.print("Inside Inner class");
			}
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        StaticOuter obj = new StaticOuter();
		
		obj.display();
		
		Inner obj1 = new Inner();
		
		obj1.show();
		
		

	}


}
