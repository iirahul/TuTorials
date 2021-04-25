package Encapsulation;

public class Encapsulation {
	
	 int rollNO;
	
	public void setRollno(int i) {    // Setter method is void no Return
		 rollNO =i;
	}
	
	public int  getRollno() {          // Getter method is not  void it will return  Return
		return rollNO;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encapsulation obj = new Encapsulation();
		 
		  obj.setRollno(777);
			
			System.out.println(obj.getRollno());
		

	}

}
