class Dog {
  String name;
  int size;

  void bark() {
    if (size > 60) {
      System.out.println("Woof!!!Woof!!!");
    } else if (size > 14) {
      System.out.println("Ruff!!! Ruff!!!");
    } else {
      System.out.println("Yip!!! Yip!!!");
    }
  }
}

public class DogTestDrive {
  public static void main(String[] args){
    Dog one = new Dog();
    Dog two = new Dog();
    Dog three = new Dog();

    one.size = 70;
    two.size = 8;
    three.size = 15;

    one.bark();
    two.bark();
    three.bark();
  }
}