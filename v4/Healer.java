//Team Gerbil: Susan Lin, Victor Lin, Maggie Zhao                              
//APCS1 pd02                                                                   
//HW #31: Ye Olde Role Playing Game, Expanded                                  
//2017-11-13  

public class Healer extends Protagonist {

    public Healer(String input){
	HP =  500;
	name = input;
    } 
	
    public static String about() {
	String description;
	description = "The Healer channels her inner energy in order to help her companions survive. Enjoy an increased health boost for longetivity, as well as the ability to heal her teammates! (Don't tell her that her skill has not been unlocked, though.)";

	return description;
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

