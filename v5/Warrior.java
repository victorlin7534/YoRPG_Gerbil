public class Warrior extends Protagonist {

    public Warrior(String input){
	strength = 70;
	attack = 2;
	name = input;
    }

    public String about(){
	String description;
	description = "The Warrior hails from the harshest Siberian frostlands, where his great power has made him a legend among his townspeople. When enraged, he utilizes his increased strength and attack for the greater good.";

	return description;
    }

    //attacks with more force
    public void specialize(){
	defense /= 2;
	attack += 2;
	System.out.println("\tYou have strengthened your attack");
    }
    
    //resets stats
    public void normalize(){
	defense = 25;
	attack = 1.75;
    }
    
} 
