 ## Introduction


The Magical Arena game is a turn-based battle simulation where two players, Player A and Player B, engage in combat until one emerges victorious by defeating the opponent.


Any two player can fight a match in the arena. Players attack in turns. Attacking player rolls the attacking dice and the defending player rolls the defending dice. The “attack”  value multiplied by the outcome of the  attacking dice roll is the damage created by the attacker. The defender “strength” value, multiplied by the outcome of the defending dice is the damage defended by the defender. Whatever damage created by attacker which is in excess of the damage defended by the defender will reduce the “health” of the defender. Game ends when any players health reaches 0

Player with lower health attacks first at the start of a match. 

## Overview of Gameplay 

Assume two players . Player A 50 health 5 strength 10 attack Player B 100 health 10 stregnth and 5 attack . Attacking die and Defending die are both 6 sided die with values ranging from 1- 6

Player A attacks and rolls die. Die roll : 5 . Player B defends and rolls die. Die roll 2

Attack damage is 5 * 10 = 50 ; Defending strength = 10 * 2 = 20 ; Player B health reduced by 30 to 70

Player B attacks and rolls die. Die roll : 4. Player A defends and rolls die. Die Roll 3

Attack damage is 4 * 5 = 20 ; Defending strength = 5 * 3 = 15 ; Player A health reduced by 5 to 45

And so on

## HOW TO RUN AND PLAY GAME ?

1. **Compile and Run:**
   - Compile the `Main.java` file using `javac Main.java`.
   - Run the compiled program using `java Main`.

2. **Gameplay**:
   - Follow the prompts to enter attributes for Player A and Player B.
   - After each battle, you will be asked if you want to play again.
   - Enter 'Y' to play again or 'N' to exit the game.


3. **Usage**:
  - Players are instantiated with specific attributes (health, strength, and attack) when created.
  - Combat actions, such as attacking, defending, and health reduction, are performed through methods provided by the Player class.

4. **Features**:
  - Players have ability to insert values for health , strength and attack at the begining of the game to provide advantage for better survival. 
  - Randomized Abilities: Utilizes dice rolls to introduce variability and unpredictability into combat actions, enhancing gameplay dynamics.
  - Attribute-Based Combat: Employs player attributes (health, strength, attack) to determine combat outcomes, emphasizing strategic decision-making and character development.
  - Survival Mechanism: Implements a health-based survival mechanism to determine player longevity in battle, adding depth to the gameplay experience.
  - The game validates user input to ensure positive integers are entered for player attributes.
  - Invalid inputs prompt the user to re-enter the correct values.
  - Player can only enter positive integer , as the values of attributes can't be negative and a symbol.


## Test Cases

  -Test cases are included, which covers unit test cases for all the edge cases possible and have a high degree of test coverage.
  -Test cases can be run using JUNIT

