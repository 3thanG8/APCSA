public class Profile {
  private int age;
  private String name;
  public Profile(int a, String n) {
    age = a;
    name = n;
  }
  
  public int getAge() {
    return age;
  }
  
  public String getName() {
    return name;
  }
  
  public void agesince2023(int d) {
    age += d;
  }
  
  public void getProfile() {
    System.out.println(getName() + "'s age since 2023 is " + getAge() );
  }
}
    
    