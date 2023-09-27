// 9/26/23
public class Keyboard {

  private String material;
  private String keycolor;
  private double price;
  public Keyboard(String m, String k, double p)
  {
    material = m;
    keycolor = k;
    price = p;
  }
    
  public Keyboard (String m, String k) 
  {
    material = m;
    keycolor = k;
  }
  
  public String getString() {
    return (material + keycolor);
  }
  
    public String getMat() {
      return material;
    }
    
    public String getKey() {
      return keycolor;
    }
    
    public double getPrice() {
      return price;
    }
    public void getKeyboard() {
      System.out.println(getMat());
      System.out.println(getKey());
      System.out.println(getPrice());
    }
}

    




    
