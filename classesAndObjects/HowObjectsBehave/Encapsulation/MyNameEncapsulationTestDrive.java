class MyNameEncapsulation{
  private String name;
  
  String getName(){
    return name;
  }
  String setName(String n){
    name = n;
  }
  public void printName(String n){
    System.out.println("Name: " + n);
  }
}

public class MyNameEncapsulationTestDrive{
  public static void main(String[] args){
    MyNameEncapsulation obj = new MyNameEncapsulation();
    obj.setName("Chaitanya Kulkarni");
    obj.getName();
    obj.printName();
  }
}