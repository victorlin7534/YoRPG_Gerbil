public class Warrior extends Protagonist {

    public Warrior(String input){
	strength = 175;
	attack = 1.75;
	name = input;
    }

    public static String about(){
	String description;
	description = "The Warrior hails from the harshest Siberian frostlands, where his great power has made him a legend among his townspeople. When enraged, he utilizes his increased strength and attack for the greater good.";

	return description;
    }
} 
