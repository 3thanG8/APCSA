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

// 11/17/23
//public class Main {
//  public static void main(String[] args) {
//    Equals c = new Equals();
//    System.out.println(c.equals(2, 2));
//  }
//}
    
// 11/24/23
public class Main {
  public static void main(String[] args) {
    System.out.println("Is 3 divisible by 4: " + Algorithm.divisibleBy2ndNUM(3, 4));
    System.out.println("Is 9 divisible by 3: " + Algorithm.divisibleBy2ndNUM(9, 3));
    System.out.println("Is 10 divisible by 5: " + Algorithm.divisibleBy2ndNUM(10, 5));
    
    System.out.println("The number 987654321 has " + Algorithm.digits(987654321) + " digits");
    System.out.println("The number -12 has " + Algorithm.digits(-12) + " digits");
    System.out.println("The number 0 has " + Algorithm.digits(0) + " digits");
    
    System.out.println("The sum of the odd numbers between 4 and 9, inclusive are: " + Algorithm.oddNums(4, 9));
    System.out.println("The sum of the odd numbers between 50 and 12, inclusive are: " + Algorithm.oddNums(50, 12));
    System.out.println("The sum of the odd numbers between 6 and 7, inclusive are: " + Algorithm.oddNums(6, 7));
    
    System.out.println("The sum of all multiples of ten between 10 and 99, inclusive are: " + Algorithm.tensNums(10, 99));
    System.out.println("The sum of the multiples of ten between 2 and 3, inclusive are: " + Algorithm.tensNums(2, 3));
    System.out.println("The sum of the multiples of ten between 1 and 10, inclusive are: " + Algorithm.tensNums(1, 10));
    
    System.out.println("The sum of the numbers in 321 is: " + Algorithm.paraSum(321));
    System.out.println("The sum of the numbers in 12 is: " + Algorithm.paraSum(12));
    System.out.println("The sum of the numbers in 54321 is: " + Algorithm.paraSum(54321));
    
    System.out.println("The largest power of two less than or equal to 800 is: " + Algorithm.pwrTwo(800));
    System.out.println("The largest power of two less than or equal to 17 is: " + Algorithm.pwrTwo(17));
    System.out.println("The largest power of two less than or equal to 0 is: " + Algorithm.pwrTwo(0));
  }
    public class Main { //12/4/23
  public static void main(String[] args) {
    System.out.println("Is \"World\" in \"Hello World\": " + Algorithm.secondInFirst("Hello World", "World"));
    System.out.println("Is \"potato\" in \"potatwah\": " + Algorithm.secondInFirst("potatwah", "potato"));
    System.out.println("Is \"gatos\" in \"Los gatos\": " + Algorithm.secondInFirst("Los gatos", "gatos"));
  }
}

