// package classesAndObjects.BeTheCompiler;

class DVDPlayer{
  boolean canRecord = false;

  void playDVD(){
    System.out.println("DVD is Recording...");
  }
}

public class DVDPlayerTestDrive {
  public static void main(String[] args){
    DVDPlayer d = new DVDPlayer();
    d.canRecord =  true;
    d.playDVD();
  
    if(d.canRecord == true){
      d.playDVD();
    }
  }
}