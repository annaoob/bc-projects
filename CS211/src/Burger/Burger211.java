package Burger;

import java.util.HashMap;

public abstract class Burger211 {
	
	private static HashMap<Integer, BurgerInfo> burger = new HashMap<>();

	Burger211() {

		burger.put(1, new BurgerInfo("Inheritance Burger", 4.5, "beef patty, tomato, onion, black olive, ranch sauce"));
		burger.put(2, new BurgerInfo("@Override Burger", 5.5, "beef patty, lime, onion, lettuce, tomato sauce"));
		burger.put(3, new BurgerInfo("Polymorphism Burger", 6.5, "chicken breast, gallo, onion, ranch sauce"));
	}

	abstract void printMenu();

	// getter method for hashMap
	public static HashMap<Integer, BurgerInfo> getBurger() {
		return burger;
	}

	// getter methods for values within HashMap

	public String getName(int key) {
		return burger.get(key).name;
	}

	public double getPrice(int key) {
		return burger.get(key).price;
	}

	public String getTopping(int key) {
		return burger.get(key).topping;
	}

	public int getHowManyBurgers() {
		return burger.size();
	}

}
