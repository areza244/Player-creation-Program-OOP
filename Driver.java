/*
Author: Amirreza Pazira
Program: Player creation Program (Object-Oriented Programming)
Features: Creating new players - Displays the player's health and name - Can modify the player's health and name
Limitations: Only information you can access and change is the health and name
Version: 28-Jan-2021
*/
public class Driver{ // Driver class to start creating players
	public static void main(String[] args) { 
		Adventurer player1; // Declaring a reference to 'Adventurer' 
		player1 = new Adventurer(); // Instantiate an Adventurer object called player1
		System.out.println("Health: " + player1.getHealth()); // Print default health
		System.out.println("Name: " + player1.getName()); // Print default name
		player1.setName("Balin"); // Set a new name by calling mutator method
		player1.setHealth(10); // Set a new health value by calling mutator method
		player1.gainLevel(); // Calling the gainLevel method to add 5 health
		System.out.println("Health: " + player1.getHealth()); // Print new health
		System.out.println("Name: " + player1.getName()); // Print new name
	}
}
