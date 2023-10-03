public class Talk {
  private String words;
  private int numone; 
  public Talk(String w, int first) 
  {
    words = w;
    numone = first;
  }

  public Talk(String w) {
    words = w;
  }
  
  public String getWords() {
    return words;
  }
  
  public int getFirst() {
    return numone;
  }
  
  public void add(int a) {
    numone += a;
    System.out.print(getWords() + a);
  }
}