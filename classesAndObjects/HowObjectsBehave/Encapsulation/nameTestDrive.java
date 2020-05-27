class Name{
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }

    void Print(){
        System.out.println("Chaitanya");
    }
}
public class nameTestDrive {
    public static void main(String[] args){
        Name n1 = new Name();
        n1.setName("Mike");
        System.out.println("Name is : " + n1.getName());
        n1.Print();
    }
}