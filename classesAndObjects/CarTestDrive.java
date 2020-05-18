class Car {
    String name;
    int price;

    void driveIt(){
        System.out.println("The car is driving....");
    }
}

public class CarTestDrive{
    public static void main(String[] args){
        Car c = new Car();
        c.name = "BMW";
        c.price = 10000000;

        System.out.println("Car name: " + c.name);
        System.out.println("Car price: " + c.price);
        c.driveIt();
    }
}