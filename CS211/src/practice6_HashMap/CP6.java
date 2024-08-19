package practice6_HashMap;

import java.util.*;

public class CP6 {

	public static void main(String[] args) {
		
		HashMap<String, Member> members = new HashMap<>();
		
		Scanner input = new Scanner (System.in);
		
		while (true) {
			System.out.println("Select 1, 2, or 3 \n1)add \n2)remove \n3)quit");
			String ans = input.next();
			
			if (ans.equals("1")) {
				add(input, members);
				printMembers(members);
			}
			
			else if (ans.equals("2")) {	
				remove(input, members);
				printMembers(members);
			}
			
			else if (ans.equals("3")) {
				System.out.println("Bye!");
				break;
			}
			
			else {
				System.out.println("Please input 1, 2, or 3\n");
			}
		}
		
		input.close();

	}
	
	public static void add(Scanner input, HashMap<String, Member> members) {
		
		System.out.print("Please input id: ");
		String id = input.next();
		System.out.print("Please input name: ");
		String name = input.next();
		int age = 0;
		
		while (true) {
			System.out.print("Please input age: ");
			String stringAge = input.next();
			
			try {
				age = Integer.parseInt(stringAge);
				
			} catch (NumberFormatException e){
				System.out.println("Please input an integer ");
				continue;
			}
			
			break;
		}
		
		members.put(id, new Member(name, age));
		
		System.out.println(id + " added successfully \n");
		
	}
	
	public static void remove(Scanner input, HashMap<String, Member> members) {
		
		String id = null;
		
		System.out.print("Input ID to be removed: ");
		id = input.next();
		
		if (members.containsKey(id)) {
			members.remove(id);
			System.out.println(id + " successfully removed! \n");
		}
		
		else {
			System.out.println("Can't find " + id + "\n");
		}
		
	}
	
	public static void printMembers(HashMap<String, Member> members) {
		
		System.out.println("Current Members: " + members.size());
		
		for (String i : members.keySet()) {
			System.out.println("id: " + i + " name: " + members.get(i).getName() + " age: " + members.get(i).getAge());
		}
		
		System.out.println();
		
	}

}
