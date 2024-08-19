package bonusPractice6;

public class Main {

	public static void main(String[] args) {
		Child c = new Child();
		c.output();
		
		Parent p1 = new Parent();
		p1.num=3;
		System.out.println("p1.num=" + p1.num);
		
		c.output();
		
		Parent p2 = new Parent();
		System.out.println("p2.num= " + p2.num);

	}

}