    public class Main { // 12/7/23
  public static void main(String[]args) {  
    for (int i = 0; i < 3; i++) {
      for (int x = 5; x > 0; x--) {
        System.out.println("Beep");
      }
      System.out.println();
    }
  }
}

// 2/7/24
public class Main {
  public static void main(String[]args) {
    int[] ints = {1,2,3};
    int[] i = {1};
    int[] a = {3,2,1};
    Algorithm.printArray(ints); 
    Algorithm.printArray(i);
    Algorithm.printArray(a);
    
    int[] b = {1,2,3,4};
    int[] c = {5,2};
    int[] d = {0,1,2,3};
    Algorithm.swapIndex(b, 1, 2); //Test 1
    System.out.print("\n");
    for (int s : b)
      System.out.print(s + " ");
    Algorithm.swapIndex(c, 0, 1); //Test 2
    System.out.print("\n");
    for (int s : c)
      System.out.print(s + " ");
    Algorithm.swapIndex(d, 0, 3); //Test 3
    System.out.print("\n");
    for (int s : d)
      System.out.print(s + " ");
    
    int[] e = {3,2,1};
    int[] f = {1,2,3};
    int[] g = {10, 100, 5};
    System.out.print("\n");
    System.out.print(Algorithm.findMax(e));
    System.out.print(" " + Algorithm.findMax(f));
    System.out.print(" " + Algorithm.findMax(g));
    
    int[] h = {3,2,1};
    int[] j = {1,2,3};
    int[] k = {10, 100, 5};
    System.out.print("\n");
    System.out.print(Algorithm.findMin(h));
    System.out.print(" " + Algorithm.findMin(j));
    System.out.print(" " + Algorithm.findMin(k));
    
    String[] st = {"Hello,", "world", "!"};
    String[] str = {"hi", "a", "buy"};
    String[] stri = {"abcd", "no", "yes"};
    System.out.print("\n");
    System.out.print(Algorithm.findShortest(st));
    System.out.print(" " + Algorithm.findShortest(str));
    System.out.print(" " + Algorithm.findShortest(stri));
    
    String[] strin = {"Hello,", "world", "!"};
    String[] strings = {"hi", "a", "buy"};
    String[] string = {"abcd", "no", "yes"};
    System.out.print("\n");
    System.out.print(Algorithm.findLongest(strin));
    System.out.print(" " + Algorithm.findLongest(strings));
    System.out.print(" " + Algorithm.findLongest(string));
    
    int[] abc = {2,3,4};
    int[] cba = {-1,-2,-3};
    int[] bac = {100, -1000, 10};
    int[] acb = {5, -5, 10};
    System.out.print("\n");
    System.out.print(Algorithm.findAbsDiff(abc, cba));
    System.out.print(" " + Algorithm.findAbsDiff(abc, bac));
    System.out.print(" " + Algorithm.findAbsDiff(abc, acb));
    
    double[] ab = {2.0, 3.0, 4.0, 5.0};
    double[] ba = {1.0, 5.0, 3.5};
    double[] nap = {6.5, 10.0, 5.5, 7.5, 2.5};
    System.out.print("\n");
    System.out.print(Algorithm.findMean(ab));
    System.out.print(" " + Algorithm.findMean(ba));
    System.out.print(" " + Algorithm.findMean(nap));
    
    int[] map = {1,2,3};
    int[] pam = {3,2,1};
    int[] mpa = {5,2,6,3,1};
    System.out.print("\n");
    Algorithm.reverseOrder(map);
    System.out.print("\n");
    Algorithm.reverseOrder(pam);
    System.out.print("\n");
    Algorithm.reverseOrder(mpa);
    
    int[] bub = {1,2,3,3,4};
    int[] ubb = {1,2,3,4,5};
    int[] bbu = {1,2,3,2,4};
    System.out.print("\n");
    System.out.print(Algorithm.findConsValues(bub));
    System.out.print(" " + Algorithm.findConsValues(ubb));
    System.out.print(" " + Algorithm.findConsValues(bbu));
    
    int[] nob = {1,0,-1};
    int[] bon = {1,2,4,5};
    int[] obn = {1,-2,3,-2,4};
    System.out.print("\n");
    System.out.print(Algorithm.findNeg(nob));
    System.out.print(" " + Algorithm.findNeg(bon));
    System.out.print(" " + Algorithm.findNeg(obn));
    
    int[] bob = {1,2,3,2};
    int[] boo = {1,2,3,4};
    int[] bop = {4,3,2,4};
    System.out.print("\n");
    System.out.print(Algorithm.findEqual(bob));
    System.out.print(" " + Algorithm.findEqual(boo));
    System.out.print(" " + Algorithm.findEqual(bop));
    
    int[] pop = {1,2,1,1,1};
    int[] poo = {2,3,5,4,5};
    int[] pob = {5,5,5,5,5};
    System.out.print("\n");
    System.out.print(Algorithm.findLongestStreak(pop,1));
    System.out.print(" " + Algorithm.findLongestStreak(poo,6));
    System.out.print(" " + Algorithm.findLongestStreak(pob,5));
    
    String[] aaa = {"zebra", "alpha"};
    String[] bbb = {"alpha", "bad"};
    String[] ccc = {"sad", "happy"};
    System.out.print("\n");
    System.out.print(Algorithm.findAlphabet(aaa));
    System.out.print(" " + Algorithm.findAlphabet(bbb));
    System.out.print(" " + Algorithm.findAlphabet(ccc));
    
    int[] first = {1,2};
    int[] second = {3,4};
    int[] third = {5,1};
    int[] fourth = {3,2};
    System.out.print("\n");
    System.out.print(Algorithm.findIdentical(first,second));
    System.out.print(" " + Algorithm.findIdentical(second,third));
    System.out.print(" " + Algorithm.findIdentical(first,fourth));
  }
}

import java.util.ArrayList;
public class Main {
  public static void main(String[]args) {
    // Removes all duplicate consecutive elements from the ArrayList
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(1);
    list.add(2);
    list.add(2);
    list.add(3);
    list.add(3);
    System.out.print("\n");
    Algorithm.removeDuplicate(list);    
    System.out.print(list);
    
    ArrayList<Integer> l = new ArrayList<Integer>();
    l.add(1);
    l.add(2);
    l.add(3);
    System.out.print("\n");
    Algorithm.removeDuplicate(l);    
    System.out.print(l);
    
    ArrayList<Integer> li = new ArrayList<Integer>();
    li.add(1);
    li.add(2);
    li.add(2);
    System.out.print("\n");
    Algorithm.removeDuplicate(li);    
    System.out.print(li);
    
    // Removes all instances of the int parameter in the ArrayList
    ArrayList<Integer> lis = new ArrayList<Integer>();
    lis.add(1);
    lis.add(2);
    lis.add(2);
    lis.add(3);
    lis.add(3);
    System.out.print("\n");
    Algorithm.removeInt(lis,2);
    System.out.print(lis);
    
    ArrayList<Integer> a = new ArrayList<Integer>();
    a.add(0);
    a.add(1);
    a.add(0);
    a.add(1);
    System.out.print("\n");
    Algorithm.removeInt(a,0);
    System.out.print(a);
    
    ArrayList<Integer> b = new ArrayList<Integer>();
    b.add(5);
    b.add(5);
    b.add(5);
    b.add(5);
    System.out.print("\n");
    Algorithm.removeInt(b,5);
    System.out.print(b);
    
    //Adds the int parameter to an ArrayList in ascending order to an appropriate index
    ArrayList<Integer> c = new ArrayList<Integer>();
    c.add(1);
    c.add(2);
    c.add(2);
    c.add(3);
    c.add(3);
    System.out.print("\n");
    Algorithm.addInt(c,4);
    System.out.print(c);
    
    ArrayList<Integer> d = new ArrayList<Integer>();
    d.add(1);
    d.add(2);
    d.add(3);
    d.add(2);
    d.add(5);
    System.out.print("\n");
    Algorithm.addInt(d,4);
    System.out.print(d);
    
    ArrayList<Integer> e = new ArrayList<Integer>();
    e.add(1);
    e.add(20);
    e.add(5);
    e.add(2);
    e.add(13);
    System.out.print("\n");
    Algorithm.addInt(e,10);
    System.out.print(e);
    
    //Returns whether or not the ArrayLists are in reverse order of each other
    ArrayList<Integer> f = new ArrayList<Integer>();
    ArrayList<Integer> g = new ArrayList<Integer>();
    f.add(1);
    f.add(2);
    f.add(3);
    g.add(3);
    g.add(2);
    g.add(1);
    System.out.print("\n");
    System.out.print(Algorithm.checkRev(f,g));
    
    g.remove(1);
    System.out.print("\n");
    System.out.print(Algorithm.checkRev(f,g));
    
    f.remove(1);
    System.out.print("\n");
    System.out.print(Algorithm.checkRev(f,g));
    
    //Returns the maximum of the ArrayList
    ArrayList<Integer> h = new ArrayList<Integer>();
    h.add(3);
    h.add(2);
    h.add(1);
    System.out.print("\n");
    System.out.print("Max: " + Algorithm.getMax(h));
    
    h.remove(0);
    System.out.print("\n");
    System.out.print("Max: " + Algorithm.getMax(h));
    
    ArrayList<Integer> i = new ArrayList<Integer>();
    i.add(5);
    i.add(10);
    i.add(2);
    System.out.print("\n");
    System.out.print("Max: " + Algorithm.getMax(i));
    
    //Returns the minimum of the ArrayList
    ArrayList<Integer> j = new ArrayList<Integer>();
    j.add(3);
    j.add(2);
    j.add(1);
    System.out.print("\n");
    System.out.print("Min: " + Algorithm.getMin(j));
    
    j.remove(2);
    System.out.print("\n");
    System.out.print("Min: " + Algorithm.getMin(j));
    
    ArrayList<Integer> k = new ArrayList<Integer>();
    k.add(10);
    k.add(0);
    k.add(5);
    System.out.print("\n");
    System.out.print("Min: " + Algorithm.getMin(k));
    
    //Returns the shortest string in the ArrayList
  }
}
