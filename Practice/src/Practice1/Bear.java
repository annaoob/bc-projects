package Practice1;

public class Bear extends Critter {
	public Bear(boolean polar) {
		System.out.println(getColor(polar));
	}
	
	public static String getColor(boolean white) {
		if (white) {
		  return "white";
		} else {
		  return "black";
		}
	}
	
}
