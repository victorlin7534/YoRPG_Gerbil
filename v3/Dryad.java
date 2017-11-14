public class Dryad extends Protagonist {

    public Dryad(String input){
	defense = 35;
	name = input;
	
    } 
    public static String about(){
	String description;
	description = "The Dryad invokes the power of nature to infuse her skin with the toughened elements of the trees around her. Her defense is naturally increased with bark armor, and her AOE boosts the defense of her companions.";

	return description;

    }
    public void specialize(){
	defense /= 2;
	attack *= 2;
    }
    
    public void normalize(){
	defense = 35;
	attack = 2;
    }

}
