package Varargs;

public class VarArgs {
	
	public int add(int...n) {  // we can add any number of argumens as per our convinience.
		int sum=0;
		
		for(int i  : n) {
			sum=sum+i;
		}
		return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VarArgs obj =new VarArgs();
		
		int y = obj.add(1,2,3,4,4,4,5);
		System.out.print(" " +y);

	}

}
