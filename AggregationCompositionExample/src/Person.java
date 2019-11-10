
public class Person {
	
	private String emmId;
	private String firstName;
	private String lastName;
	private Address address;
	
	// Composition example 
	
	public Person() {
		 address = new Address();
	}

	public String getEmmId() {
		return emmId;
	}

	public void setEmmId(String emmId) {
		this.emmId = emmId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Person [emmId=" + emmId + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ "]";
	}

	

}
