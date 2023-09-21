import java.util.Scanner;
import java.util.Random;
public class Main
{
  public static void main(String[]args)
  {
    System.out.println("Welcome Explorer to Dungeon Quest!");
    System.out.println("What is your name?");
    {
    Scanner myname = new Scanner(System.in);
    System.out.println("Enter you name");
    
    String name = myname.nextLine();
    System.out.println("Good luck on your travels, " + name);
    }
  }
}
    