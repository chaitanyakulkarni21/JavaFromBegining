// An example of while loop

public class Loopy{
          public static void main(String[] args){
                    int x = 1;
                    System.out.println("I'm Outside the loop");
                    while(x<4){
                              System.out.println("I'm Inside the loop");
                              System.out.println("Value of x is : " + x);
                              x = x + 1;
                    }
                    System.out.println("The loop ends here...");
          }
}