public class Person {
  private String words;
  private int numone; 
  public Person(String w, int first) 
  {
    words = w;
    numone = first;
  }
  
  public Person(String w) {
    words = w;
  }
  
  public String getWords() {
    return words;
  }
  
  public int getFirst() {
    return numone;
  }
  
  public void talk(int a) {
    numone += a;
    System.out.println(getWords() + getFirst());
  }
  
  public void talk(int a, double b) {
    numone += a;
    a += b;
    System.out.println(getWords() + b);
  }
}