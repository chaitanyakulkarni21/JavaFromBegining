class Sum{
  //int a,b;
  int Result(int x , int y){
    int z = x + y;
    return z; // Result is returned to main
  }
}

public class Returning {
  public static void main(String[] args){
    Sum s = new Sum();
    int r;
    r = s.Result(4,5);  // Passing the value to the Result method
    System.out.println("Result : " + r);  // Result is printed in Main
  }
}