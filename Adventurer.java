/*
Author: Amirreza Pazira
Program: Player creation Program (Obejct-Oriented Programming)
Features: Creating new players - Displays the player's health and name - Can modify the player's health and name
Limitations: Only information you can access and change is the health and name
Version: 28-Jan-2021
*/
public class Adventurer // Creating  Adventurer class to store and get player's info 
{
    // two private variables for health and name
    private int health;
    private String name;
    public Adventurer(){ // Creating constructor for default values 
        health = -1;
        name = "nameless";
    }
    public void gainLevel(){ // gainLevel method to add 5 health to player
        System.out.println("Congratulations!");
        health = health + 5;
    }
    public int getHealth(){ // An accessor method for getting the health
        return health;
    }
    public String getName(){ // An accessor method for getting the name
        return name;
    }
    public void setHealth(int newhealth){ // A mutator method to set a new health value
        health = newhealth;
    }
    public void setName(String newname){ // A mutator method to set a new name
        name = newname;
    }
}