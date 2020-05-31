// When an instance variable is not initialised, it returns a null value 
class PoorDog{
  private int size ;
  private String name ;

  public int getSize(){
    return size;
  }
  public String getName(){
    return name ;
  }
}
public class PoorDogTestDrive{
  public static void main(String[] args){
    PoorDog one = new PoorDog();
    System.out.println("Dog Size : " + one.getSize());  // returns 0
    System.out.println("Dog Name : " + one.getName());  // returns null string
  }
}