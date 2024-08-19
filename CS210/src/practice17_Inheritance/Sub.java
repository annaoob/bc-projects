package practice17_Inheritance;

public class Sub extends Super {

	int num = 3;
	
	public void display() {
		System.out.println(num);
		System.out.println(super.num);
		System.out.println(id);
	}
}
