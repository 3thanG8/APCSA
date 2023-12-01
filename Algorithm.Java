// 11/28/23
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
  
  public static int tensNums(int i, int x) { //The sum of all multiples of ten between the first parameter and the second, inclusive
    int sum = 0; 
    for (int num = i; num <= x; num++)
    {
      if (num%10 == 0) {
        sum = sum + num;
      }
    }
    return sum;
  }
  
  public static int paraSum(int i) { //The sum of the parameter's digits
    int sum = 0;
    for (sum = 0; i != 0; i=i/10)
      sum += i%10;
    return sum;
  }
  
  public static int pwrTwo(int i) { //The largest power of two less than or equal to a positive parameter
    int result = 0;
    for(int a = i; a >= 1; a--)
    {
        if ((a & (a-1)) == 0)
        {
            result = a;
            break;
        }
    }
    return result;
  }
}

// 11/30/23
public class Algorithm {
  public static boolean secondInFirst(String a, String b) { //Whether the second string occurs in the first.
    return a.indexOf(b) != -1;
  }
  
  public static String reverse(String a) {
    
}
