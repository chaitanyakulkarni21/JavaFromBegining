public class Hobbits {
  String name;
  public static void main(String[] args){
    Hobbits [] h = new Hobbits[3];
    int z = -1; 
    while(z < 2){
      z = z + 1;
      h[z] = new Hobbits();
      h[z].name = "biblo";
      if(z == 1){
        h[z].name = "frodo";
      }
      if(z == 0){
        h[z].name = "sam";
      }
      System.out.print(h[z].name + " is a ");
      System.out.println("good Hobbit name...");
    }
  }
}