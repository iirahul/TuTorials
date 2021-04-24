package ArrayDemo;

public class JaggedAr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int d[][]= {
				{1,2,3},
				{4,5,6,4,5},
				{7,8,9,3,4,5,6,3,4,5,6,7,9},
		};
		
		for(int i=0;i<d.length;i++) {			 // d.lenght will give you number of rows which is 3
			for(int j=0;j<d[i].length;j++) {	 // d[i].length will give you number of elements(COLOMS) which is in that row.
				System.out.print( " " +d[i][j]);
			}
			System.out.println(" ");
		}
		

	}

}
