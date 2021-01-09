
public class Contact {
	private int number;
	private String name; 
	private String PhoneNumber;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
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
	
	public Contact(int number, String name, String phoneNumber) {
		super();
		this.number = number;
		this.name = name;
		PhoneNumber = phoneNumber;
	}
	
	public void Show() {
		System.out.println("==================");
		System.out.println("번호 : " + getNumber());
		System.out.println("이름 : " + getName());
		System.out.println("연락처 : " + getPhoneNumber());
		System.out.println("==================");
	}

}
