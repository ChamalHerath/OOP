import java.util.Scanner;

public class Operators extends Users implements Calculations{
	//variable declaration
	private int empNo;
	private String jobTitle;
	double noOfDownloads;
	int avg;
	
	
	Scanner sc = new Scanner(System.in);
	
	//implement overload constructor
	public Operators(String name, String email, int empNo, String jobTitle) {
		//assign super class constructor
		super(name, email);
		this.empNo = empNo;
		this.jobTitle = jobTitle;
	}
	
	@Override
	public void calculateRevenue(Artist obj) {
		this.printPricedetails();
		
		for (int i = 0; i < obj.getNoOfSongs(); i++) {
			avg = avg + Integer.parseInt(obj.getSongArray()[i][1]);
		}
		
		//calculation
		double revenue = avg * noOfDownloads;
		
		System.out.println("Artist : "+obj.name);
		System.out.println("Album Revenue is LKR "+revenue);
	}
	
	public void printPricedetails() {
		System.out.println("Enter no of Downloads : ");
		noOfDownloads = sc.nextDouble();
	}
	
	//display details
	@Override
	public void printDetails() {
		System.out.println("Operator Name is "+this.name);
		System.out.println("Operator Email is "+this.email);
		System.out.println("Operator Employee Number is "+this.empNo);
		System.out.println("Operator Job Title is "+this.jobTitle);
		System.out.println("\n\n");
		
	}

		

}
