class Movie{
	String name;
	String genre;
	int rating;

	void playIt(){
		System.out.println("Playing the movie...");
	}
}
public class MovieTestDrive{
	public static void main(String[] args){

		Movie one = new Movie();	// made the new object for the class Movie
		one.name = "Sherlock Holmes";
		one.genre = "Crime";
		one.rating = 10;
		System.out.println(one.name);
		System.out.println(one.genre);
		System.out.println(" ");


		Movie two = new Movie();	// made the new object for the class Movie 
		two.name = "Avengers Endgame";
		two.genre = "Superhero";
		two.rating = 8;
		System.out.println(two.name);
		System.out.println(two.genre);
		two.playIt();
		System.out.println(" ");


		Movie three = new Movie();	// made a new object for the class Movie 
		three.name = "Hungama";
		three.genre = "Comedy";
		three.rating = 6;
		System.out.println(three.name);
		System.out.println(three.genre);
		three.playIt();
	}
}
