// 11/28/23
import java.lang.Math;
import java.util.ArrayList;
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

// 11/30/23
  public static boolean secondInFirst(String a, String b) { //Whether the second string occurs in the first.
    return a.indexOf(b) != -1;
  }

  public static String reverse(String a) { //A string with the characters of the parameter reversed.
    if (a == null) {
      return a;
    }
    String b = "";
    for (int i = a.length() - 1; i >= 0; i--) {
      b = b + a.charAt(i);
    }
    return b;
  }

  public static boolean palindrome(String a) { //Whether the parameter is a palindrome
    String b = "";
    for (int i = a.length() - 1; i >= 0; i--) {
      b = b + a.charAt(i);
    }
    return a.indexOf(b) != -1;
  }

  public static int occOfSecInFirst(String a, String b) {//The number of occurrences of the second parameter in the first
    int x = 0;
    int index = a.indexOf(b);
    while (index >= 0) {
      x++;
      index = a.indexOf(b, index + 1);
    }
    return x;
  }

// 2/6/24 - 6.4 Developing Algorithms using Arrays
  public static void printArray(int[] ints) { //Prints the elements of the array
    for (int i : ints)
      System.out.print(i + " ");
  }

  public static void swapIndex(int[] ints, int a, int b) { //Swaps the elements at the indicies indicated by the parameters
    int temp = ints[a];
    ints[a] = ints[b];
    ints[b] = temp;
  }

  public static int findMax(int[] ints) { //Returns the maximum of the array
    int max = ints[0];
    for (int i = 1; i < ints.length; i++) {
      if (ints[i] > max) {
        max = ints[i];
      }
    }
    return max;
  }

  public static int findMin(int[] ints) { //Returns the minimum of the array
    int min = ints[0];
    for (int i = 1; i < ints.length; i++) {
      if (ints[i] < min) {
        min = ints[i];
      }
    }
    return min;
  }

  public static String findShortest(String[] str) { //Returns the shortest string in the array
    String s = str[0];
    for (int i = 1; i < str.length; i++) {
      if (str[i].length() < s.length()) {
        s = str[i];
      }
    }
    return s;
  }

  public static String findLongest(String[] str) { //Returns the longest string in the array
    String s = str[0];
    for (int i = 1; i < str.length; i++) {
      if (str[i].length() > s.length()) {
        s = str[i];
      }
    }
    return s;
  }

  public static int findAbsDiff(int[] in, int[] ints) { //Returns the largest absolute difference between two corresponding elements of the arrays
    int diff = 0;
    for (int i = 0; i < in.length; i++) {
      int d = Math.abs(in[i] - ints[i]); 
      if (d > diff) {
        diff = d;
      }
    }
    return diff;
  }

  public static double findMean(double[] doubles) { //Returns the mean average of the array
    double mean = 0.0;
    for (int i = 0; i < doubles.length; i++)
      mean += doubles[i];
    return mean/(doubles.length);
  }

  public static void reverseOrder(int[] ints) { //Reverses the order of the elements of the array without making a copy
    int start = 0;
    int end = ints.length-1;
    while (start < end) {
      int a = ints[start];
      ints[start] = ints[end];
      ints[end] = a;
      start++;
      end--;
    }
    for (int i = 0; i < ints.length; i++)
      System.out.print(ints[i] + " ");   
  }

  public static boolean findConsValues(int[] ints) { //Returns whether the array contains two consecutive equivalent values
    boolean val = false;
    for (int i = 0; i < ints.length-1; i++) {
      if (ints[i] == ints[i+1]) {
        val = true;
      }
    }
    return val;
  }

  public static int findNeg(int[] ints) { //Returns the index of the first negative value in the array, -1 otherwise
    int index = -1;
    for (int i = 0; i < ints.length; i++) {
      if (ints[i] < 0) {
        index = i;
      }
    }
    return index;
  }

  public static boolean findEqual(int[] ints) { //Returns whether the array contains two equivalent values
    for (int i = 0; i < ints.length - 1; i++) {
      for (int a = i + 1; a < ints.length; a++) {
        if (ints[i] == ints[a]) {
          return true;
        }
      }
    }
    return false;
  }

  public static int findLongestStreak(int[] ints, int a) { //Returns the length of the longest consecutive streak of the int parameter
    int streak = 1;
    for (int i = 0; i < ints.length-1; i++) {
      if (ints[i] == a && ints[i] == ints[i+1]) {
        streak++;
      }
    }
    if (streak == 1) return 0;
    else return streak;
  }

  public static String findAlphabet(String[] str) { //Returns the word that occurs last alphabetically.
    String s = str[0];
    for (int i = 1; i < str.length; i++) {
      if (str[i].compareTo(s) > 0) {
        s = str[i];
      }
    }
    return s;
  }

  public static boolean findIdentical(int[] ints, int[] a) { //Returns whether or not the two arrays contain any identical values
    for (int i = 0; i < ints.length; i++) {
      for (int b = 0; b < a.length; b++) {
        if (ints[i] == a[b]) {
          return true;
        }
      }
    }
    return false;
  }

