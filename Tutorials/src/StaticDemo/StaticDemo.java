package StaticDemo;

public class StaticDemo {
	/*
	 1) If you make veriable static it will be same for all the objects.
	 2)Static keyword  loads class/Static keyword  in class loader memory 
	 3) To access static veriable we dont need access.
	 4) You can also make a method static.
	*/
	
	int salary; // This is object specifict verialble, This is inside heap memory.
	int eid ;
	static String ceo;  //Static keyword  loads class/Static keyword  in class loader memory .
	
	static               // s is small. Static block no parenthesis.  This is when you load a class.
	{
		ceo="Ramesh";
	}
	public StaticDemo()    // when you create an object
	{ 
		salary=5000;
		eid=1;
		
	}
	
	
	public void show() {
		System.out.println(eid+" ; " +salary+" ; " +ceo);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticDemo rahul = new StaticDemo();
		StaticDemo naveen = new StaticDemo();
		
		
		rahul.eid = 2233;
		rahul.salary = 100000;
		/*
		StaticDemo.ceo = "Harish"; //we can use class name insted of object name , it will work ----CODE
		*/
		rahul.show();
		naveen.show();
		
		
		

	}

}
