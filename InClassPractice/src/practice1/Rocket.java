package practice1;
// Anna Koblova
//id: 202591729
public class Rocket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		top();
		body();
		wall();
		body();
		top();
	}

	public static void top() {
		System.out.println("   /|\\");
		System.out.println("  / | \\");
		System.out.println(" /  |  \\");
	}
	
	public static void body() {
		System.out.println("+-------+");
		System.out.println("|       |");
		System.out.println("|       |");
		System.out.println("+-------+");
	}
	
	public static void wall() {
		System.out.println("|  969  |");
	}
}
