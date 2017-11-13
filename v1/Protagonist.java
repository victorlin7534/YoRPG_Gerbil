//Team gerbil: Susan Lin, Victor Lin, Maggie Zhao
//APCS1 pd02
//HW27 Ye Olde Role Playing Game
//2017-11-09

public class Protagonist{
	private static String name;
	public static int hitpoints;
	private static int strength;
	public static int defense;
	private static double attack;
	
	public Protagonist(String input){
		name = input;
		hitpoints = 400;
		strength = 45;
		defense = 25;
		attack = 2;
	}
	
	//returns true if hp > 0, false otherwise
	public boolean isAlive(){
		return hitpoints > 0;
	}
	//defense accessor
	public int getDefense(){
		return defense;
	}
	//name accessor
	public String getName(){
		return name;
	}
	//lowers hitpoints instance variable
	//paramter: integer damage
	public void lowerHP(int damage){
		hitpoints -= damage;
	}
	//calculates damage dealt
	//parameter: monster object
	public int attack(Monster x){
		int pain = (int)(strength * attack) - x.defense;
		x.lowerHP(pain);
		return pain;
	}
	//changes stats
	public void specialize(){
		defense /= 2;
		attack *= 2;
	}
	//resets stats
	public void normalize(){
		defense = 25;
		attack = 2;
	}
}