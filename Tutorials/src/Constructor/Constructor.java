package Constructor;

public class Constructor {
	int num1;
	int num2;
	public Constructor() {
		
		System.out.println("Inside default  Construct");
		
		
	}
	public Constructor(int i) {
		i++;
		System.out.println("Inside 2nd Construct");
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructor obj = new Constructor(1);
		
	
		
		

	}

}
