public class Healer extends Protagonist {

    public Healer(String input){
	HP =  500;
	name = input;
    } 
	
    public String about() {
	String description;
	description = "The Healer channels her inner energy in order to help her companions survive. Enjoy an increased health boost for longetivity, as well as the ability to heal her teammates! (Don't tell her that her skill has not been unlocked, though.)";

	return description;
    }

    //heal
    public void specialize(){
		if(HP < 450){
			HP += 50;
			System.out.println("\tYou have healed yourself 50 HP");
		}
		else if(HP < 500){
			HP = 500;
			System.out.println("\tYou have healed yourself to max health");
		}
	}
    
    //resets stats
    public void normalize(){
	defense = 25;
	attack = 2;
    }
}

