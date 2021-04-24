package ArrayDemo;

public class AdvForloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int d[][]= {
				{1,2,3},
				{4,5,6,4,5,7},
				{7,8,9,3,4,5,6,7,9},
		};
		
		for (int k[]: d) {  //advance for loop for one dimentional Array || 1st  Array will assign to k
			
			for(int l :k) {  //each value of single Array will assign to l 1 by 1
				System.out.print(" " +l);
			}
			
			System.out.println(" ");
			
			
		}

	}

}
