class Sum{
  //int a,b;
  void Result(int x , int y){
    int z = x + y;
    System.out.println("Result : " + z);
  }
}

public class passByValue {
  public static void main(String[] args){
    Sum s = new Sum();
    s.Result(4,5);  // Passing the value to the Result method
  }
}