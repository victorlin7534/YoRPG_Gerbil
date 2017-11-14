public class Troll extends Monster {

    public Troll(){
	HP = 1000;
    } 
	
    public static String about() {
	String description;
	description = "Every player's nightmare, the troll hides under the bridge, waiting for a billy goat to clop over. His high hitpoints make him impossible to beat. Best of luck if you happen to meet him!";

	return description;
    }
        public void specialize(){
	defense /= 2;
	attack *= 2;
    }
    
    //resets stats
    public void normalize(){
	defense = 20
	attack = 1;
    }
} 
