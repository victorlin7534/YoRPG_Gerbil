//Team Gerbil: Susan Lin, Maggie Zhao, Victor Lin
//APCS1 pd02
//HW30 Ye Olde Role Playing Game, Improved
//2017-11-10

public abstract class Protagonist extends Character{
    protected String name;
    protected int currency; 


    //CONSTRUCTORS
    public Protagonist(){
	HP = 400;
	strength = 45;
	defense = 25;
	attack = 1;
	currency = 0; 
    }

    public Protagonist(String input) {
	this();
	name = input;
    }

    
    public String getName(){
	return name;
    }

    public int getMoneys() {
	return currency; 
    }

    public void addMoneys() {
	currency += 100; 
    }
    public void loseMoneys() {
	if (currency >= 0 && currency <= 100)
	    {currency -= currency;} 
	else if (currency > 100)
	    {currency -= 100;} 
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
