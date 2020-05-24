class Dog{
  String name;
  void bark(int numberOfBarks){
    while(numberOfBarks > 0){
      System.out.println("Ruff!!!");
      numberOfBarks = numberOfBarks - 1;
    }
  }
}

public class sendingParameter {
  public static void main(String[] args){
    Dog d = new Dog();
    d.bark(3);
  }
}