//Team Gerbil: Susan Lin, Maggie Zhao, Victor Lin
//APCS1 pd02
//HW30 Ye Olde Role Playing Game, Improved
//2017-11-10

public abstract class Protagonist extends Character{
    protected String name;


    //CONSTRUCTORS
    public Protagonist(){
	HP = 400;
	strength = 45;
	defense = 25;
	attack = 2;
    }

    public Protagonist(String input) {
	this();
	name = input;
    }

    
    public String getName(){
	return name;
    }
    
    // Attack Method
    public int attack(Monster x){
        int pain = (int)((strength * attack) - x.getDefense());

	if (pain < 0) {
	    pain = 0;
	}
	
        x.lowerHP(pain);
        return pain;
    }

    public abstract String about();
    public abstract void normalize();
    public abstract void specialize();
    
    /*changes stats
    public void specialize(){
	defense /= 2;
	attack *= 2;
    }
    
    //resets stats
    public void normalize(){
	defense = 25;
	attack = 2;
    }
    */
    
}
