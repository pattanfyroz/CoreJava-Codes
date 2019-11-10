
public class ClientText {
	public static void main(String[] args) {
		aggregationDemo();
		compositionDemo();
	}
	//@SuppressWarnings("unused")
	private static void compositionDemo() {
		Person person = new Person();
		
		person.setEmmId("PI 8652");
		person.setFirstName("Pattan Fyroz");
		person.setLastName("khana");
		person.getAddress().setAddressLine1("Karatampadu ");
		person.getAddress().setAddressLine2("3-32");
		person.getAddress().setCity("Nellore");
		person.getAddress().setStreet("School");
		
		System.err.println(person);
		person= null;
		System.err.println("..........................");
		System.err.println(person);
		
		if (person != null) {
			System.err.println(person.getAddress());
			
		}
		
		
	}
    
	private static void aggregationDemo() {
		Address address = new Address();
		
		address.setAddressLine1("Karatampadu ");
		address.setAddressLine2("Nellore ");
		address.setCity("Amaravathi");
		address.setStreet("Atmakur");

		Employee employee = new Employee();
		employee.setAddress(address);
		employee.setEmmId("10011");
		employee.setAge(24);
		employee.setFirstName("fyroz");
		employee.setLastName("pattan");
		
		System.out.println(employee);
		employee= null;
		System.out.println("..........................");
		System.out.println(employee);
		System.out.println(address);
	}
	
	
	
}
