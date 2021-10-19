class Weapon{  
  int damageValue;
  public void attack(){
    System.out.println("This is a damage message. You sure showed them. " + damageValue + damageValue + " damage.");

  }
 }
 
// So damage Values might be irrelevant, however I am leaving it in so we could potentially expand this later
 class Knife extends Weapon {
  private int damageValue = 200;
  private int weapon_armorValue = 1;
  public void attack(){

    // Find a way to make this work, likely forgot the armorValue idea, and make it check a name instead?
    }
  }
  class Rifle extends Weapon {
  private int damageValue = 200;
  private int weapon_armorValue = 2;
 }
 class Grenade extends Weapon {
  private int damageValue = 200;
  private int weapon_armorValue = 3;
 }
  




