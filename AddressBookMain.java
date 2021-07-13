package bridglabz;
import java.util.*;
class AddressDetails {
	public String FirstName;
	public String LastName;
	public String Address;
	public String City;
	public String State;
	public String Zip;
	public String PhoneNum;
	public String id;
	public 	AddressDetails(String FirstName, String LastName, String Address, String City,String State,
								String Zip, String PhoneNum, String id) {
		this.FirstName = FirstName;
		this.LastName =LastName;
		this.Address = Address;
		this.City = City;
		this .State = State;
		this.Zip = Zip;
		this.PhoneNum = PhoneNum;
		this.id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName() {
		this.FirstName = FirstName;
	}
	public String getLastName(){
		return LastName;
	}
	public void setLastName() {
		this.LastName = LastName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress() {
		this.Address = Address;
	}
	public String getCity() {
		return City;
	}
	public void setCity() {
		this.City = City;
	}
	public String getState() {
		return State;
	}
	public void setState() {
		this.State = State;
	}
	public String getZip() {
		return Zip;
	}
	public void setZip() {
		this.Zip = Zip;
	}
	public String getPhoneNum() {
		return PhoneNum;
	}
	public void setPhoneNum() { 
		this.PhoneNum = PhoneNum;
	}
	
	public String getid() {
		return id;
	}
	public void setid() {
		this.id = id;
	}	
}
public class AddressBookMain {
	public static void main (String[] args) {
		System.out.println("Welcome To Address Book Program");
		ArrayList<AddressDetails> details = new ArrayList<AddressDetails>();  
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter your FirstName:");  
		String FirstName = sc.nextLine();
		System.out.print("Enter your LastName:");
		String LastName = sc.nextLine();
		System.out.print("Enter your Address:");
		String Address = sc.nextLine();
		System.out.print("Enter your City:");
		String City = sc.nextLine();
		System.out.print("Enter your State:");
		String State = sc.nextLine();
		System.out.print("Enter your Zip:");
		String Zip = sc.nextLine();
		System.out.print("Enter your PhoneNum:");
		String PhoneNum = sc.nextLine();
		System.out.print("Enter your Email:");
		String id = sc.nextLine();
		
		AddressDetails person = new  AddressDetails(FirstName, LastName, Address, State, City, Zip, PhoneNum, id);
		details.add(person);
		
		
		for (AddressDetails Item : details) { 	
			System.out.println("\n********");	      
			System.out.println(Item.getFirstName());
			System.out.println(Item.getLastName());
			System.out.println(Item.getAddress());
			System.out.println(Item.getCity());
			System.out.println(Item.getState());
			System.out.println(Item.getZip());
			System.out.println(Item.getPhoneNum());	
			System.out.println(Item.getid());
	   }

	}
}
