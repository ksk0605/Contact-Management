
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
		System.out.println("��ȣ : " + getNumber());
		System.out.println("�̸� : " + getName());
		System.out.println("����ó : " + getPhoneNumber());
		System.out.println("==================");
	}

}