package bonusPractice6;

public class Child extends Parent {
	int num = 2;
	
	public void output() {
		System.out.println("this.num= " + this.num);
		System.out.println("super.num " + super.num);
	}
}
