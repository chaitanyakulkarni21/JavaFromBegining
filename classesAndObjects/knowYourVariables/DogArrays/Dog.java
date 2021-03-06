class Dog{
  String name;
  public static void main(String[] args){
    Dog dog1 = new Dog(); //make a Dog object and access it
    dog1.bark();
    dog1.name = "Bart";

    Dog[] myDogs = new Dog[3];  //make a Dog array
    // and put some dogs in it
    myDogs[0] = new Dog();
    myDogs[1] = new Dog();
    myDogs[2] = dog1;

    // now access the Dogs using the array reference
    myDogs[0].name = "Fred";
    myDogs[1].name = "Bruno";

    System.out.println("Last dog's name is : " + myDogs[2].name);

    //now loop through the array
    int x = 0;
    while(x < myDogs.length){
      myDogs[x].bark();
      x = x + 1;
    }
  }

  public void bark(){
    System.out.println(name + " says Ruff!!!");
  }
  public void eat(){ }
  public void chaseCat(){ }
}
