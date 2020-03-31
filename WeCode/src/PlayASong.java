class PlayASong {

	public static void main(String[] args) {
		
		//Artist class object
		Artist artist = new Artist("Pablo Albo", "pablo@gmail.com", "POP", 5);
		
		try {
			artist.storeSongDetails();
		} catch (InvalidInputFormatException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		artist.printDetails();
		
		//Operators class object
		Operators operators = new Operators("Simon", "simon@playasong.com", 123, "Accountatnt");
		
		operators.printDetails();
		operators.calculateRevenue(artist);

	}

}
