/* 
 * CS211 Practice 5 (HashSet)
 * Anna Koblova - anna.koblova@bellevuecollege.edu
 * Student ID: 202591729
 * 2023.04.21 - Spring Quarter
 *
 * This program finds the students who have taken at least one CS class,
 * all CS classes, only CS210 class, CS211 without taking CS210 class,
 * and all CS classes except CS212 class
 */

package practice5_HashSet;

import java.util.*;

public class Practice5_HashSet {

	static HashSet<String> CS210 = new HashSet<String>();
    static HashSet<String> CS211 = new HashSet<String>();
    static HashSet<String> CS212 = new HashSet<String>();
	
	public static void Initialize() {
        CS210.add("Bill"); CS210.add("Eva"); CS210.add("Olivia");
        CS211.add("Eva"); CS211.add("Olivia"); CS211.add("Kim");   
        CS212.add("Chloe"); CS212.add("Jane"); CS212.add("Olivia"); CS212.add("Bill");    
    }
    
    public static void atLeastOneClass() {
    	HashSet<String> temp = new HashSet<>(CS210);
    	temp.addAll(CS211);
    	temp.addAll(CS212);
    	System.out.println("At least one class: " + temp);
    }
    
    public static void allClasses() {
    	HashSet<String> temp = new HashSet<>(CS210);
    	temp.retainAll(CS211);
    	temp.retainAll(CS212);
    	System.out.println("CS 210 and CS 211 and CS 212: " + temp);
    }

    public static void onlyCS210() {
    	HashSet<String> temp = new HashSet<>(CS210);
    	temp.removeAll(CS211);
    	temp.removeAll(CS212);
    	System.out.println("CS210 only: " + temp);
    }

    public static void violation() {
    	HashSet<String> temp = new HashSet<>(CS211);
    	temp.removeAll(CS210);
    	System.out.println("CS211 without taking CS 210: " + temp);
    }
    
    public static void CS210andCS211notCS212Classes() {
    	HashSet<String> temp = new HashSet<>(CS210);
    	temp.addAll(CS210);
    	temp.removeAll(CS212);
    	System.out.println("CS 210 and CS 211 but not CS 212: " + temp);
    }
    
    public static void main(String[] args) {
		Initialize();
        atLeastOneClass();
        allClasses();
        onlyCS210();
        violation();
        CS210andCS211notCS212Classes();
	}
}
