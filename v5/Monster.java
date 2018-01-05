//Team Gerbil: Susan Lin, Maggie Zhao, Victor Lin
//APCS1 pd02
//HW30 Ye Olde Role Playing Game, Improved
//2017-11-10

public class Monster extends Character{
	
    public Monster(){
	strength = (int)((Math.random() * (45)) + 20);
	HP = 1500;
	defense = 20;
	attack = 1.0;
    }

    //calculates damage dealt
    //parameter: protagonist object
    public int attack(Protagonist x){
	int pain = (int)((strength * attack) - x.defense);

	if (pain < 0)
	    pain = 0;

	x.lowerHP(pain);
	return pain;
    }
}
