package assignment7;

//TODO: Copy a working Student class from Assignment 7 over this file.
public class Student {
	private String firstName;
	private String lastName;
	private int id;
	private double bearBucksBalance;
	
	public Student(String firstName, String lastName, int id) {
		this.firstName = firstName;
		this.lastName = lastName; 
		this.id = id;
	}

	public String getFullName() {
		String studentFullName = this.firstName + " " + this.lastName;
		return studentFullName;
	}

	public int getId() {
		int id = this.id;
		return id;
	}

	public void depositBearBucks(double amount) {
		this.bearBucksBalance += amount;
	}

	public double getBearBucksBalance() {
		return this.bearBucksBalance;
	}
}
