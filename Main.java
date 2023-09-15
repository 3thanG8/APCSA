public class Main
{
  public static void main(String[] args)
  {
    System.out.println("Hello, world");
    System.out.println("I am Ethan");
  
    int Health;
    Health = 20;
    System.out.println("HP:" + Health);
    
    double Damage = 2.5;
    System.out.println("DMG:" + Damage);
    
    final boolean Hazards = true;
    System.out.println("Hazards:" + Hazards);
    
    double buff = Damage + 0.25;
    System.out.println("Buffed DMG:" + buff);
    
    double debuff = 0.35;
    System.out.println("Debuffed DMG:" + (Damage - debuff));
    
    double onFireDMG = Health * 0.02;
    System.out.println("Health after Burn:" +(Health - onFireDMG));
    
    try 
    {
      System.out.println(1/0);
    }
    catch(ArithmeticException e)
    {
      System.out.println(e);
    }
  }
}
