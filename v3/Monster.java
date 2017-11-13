//Team Gerbil: Susan Lin, Maggie Zhao, Victor Lin
//APCS1 pd02
//HW30 Ye Olde Role Playing Game, Improved
//2017-11-10

public class Monster extends Character{
	private static String name;
	public static int hitpoints;
	private static int strength;
	public static int defense;
	private static double attack;
	
	public Monster(){
		name = "monster";
		strength = (int)(Math.random() * (45)) + 20;
		hitpoints = 150;
		defense = 20;
		attack = 1.0;
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
	//parameter: protagonist object
	public int attack(Protagonist x){
		int pain = (int)(strength * attack) - x.defense;
		x.lowerHP(pain);
		return pain;
	}
}
