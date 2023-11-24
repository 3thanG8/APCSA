// 9/8/23
//import java.util.Scanner;
//public class Main
//{
//  public static void main(String[]args)
//  {
//    int num1 = 5;
//    double num2 = 0.5;
//    System.out.println((double) num1/num2);
//    
//    System.out.println("Hello, world");
//    System.out.println("I am your computer");
//  
//    int Health;
//    Health = 20;
//    System.out.println("HP:" + Health);
//    
//    double Damage = 2.5;
//    System.out.println("DMG:" + Damage);
//    
//    final boolean Hazards = true;
//    System.out.println("Hazards:" + Hazards);
//    
//    double buff = Damage + 0.25;
//    System.out.println("Buffed DMG:" + buff);
//    
//    double debuff = 0.35;
//    System.out.println("Debuffed DMG:" + (Damage - debuff));
//    
//    double onFireDMG = Health * 0.02;
//    System.out.println("Health after Burn:" +(Health - onFireDMG));
//    
//    try 
//    {
//      System.out.println(1/0);
//    }
//    catch(ArithmeticException e)
//    {
//      System.out.println(e);
//    } 
//    
//    System.out.println("What's your name?");
//    Scanner scan = new Scanner(System.in);
//    String name = scan.nextLine();
//    System.out.println("Let's being your adventure " + name);
//    scan.close();
//   
//    Scanner number = new Scanner(System.in);
//    System.out.println("Number 1: ");
//    int number1 = number.nextInt();
//    
//    Scanner num = new Scanner(System.in);
//    System.out.println("Number 2: ");
//    int number2 = num.nextInt();
//    number.close();
//    num.close();
//    try
//    {
//      System.out.println(number1*number2/0);
//    }
//    catch(ArithmeticException a)
//    {
//      System.out.println(a);
//    }
//    int overflow = Integer.MAX_VALUE;
//    System.out.println(overflow + 1);
//    for(int i = 0;i <= 2;i++){System.out.println(i);
//    }
//  }
//}

// 9/20/23
//public class Main
//{
//  public static void main(String[] args)
//  {
//    Enemy slime = new Enemy();
//    
//    double playerHP = 100.0;
//    int playerDMG = 10;
//    
//    System.out.println("You encounter a slime!");
//    System.out.println("It has " + slime.hpLeft() + " HP");
//    System.out.println("It has " + slime.dmgPOW() + " DMG");
//    
//    playerHP -= slime.atk();
//    System.out.println("You have " + playerHP + " HP left");
//    
//    System.out.println("You fight back!");
//    System.out.print("The slime has " + (slime.hpLeft() - (double) playerDMG) + " HP left");
//  }
//}

//9/26/23
//public class Main {
//  public static void main(String[] args) {
//    Keyboard board1 = new Keyboard("steel", "blue", 115.0);
//
//   board1.getKeyboard();
//  
//    
//    Keyboard board2 = new Keyboard("steel", "red");
//   board2.getKeyboard(); 
// 9/30/23
//   Keyboard getAlt = null;
//   getAlt.getKeyboard();
//  }
//}

//10/3/23
//public class Main {
//  public static void main(String[] args) {
//    Person person = new Person("The answer to the question is: ", 1);
//    Person person2 = new Person("The answer to the question: ");
//    person.talk(3);
//    person2.talk(3, 5);
//  }
//}

//10/10/23
//public class Main {
//  public static void main(String[] args) {
//    Profile p = new Profile(17, "Ethan");
//    p.agesince2023(0);
//    p.getProfile();
//    int age = p.getAge();
//    System.out.println("Ethan's age times 2 is " + age * 2);
//  }
//}

//10/17/23
//import java.util.Scanner;
//public class Main {
//  public static void main(String[] args) {
//    System.out.println("What is your name?");
//    Scanner scan = new Scanner(System.in);
//    String name = scan.nextLine();
//    
//    System.out.println("How old are you?");
//    Scanner scan2 = new Scanner(System.in);
//    int age = scan.nextInt();
//    
//    System.out.println(name + " says:" + "\"Hi! My name is " + name + " and I am " + age + " years old\"" );
//    scan.close();
//    scan2.close();
//  }
//}

// 10/19/23
//public class Main {
//  public static void main(String[] args) {
//    Hello person = new Hello();
//    System.out.println(person + " My name is Ethan");
//    String test = new String("Hi");
//    System.out.println(test.length());
//  }
//}

// 10/30/23
//public class Main {
//  public static void main(String[] args) {
//    System.out.println((int) (Math.random() * 4 + 1)*2);
//  }
//}

// 11/1/23
//public class Main {
//  public static void main(String[] args) {
//    int a = 5;
//    int b = 6;
//    System.out.println(a <= b);
//    
//    boolean weekend = true;
//    if (weekend) {
//      System.out.println("It's the weekend!!");
//    }
//    else {
//    System.out.println("It's still the weekdays :(");
//    }
//  }
//}

// 11/9/23
//public class Main {
//  public static void main(String[] args) {
//    int b = 10 + 5;
//    if (b >= 20) System.out.println("Integer b is less than or equal to 20!");
//    else if (b == 15) System.out.println("Integer b is equal to 15");
//    else System.out.println("Integer b is less than 15");
//  }
//}

// 11/14/23
//public class Main {
//  public static void main(String[] args) {
//    boolean a = true;
//    boolean b = false;
//    System.out.println(!a || b);
//    System.out.println(a && !b);
//  }
//}

// 1/17/23
public class Main {
  public static void main(String[] args) {
    Equals c = new Equals();
    System.out.println(c.equals(2, 2));
  }
}
    
public class Main {
  public static void main(String[] args) {
    System.out.println("Is 3 divisible by 4: " + Algorithm.divisibleBy2ndNUM(3, 4));
    System.out.println("Is 9 divisible by 3: " + Algorithm.divisibleBy2ndNUM(9, 3));
    System.out.println("Is 10 divisible by 5: " + Algorithm.divisibleBy2ndNUM(10, 5));
    
    System.out.println("The number 987654321 has " + Algorithm.digits(987654321) + " digits");
    System.out.println("The number -12 has " + Algorithm.digits(-12) + " digits");
    System.out.println("The number 0 has " + Algorithm.digits(0) + " digits");
    
    System.out.println("The sum of the odd numbers between 4 and 9, inclusive are: " + Algorithm.oddNums(4, 9));
    System.out.println("The sum of the odd numbers between 0 and 3, inclusive are: " + Algorithm.oddNums(0, 3));
    System.out.println("The sum of the odd numbers between 6 and 7, inclusive are: " + Algorithm.oddNums(6, 7));
  }
}

public class Algorithm {
  public static boolean divisibleBy2ndNUM(int i, int x) { //Whether the first integer is divisible by the second
    if (i%x == 0) return true;
    return false;
  }
  
  public static int digits(int i) { //The number of digits in the parameter
    int x = 0;
    if (i == 0) return 1;
    while (Math.abs(i) > 0) {
      i = i/10;
      x++;
    }
    return x;
  }
  
  public static int oddNums(int i, int x) { //The sum of all odd numbers between the first parameter and the second, inclusive
    int sum = 0; 
    for (int num = i; num <= x; num++)
    {
      if (num%2 == 1) {
        sum = sum + num;
      }
    }
    return sum;
  }
}
