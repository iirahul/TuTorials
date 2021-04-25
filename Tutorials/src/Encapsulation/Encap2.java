package Encapsulation;

public class Encap2 {
	
	private int rollno;   // we made it private here
	private String name;  // we made it private here
	

	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encap2 obj = new Encap2();
		 obj.setRollno(20000329);
		 obj.setName("Rahul");
		 System.out.println(obj.getRollno());
		System.out.println(obj.getName());
		
	}

}
