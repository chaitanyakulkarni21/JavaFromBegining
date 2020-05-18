class Tape{
	boolean canRecord = false;

	void playTape(){
		System.out.println("Tape Playing...");
	}
	void recordTape(){
		System.out.println("Tape Recording...");
	}
}

public class TapeDeckTestDrive{
	public static void main(String[] args){
		Tape t = new Tape();
		t.canRecord = true;
		t.playTape();
		if(t.canRecord == true){
			t.recordTape();
		}
	}
}