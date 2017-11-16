# YoRPG_Gerbil
APCS1 pd02
Victor Lin, Susan Lin, Maggie Zhao

## Agenda
	- special moves
	- different monsters
	- rebalancing monsters/characters
	- chat
	- final boss
	- currency for respawning/shop

## YoRPG Class
 * Driver file for Ye Olde Role Playing Game, courtesy of Mr. Brown
 * Simulates monster encounters of a wandering adventurer.
 * Monster and Protagonist classes **needed**.
 * newGame()
 * playTurn()
 
## Character Superclass 
    - highest superclass, inst vars and methods found here can be used in all subclasses
 * protected instance variables (int HP, int strength, int defense, float attack)
 * isAlive() method- checks if the remaining HP is above 0
 * getDefense() accessor- returns the defense variable for use outside of the Character class
 * lowerHP() method- lowers HP by however much damage is taken
 * attack() method- general attack algorithm; the damage done is equal to the product of strength and attack, minus the opponenet's defense

  #### Monster Subclass
   * initialized inst vars for all Monsters, with randomized strength (20, 65)
   * attack() method- same as the one in Character.java, but targeting a Protagonist
   * Monsters appear randomly
  ###### Cyclops (Monster Subclass)
   * Increased attack and strength
   * about() method:
    * **Lore:** The Cyclops are a mystical creature, born of Poseidon. Although they have one eye less than most, they make up for it with their immense power. The pits of Hades have only hardened their resolve.
   ###### Troll (Monster Subclass)
   * Increased HP
   * about() method:
    * **Lore:** Every player's nightmare, the troll hides under the bridge, waiting for a billy goat to clop over. His high hitpoints make him impossible to beat. Best of luck if you happen to meet him!
   ###### Hydra (Monster Subclass)
   * Increased defense
   * about() method: 
    * **Lore:** The Hydra, with its many heads and tough scales, has been an insurmountable obstacle for many. Having only been defeated by Hercules, the Hydra are on the prowl for their next meal.
   ###### Finalboss (Monster Subclass)
   * Increased attack, strength, defense, and HP
   * about() method:
	* **Lore:** ???????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????
          
  #### Protagonist Subclass
  * default constructor- initializes primitive inst vars
  * overloaded constructor- uses this() and takes a String input for the name
  * getName() accessor- returns the name of the Protagonist
  * specialize() method- halves the defense and doubles the attack, buffing (or debuffing?) the protagonist
  * normalize() method- returns the specialized stats to normal     
  ###### Healer
  * Increased HP
  * specialize() method:
	* **Heal:** heals the character for 50 HP
  * about() method:
    * **Lore:** The Healer channels her inner energy in order to help her companions survive. Enjoy an increased health boost for longetivity, as well as the ability to heal her teammates! (Don't tell her that her skill has not been unlocked, though.
  ###### Dryad
  * Increased defense
  * specialize() method:
	* **increase defense:** increases defense by 15
  * about() method:
    * **Lore:** The Dryad invokes the power of nature to infuse her skin with the toughened elements of the trees around her. Her defense is naturally increased with bark armor, and her AOE boosts the defense of her companions.
  ###### Warrior
  * Increased strength and attack
  * specialize() method:
	* **increase attack:** increases damage dealt
  * about() method:
     * **Lore:** The Warrior hails from the harshest Siberian frostlands, where his great power has made him a legend among his townspeople. When enraged, he utilizes his increased strength and attack for the greater good.

## Instructions
	** Assuming you have compiled the code and are currently running the class
	1) Choose your difficulty(difficulty increases with increasing order):	
			1 - Easy 
			2 - Not so easy
			3 - Beowulf hath nothing on me. Bring it on.
	2) Enter your desired name for the protagonist. (e.g. Joe)
	3) Choose your class(see class description for more details):
			1 - Healer
			2 - Dryad
			3 - Warrior
		You will see the lore of the class you have chosen.
	4) You will proceed to encounter a monster and are given a selection of moves:
			1 - Nay. (attack normally)
			2 - Aye! (use special ability)
			3 - Talk** (prompts user for text which will be printed in chat box)
	5) If 1 or 2 were chosen in the previous step, the interface will display the damage dealt by your character as well as the appropriate attack description. The damage dealt by the monster is also displayed
	6) Repeats steps 4 and 5 until either entity has died. If you die, the game is over, otherwise the game moves on to a different monster. 
	** Monsters drop currency which you can use to buy weapons in the shop. (back to step 6)
	** If protagonist has enough currency, he/she is automatically revived at the cost of currency. (back to step 6)
	** The game ends after you have defeated the final boss
