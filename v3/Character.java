//Team Gerbil: Susan Lin, Maggie Zhao, Victor Lin
//APCS1 pd02
//HW30 Ye Olde Role Playing Game, Improved
//2017-11-10

public class Character{
    public static int HP;
    private static int strength;
    public static int defense;
    public static double attack;

    public boolean isAlive(){
	return HP > 0;
    }

    public int getDefense(){
	return defense;
    }

    public void lowerHP(int damage){
	HP -= damage;
    }

    public int attack(Character x){
	int pain = (int)(strength * attack) - x.getDefense();
	x.lowerHP(pain);
	return pain;
    }

}
