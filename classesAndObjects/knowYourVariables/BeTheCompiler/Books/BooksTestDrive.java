class Books{
  String title;
  String author;
}

public class BooksTestDrive {
  public static void main(String[] args){
    Books[] myBooks = new Books[3];
    //Books objects created...
    myBooks[0] = new Books();
    myBooks[1] = new Books();
    myBooks[2] = new Books();

    myBooks[0].title = "And Then There Were None";
    myBooks[1].title = "Sherlock Holmes";
    myBooks[2].title = "The Alchemist";
    myBooks[0].author = "Agatha Christie";
    myBooks[1].author = "Arthur Conan Doyle";
    myBooks[2].author = "Paulo Coelo";

    int x = 0;

    while(x < 3){
      System.out.println(myBooks[x].title + ":" + myBooks[x].author);
      x = x + 1;
    }
  }
}