# YoRPG_Gerbil
APCS1 pd02
Victor Lin, Susan Lin, Maggie Zhao
## YoRPG Class
 [x] Driver file for Ye Olde Role Playing Game, courtesy of Mr. Brown
 [x] Simulates monster encounters of a wandering adventurer.
 [x] Monster and Protagonist classes **needed**.
 [x] newGame()
 [x] playTurn()
 
## Character Superclass 
    - highest superclass, inst vars and methods found here can be used in all subclasses
 [x] protected instance variables (int HP, int strength, int defense, float attack)
 [x] isAlive() method- checks if the remaining HP is above 0
 [x] getDefense() accessor- returns the defense variable for use outside of the Character class
 [x] lowerHP() method- lowers HP by however much damage is taken
 [x] attack() method- general attack algorithm; the damage done is equal to the product of strength and attack, minus the opponenet's defense

  #### Monster Subclass
   [x] initialized inst vars for all Monsters, with randomized strength [20, 65)
   [x] attack() method- same as the one in Character.java, but targeting a Protagonist
      ###### Cyclops (Monster Subclass)
       [x] Increased attack and strength
       [x] about() method:
          [x] **Lore:** The Cyclops are a mystical creature, born of Poseidon. Although they have one eye less than most, they make up for it with their immense power. The pits of Hades have only hardened their resolve.
      ###### Troll (Monster Subclass)
       [x] Increased HP
       [x] about() method:
          [x] **Lore:** Every player's nightmare, the troll hides under the bridge, waiting for a billy goat to clop over. His high hitpoints make him impossible to beat. Best of luck if you happen to meet him!
      ###### Hydra (Monster Subclass)
       [x] Increased defense
       [x] about() method: 
          [x] **Lore:** The Hydra, with its many heads and tough scales, has been an insurmountable obstacle for many. Having only been defeated by Hercules, the Hydra are on the prowl for their next meal.
          
          
  #### Protagonist Subclass
  [x] default constructor- initializes primitive inst vars
  [x] overloaded constructor- uses this() and takes a String input for the name
  [x] getName() accessor- returns the name of the Protagonist
  [x] specialize() method- halves the defense and doubles the attack, buffing (or debuffing?) the protagonist
  [x] normalize() method- returns the specialized stats to normal     
      ###### Healer
       [x] Increased HP
       [x] about() method:
          [x] **Lore:** The Healer channels her inner energy in order to help her companions survive. Enjoy an increased health boost for longetivity, as well as the ability to heal her teammates! (Don't tell her that her skill has not been unlocked, though.
      ###### Dryad
       [x] Increased defense
       [x] about() method:
          [x] **Lore:** The Dryad invokes the power of nature to infuse her skin with the toughened elements of the trees around her. Her defense is naturally increased with bark armor, and her AOE boosts the defense of her companions.
      ###### Warrior
       [x] Increased strength and attack
       [x] about() method:
          [x] **Lore:** The Warrior hails from the harshest Siberian frostlands, where his great power has made him a legend among his townspeople. When enraged, he utilizes his increased strength and attack for the greater good.
