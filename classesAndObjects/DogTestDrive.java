class Dog{
    int size;
    String breed;
    String name;

    void bark(){
        System.out.println("Ruff!!! Ruff!!!");
    }
}
public class DogTestDrive{
    public static void main(String[] args){
        Dog d = new Dog();	// d is the object created for the class Dog
        d.size = 10;
        d.bark();
    }
}