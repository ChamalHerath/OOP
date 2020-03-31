public abstract class Users { //parent class

	//variable declaration
	protected String name; 
	protected String email;
	
	//overload constructor
	public Users(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	//abstract method
	public abstract void printDetails();
}
