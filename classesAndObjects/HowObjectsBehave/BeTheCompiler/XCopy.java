class XCopy{
  public static void main(String[] args){
    int x = 20;

    XCopy cpy = new XCopy();
    int y = cpy.go(x);
    System.out.println(x + " " + y);  // Prints 20 40
  }

  int go(int arg){
    arg = arg * 2;
    return arg;
  }
} 