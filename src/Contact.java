
public class Contact {
	private String name; 
	private String PhoneNumber;
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	
	public Contact(String name, String phoneNumber) {
		super();
		this.name = name;
		PhoneNumber = phoneNumber;
	}
	public Contact() {}
	
	public void Show() {
		System.out.println("이름 : " + getName());
		System.out.println("연락처 : " + getPhoneNumber());
	}
	

}
