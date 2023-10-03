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
    System.out.println(getWords() + (getFirst() + a));
  }
  
  public void talk(int a, int b) {
    System.out.println(getWords() + (a + b));
  }
}
