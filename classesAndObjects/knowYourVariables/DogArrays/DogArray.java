class Dog{
    String name;
    void bark(){
        System.out.println("Ruff!!!, Ruff!!!, Ruff!!!");
    }
}
public class DogArray{
    public static void main(String[] args){
        Dog d = new Dog[3];
        d[0] = new Dog();
        d[1] = new Dog();
        d[2] = new Dog();

        d[0].name = "Bruno";
        d[1].name = "Fred";
        d[2].name = "Scooby";

        int x = 0;
        while(x < d.length){
            System.out.println(d.name[x]);
            x = x + 1;
        }
    }
}