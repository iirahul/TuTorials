package StaticDemo;

public class StaticDemo {
	
	int salary;
	int eid ;
	static String ceo;
	public StaticDemo() {
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
		StaticDemo.ceo = "Harish";
		
		rahul.show();
		naveen.show();
		
		
		

	}

}
