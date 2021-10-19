// Doesn't really utilize Classes, as I just wanted something that functions
import java.util.Scanner;
import java.lang.Math;
class Main {
  public static void main(String[] args) {
  // define the variables
  int weaponChoice;
  String enemyName;
  int successes = 0;
  int failures = 0;
  boolean running = true;

// make the objects
    Scanner scan = new Scanner(System.in);
    Knife knife = new Knife();
    Rifle rifle = new Rifle();



// Basic Information to print
  System.out.println("Henry lived in his house with his parents and his older brother. One day Henry decided to go play in the woods behind his house, he saw many creatures like squirrels, rabbits, and a bear. He did not see an adult bear, just a baby but he decided to get away from it as fast as possible to avoid its parents showing up. As Henry wandered deeper into the forest he felt like he was being watched, the presence had a malicious feel to it. Henry tried to assure himself he was just being paranoid, but the feeling got stronger and stronger the further he went in the forest. At last he could not take it anymore and ran trying to escape the thing that was watching him. He ran until he could not take it anymore, he stopped and sat on the ground. He no longer felt like he was being watched but he had a new issue. He was hungry and did not know how to get home. After what seemed like hours he finally decided to eat a mushroom on the ground because he was so hungry. After he did that he no longer felt the pain of hunger. He wandered around a while before a brown flash jumped from the trees in front of him and attached itself to his leg. He looked down and saw a crazy looking squirrel biting on his leg. He immediately pulled it off and threw it to the ground but just as he did that a dozen red eyes peeked out of the darkness and looked at him menacingly. He ran for his life, after a while he felt that he was far enough away to stop. When he looked down he saw a silver box, he pulled the lid off and saw there were 3 items inside. A knife, an automatic rifle, and several white grenades. After he was done collecting the items, he heard a squeak behind him and saw the red eyes looking back at him. He was now able to fight back and he intended to do so. The fight that insured it was an event that went down in history. It was known as the backyard massacre.");
 


 
// While loop that makes the game last until the User wins a total of 5 times



while(true){

//Stop the game on win or failure
 if(successes == 5){
   System.out.println("You win");
   running = false;
   break;

 }
 if(failures == 10){
   System.out.println("You lose");
   running = false;
  break;
 }

  System.out.println("Please select your weapon, ");
  System.out.println("1 for Knife");
  System.out.println("2 for Rifle");
  System.out.println("3 for Holy Hand Grendade.");

  weaponChoice = scan.nextInt();

// Alert the user of the Weapon that they chose
  if(weaponChoice == 1){
    System.out.println("You chose a Knife");
  }
  else if(weaponChoice == 2){
    System.out.println("You chose a Rifle");
  }
  else if(weaponChoice == 3){
    System.out.println("You chose a Holy Hand Grenade");
  }
  else if(weaponChoice <= 0 || weaponChoice >= 4){
    System.out.println("That was not 1, 2, or 3. Feel free to try again.");
    System.exit(0);
  }
  /* Randomly choose the enemy that will be encountered
  1 = Squirrel
  2 = Bear
  3 = Rabbit
  */

  int enemyType = (int)(Math.random() * 3 + 1);

  //Enemy name stuff
  if(enemyType == 1){
    enemyName = "Squirrel";
  }
  else if(enemyType == 2){
    enemyName = "Bear";
  }
  else{
    enemyName = "Rabbit";
  }


  System.out.println("You encounted a wild " + enemyName + ".");
  if(weaponChoice == enemyType){
    System.out.println("Success");
    successes = successes + 1;
  }
  else{
    System.out.println("failure");
    failures = failures + 1;
  }
  System.out.println();
}
  
System.out.println("Game is finished");
System.exit(1);

// FIND A WAY TO LET THE USER STOP THE PROGRAM

  




  }
}