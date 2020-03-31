import java.util.Scanner;

public class Artist extends Users{
	
	private String musicGenre;
	private int noOfSongs;
	
	protected String [] [] songsArray = new String [5] [2];
	
	//object for scanner class
	Scanner sc1 = new Scanner(System.in);
	Scanner sc2 = new Scanner(System.in);
	
	//overload constructor
	public Artist(String name, String email, String musicGenre, int noOfSongs) {
		//assign super class constructor
		super(name, email);
		this.musicGenre = musicGenre;
		this.noOfSongs = noOfSongs;
	}
	
	//getter
	public int getNoOfSongs() { 
		return noOfSongs;
	}
	
	public String [][] getSongArray(){
		return this.songsArray;
	}

	//array exception
	public void storeSongDetails() throws InvalidInputFormatException{
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter Song Name : ");
			songsArray[i][0] = sc1.nextLine();
			
			System.out.println("Enter Rate : ");
			songsArray[i][1] = String.valueOf(sc2.nextLine());
			try {
				Float.parseFloat(songsArray[i][1]);
			} catch (Exception e) {
				throw new InvalidInputFormatException("You have entered an Invalid Input !");
		}
	}
	
}
	
	//abstract method
	public void displaysongArray() {
		for (int i = 0; i < (this.noOfSongs); i++) {
				System.out.println(this.songsArray[i][0]+ " \t " + this.songsArray[i][1]+ "\n");
		}
		
	}

	//display details
	@Override
	public void printDetails() {
		System.out.println("Artist Name is "+this.name);
		System.out.println("Artist Email is "+this.email);
		System.out.println("Artist Music Genre is "+this.musicGenre);
		System.out.println("Number of Songs is "+this.noOfSongs);
		this.displaysongArray();
		System.out.println("\n\n");
		
	}
	
	
	

}
