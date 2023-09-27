// 9/20/23
public class Enemy {
  private double hp = 25.0;
  private int dmg = 2;
  
  public int atk() { 
    System.out.println("Enemy attacks!");
    return dmg;
  }
  
  public void block(int ovrdmg) {
    hp -= ovrdmg;
    System.out.println("HP: " + hp);
  }
  
  public double hpLeft() {
    return hp;
  }
  
  public int dmgPOW() {
    return dmg;
  }
}
  
  
    
    
  

    
