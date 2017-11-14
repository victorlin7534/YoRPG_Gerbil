//Team Gerbil: Susan Lin, Maggie Zhao, Victor Lin
//APCS1 pd02
//HW30 Ye Olde Role Playing Game, Improved
//2017-11-10

public class Character{
    protected static int HP;
    protected static int strength;
    protected static int defense;
    protected static double attack;

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
    
    public String toString() {
        String s = "";
        
        s += "hitpoints: " + HP;
        s += "strength: " + strength;
	s += "defense: " + defense;
        s += "attack: " + attack;
        return s;
    } //end toString                                                            

}
