class GoodDog{
    private int size;

    public int getSize(){
        return size;
    }
    public void setSize(int s){
        size = s;
    }

    void bark(){
        if(size > 60){
            System.out.println("Ruff!! Ruff!! Ruff!!");
        } else if(size > 14){
            System.out.println("Woof!! Woof!! Woof!!");
        } else {
            System.out.println("Yip!! Yip!! Yip!!");
        }
    }
}
public class GoodDogTestDrive{
    public static void main(String[] args){
        GoodDog one = new GoodDog();
        GoodDog two = new GoodDog();
        one.setSize(40);
        two.setSize(65);
        System.out.println("Dog one: " + one.getSize());
        System.out.println("Dog two: " + two.getSize());

        one.bark();
        two.bark();
    }
}