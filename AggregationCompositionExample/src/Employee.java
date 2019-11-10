
public class Employee {
	private String emmId;
	private String firstName;
	private String lastName;
	private int age;
	
	// Aggregation example
	private Address address;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [emmId=" + emmId + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", address=" + address + "]";
	}
	
	

}
