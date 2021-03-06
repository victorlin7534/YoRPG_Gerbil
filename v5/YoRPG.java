/**********************************************
 * class YoRPG -- Driver file for Ye Olde Role Playing Game.
 * Simulates monster encounters of a wandering adventurer.
 * Required classes: Protagonist, Monster
 **********************************************/


import java.io.*;
import java.util.*;

public class YoRPG
{
  // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~

  //change this constant to set number of encounters in a game
  public final static int MAX_ENCOUNTERS = 10;

  //each round, a Protagonist and a Monster will be instantiated...
  private Protagonist pat;   //Is it man or woman?
  private Monster smaug; //Friendly generic monster name?

  private int moveCount;
  private boolean gameOver;
  private int difficulty;
  private int playerType;
    
  private InputStreamReader isr;
  private BufferedReader in;
  
  private boolean bossthere = false;
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // ~~~~~~~~~~ DEFAULT CONSTRUCTOR ~~~~~~~~~~~
  public YoRPG()
  {
    moveCount = 0;
    gameOver = false;
    isr = new InputStreamReader( System.in );
    in = new BufferedReader( isr );
    newGame();
  }
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // ~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~~~~~

  /*=============================================
    void newGame() -- gathers info to begin a new game
    pre:  
    post: according to user input, modifies instance var for difficulty 
    and instantiates a Protagonist
    =============================================*/
  public void newGame()
  {
    String s;
    String name = "";
    s = "~~~ Welcome to Ye Olde RPG! ~~~\n";

    s += "\nChoose your difficulty: \n";
    s += "\t1: Easy\n";
    s += "\t2: Not so easy\n";
    s += "\t3: Beowulf hath nothing on me. Bring it on.\n";
    s += "Selection: ";
    System.out.print( s );

    try {
	    difficulty = Integer.parseInt( in.readLine() );
    }
    catch ( IOException e ) { }

    s = "Intrepid protagonist, what doth thy call thyself? (State your name): ";
    System.out.print( s );

    try {
	    name = in.readLine();
    }
    catch ( IOException e ) { }

    // Character initialization
    s = name + ", what would you like to be?";
    s += "\n\t 1- Healer";
    s += "\n\t 2- Dryad";
    s += "\n\t 3- Warrior";

    System.out.println(s);

    
    try {
	playerType = Integer.parseInt( in.readLine() );
    }
    catch ( IOException e ) { }

    
    if (playerType == 1) {
		pat = new Healer ( name );
		System.out.println("\tYou've selected the healer");
		System.out.println("==============Class stats================");
		System.out.println(pat.about());
		System.out.println("=========================================");
    }
    else if (playerType == 2) {
		pat = new Dryad ( name );
		System.out.println("\tYou've selected the dryad");
		System.out.println("==============Class stats================");
		System.out.println(pat.about());
		System.out.println("=========================================");
    }
    else if (playerType == 3) {
		pat = new Warrior ( name );
		System.out.println("\tYou've selected the warrior");
		System.out.println("==============Class stats================");		
		System.out.println(pat.about());
		System.out.println("=========================================");
    }
   
    
    //instantiate the player's character
    // pat = new playerType( name );

  }//end newGame()


  /*=============================================
    boolean playTurn -- simulates a round of combat
    pre:  Protagonist pat has been initialized
    post: Returns true if player wins (monster dies).
    Returns false if monster wins (player dies).
    =============================================*/
  public boolean playTurn()
  {
    int i = 1;
    int d1, d2;

    if ( Math.random() >= ( difficulty / 3.0 ) )
	    System.out.println( "\nNothing to see here. Move along!" );
    else {
	    System.out.println( "\nLo, yonder monster approacheth!" );
		if(bossthere){
			smaug = new Finalboss();
			System.out.println("\tYou have encountered the final boss");
		}
		else{
			//generates a random monster
			int monsters = ((int)(Math.random() * 2)) + 1;
			if (monsters == 1){
				smaug = new Troll();
				System.out.println("\tYou have encountered a Troll");
			}
			if (monsters == 2){
				smaug = new Cyclops();
				System.out.println("\tYou have encountered a Cyclops");
			}
			if (monsters == 3){
				smaug = new Hydra();
				System.out.println("\tYou have encountered a Hydra");
			}
		}

	    while( smaug.isAlive() && pat.isAlive() ) {

        // Give user the option of using a special attack:
        // If you land a hit, you incur greater damage,
        // ...but if you get hit, you take more damage.
        try {
          System.out.println( "\nDo you feel lucky?" );
          System.out.println( "\t1: Nay.\n\t2: Aye!\n\t3: Talk!@%$#");
          i = Integer.parseInt( in.readLine() );
        }
        catch ( IOException e ) { }

        if ( i == 1 ){
          pat.normalize();
		}
        else if (i == 2){
          pat.specialize();
		}
		else if (i == 3){
			System.out.println("Type in what you want to yell: ");
			try{
				String x = in.readLine();
				System.out.println("\t======chat======");
				System.out.println(x);
				System.out.println("================");
			}
			catch(IOException e) {}
		}

        d1 = pat.attack( smaug );
        d2 = smaug.attack( pat );

        System.out.println( "\n" + pat.getName() + " dealt " + d1 +
                            " points of damage.");

        System.out.println( "\n" + "Ye Olde Monster smacked " + pat.getName() +
                            " for " + d2 + " points of damage.");
	    }//end while

	    //option 1: you & the monster perish
	    if ( !smaug.isAlive() && !pat.isAlive() ) {
        System.out.println( "'Twas an epic battle, to be sure... " + 
                            "You cut ye olde monster down, but " +
                            "with its dying breath ye olde monster. " +
                            "laid a fatal blow upon thy skull." );
        return false;
	    }
	    //option 2: you slay the beast
	    else if ( !smaug.isAlive() ) {
        System.out.println( "HuzzaaH! Ye olde monster hath been slain!" );
	pat.addMoneys(); 
        return true;
	    }
	    //option 3: the beast slays you
	    else if ( !pat.isAlive() ) {
        System.out.println( "Ye olde self hath expired. You got dead." );
	if (pat.getMoneys() > 0) {
	    pat.loseMoneys();
		pat.HP = 400;
	    System.out.println("But you gots moneys so now you is not dead. now you is only poorer"); 
	    return true;
	} 
        return false;
	    }
    }//end else

    return true;
  }//end playTurn()
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  public static void main( String[] args )
  {
    //As usual, move the begin-comment bar down as you progressively 
    //test each new bit of functionality...

   // ================================================
    //loading...
    YoRPG game = new YoRPG();

    int encounters = 0;

    while( encounters <= MAX_ENCOUNTERS ) {
		if ( game.playTurn() ){
			encounters++;
			if(encounters == MAX_ENCOUNTERS){
				game.bossthere = true;
			}
		}else{
			break;
		}
    }

    System.out.println( "Thy game doth be over." );
	  //================================================
  }//end main

}//end class YoRPG