// 2/27/24
  public static void removeDuplicate(ArrayList<Integer> list) { //Removes all duplicate consecutive elements from the ArrayList
    int i = 0;
    while (i < list.size() - 1) {
      if (list.get(i).equals(list.get(i+1))) {
        list.remove(i);
      }
      else {
        i++;
      }
    }
  }

  public static void removeInt(ArrayList<Integer> list, int i) { //Removes all instances of the int parameter in the ArrayList
    int a = 0;
    while (a < list.size()-1) {
      if (list.get(a).equals(i)) {
        list.remove(a);
      }
      else {
        a++;
      }
    }
  }

  public static void addInt(ArrayList<Integer> list, int i) { //Adds the int parameter to an ArrayList in ascending order to an appropriate index
    int index = 0;
    while (index < list.size() && list.get(index) < i) {
      index++;
    }
    list.add(index, i);
  }

  public static boolean checkRev(ArrayList<Integer> a, ArrayList<Integer> b) { //Returns whether or not the ArrayLists are in reverse order of each other
    if (a.size() != b.size()) {
      return false;
    }
    int size = a.size();
    for (int i = 0; i < size; i++) {
      if (!a.get(i).equals(b.get(size-1-i))) {
        return false;
      }
    }
    return true;
  }

  public static int getMax(ArrayList<Integer> list) { //Returns the maximum of the ArrayList
    int a = list.get(0);
    for (int i = 0; i < list.size(); i++) {
      if (a < list.get(i)) {
        a = list.get(i);
      }
    }
    return a;
  }

  public static int getMin(ArrayList<Integer> list) { //Returns the minimum of the ArrayList
    int a = list.get(0);
    for (int i = 0; i < list.size(); i++) {
      if (a > list.get(i)) {
        a = list.get(i);
      }
    }
    return a;
  }

  public static String getShortest(ArrayList<String> strings) { //Returns the shortest string in the ArrayList
    int a = strings.get(0).length();
    String str = "";
    for (int i = 0; i < strings.size(); i++) {
      if (a > strings.get(i).length()) {
        a = strings.get(i).length();
        str = strings.get(i);
      }
    }
    return str;
  }

  public static String getLongest(ArrayList<String> list) { //Returns the longest string in the ArrayList
    int a = list.get(0).length();
    String str = list.get(0);
    for (int i = 0; i < list.size(); i++) {
      if (a < list.get(i).length()) {
        a = list.get(i).length();
        str = list.get(i);
      }
    }
    return str;
  }

  public static int getDifference(ArrayList<Integer> list1, ArrayList<Integer> list2) {// Returns the largest absolute difference between two corresponding elements of the ArrayLists
    int diff = 0;
    for (int i = 0; i < list1.size(); i++) {
      for (int a = 0; a < list2.size(); a++) {
        if (Math.abs(list1.get(i)-list2.get(a)) > diff) {
          diff = Math.abs(list1.get(i)-list2.get(a));
        }
      }
    }
    return diff;
  }

  public static double getMean(ArrayList<Double> list) { // Returns the mean average of the ArrayList
    double sum = 0.0;
    for (int i = 0; i < list.size(); i++) { 
      sum += list.get(i);
    }
    return sum/list.size();
  }

  public static void reverseList(ArrayList<Integer> list) {// Reverses the elements of the ArrayList
    int size = list.size();
    for (int i = 0; i < list.size()/2; i++) {
      int temp = list.get(i);
      list.set(i, list.get(size - i - 1));
      list.set(size - i - 1, temp);
    }
  }

  public static boolean consecutiveVals(ArrayList<Integer> list) { //Returns whether the ArrayList contains two consecutive equivalent values
    boolean cons = false;
    for (int i = 0; i < list.size()-1; i++) {
      if (list.get(i).equals(list.get(i+1))) {
        cons = true;
      }
    }
    return cons;
  }

  public static int indexOfFirstNeg(ArrayList<Integer> list) { //Returns the index of the first negative value in the ArrayList, -1 otherwise
    int a = -1;
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) < 0) {
        a = i;
        return a;
      }
    }
   return a;
  }

  public static boolean equalVals(ArrayList<Integer> list) { //Returns whether the ArrayList contains two equivalent values
    for (int i = 0; i < list.size(); i++) {
      int first = list.get(i);
      for (int j = i + 1; j < list.size(); j++) {
        int val = list.get(j);
        if (first == val) {
          return true;
        }
      }
    }
    return false;
  }

  // 2/27/24
  public static int lessThanZero(ArrayList<Integer> list) { //Returns the number of elements in the ArrayList less than zero
    int count = 0;
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) < 0) {
        count++;
      }
    }
    return count;
  }

  public static boolean foundIn(ArrayList<String> list, String str) { //Returns true if the String is found in the ArrayList and false otherwise
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).equals(str)) {
        return true;
      }
    }
    return false;
  }

  public static boolean sameVal(ArrayList<Integer> list1, ArrayList<Integer> list2) { //Returns true if the same value appears in both ArrayLists and false otherwise
    for (int i = 0; i < list1.size(); i++) {
      for (int j = 0; j < list2.size(); j++) {
        if (list1.get(i) == list2.get(j)) {
          return true;
        }
      }
    }
    return false;
  }

  public static int firstInd(ArrayList<Integer> list, int a) { //Returns the index of the first appearance of the int in the list or -1 if it does not appear in the list.
    int index = 0;
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) == a) {
        index = i;
        return index;
      }
    }
    return -1;
  }

  public static int firstApp(int[] list, int a) { //Returns the index of the first appearance of the int in the array or -1 if it does not appear in the array.
    int index = 0;
    for (int i = 0; i < list.length; i++) {
      if (list[i] == a) {
        index = i;
        return index;
      }
    }
    return -1;
  }

  // 2/28/24
  public static void printStr(String[] arr)
  {
    String str = "[";
    for(int i = 0; i < arr.length - 1; i++)
      str += arr[i] + ", ";
    str += arr[arr.length - 1] + "]";
    System.out.println(str);
  }

  public static void printInt(int[] arr)
  {
    String str = "[";
    for(int i = 0; i < arr.length - 1; i++)
      str += arr[i] + ", ";
    str += arr[arr.length - 1] + "]";
    System.out.println(str);
  }
  
  public static void alphaSelectionSort(String[] list) { //The array sorted alphabetically with selection sort
    int a = list.length;
    for (int i = 0; i < a - 1; i++) {
      int first = i;
      for (int j = i + 1; j < a; j++) {
        if ((list[j].compareTo(list[first]) < 0)) {
          first = j;
        }
      }
      if (first != i) {
        String temp = list[i];
        list[i] = list[first];
        list[first] = temp;
      }
    }
  }

  public static void alphaInsertionSort(String[] list) { //The array sorted alphabetically with insertion sort
    int a = list.length;
    for (int i = 1; i < a; i++) {
      String first = list[i];
      int j = i - 1;
      while (j >= 0 && list[j].compareTo(first) > 0) {
      list[j+1] = list[j];
      j = j-1;
    }
    list[j+1] = first;
    }
  }

  public static void alphaSelectionSortList(ArrayList<String> list) { //The array sorted alphabetically with selection sort
    int a = list.size();
    for (int i = 0; i < a - 1; i++) {
      int first = i;
      for (int j = i + 1; j < a; j++) {
        if ((list.get(j).compareTo(list.get(first)) < 0)) {
          first = j;
        }
      }
      if (first != i) {
        String temp = list.get(i);
        list.set(i, list.get(first));
        list.set(first, temp);
      }
    }
  }

  public static void alphaInsertionSortList(ArrayList<String> list) { //The ArrayList sorted alphabetically with insertion sort
    int a = list.size();
    for (int i = 1; i < a; i++) {
      String first = list.get(i);
      int j = i - 1;
      while (j >= 0 && list.get(j).compareTo(first) > 0) {
      list.set(j+1, list.get(j));
      j = j-1;
    }
    list.set(j+1, first);
    }
  }

  public static void ascendingSelectionSortList(ArrayList<Integer> list) {
    int n = list.size();
    for (int i = 0; i < n - 1; i++) {
      int first = i;
      for (int j = i + 1; j < n; j++) {
        if (list.get(j) < list.get(first)) {
            first = j;
          }
        }
        if (first != i) {
          int temp = list.get(i);
          list.set(i, list.get(first));
          list.set(first, temp);
        }
    }
  }

  public static void ascendingInsertionSortList(ArrayList<Integer> list) {
    int n = list.size();
    for (int i = 1; i < n; ++i) {
      int first = list.get(i);
      int j = i - 1;
      while (j >= 0 && list.get(j) > first) {
          list.set(j + 1, list.get(j));
          j = j - 1;
      }
    list.set(j + 1, first);
    }
  }
}
