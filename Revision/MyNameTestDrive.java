class MyName{
  String name;
  int age;
  String companyName;
  String city;
}
public class MyNameTestDrive{
  public static void main(String[] args){
    MyName mn = new MyName();
    mn.name = "Chaitanya Kulkarni";
    mn.age = 25;
    mn.companyName = "GlobalLogic";
    mn.city = "Nagpur";

    System.out.println("Name : " + mn.name);
    System.out.println("Age : " + mn.age);
    System.out.println("Company : " + mn.companyName);
    System.out.println("City : " + mn.city); 
  }
}