import java.util.Scanner;
import java.util.ArrayList;


public class Main {

	static ArrayList contactList = new ArrayList(); // �̷��� �����̶�� �ϳ���? c���� �� �ٸ� �����̳׿�
/*
	for(int i=0; i < 100 ; i++){
		contact[i] = new Contact(0, "ȫ�浿", "010-0000-0000");
	}
*/
//	static int contactNum = 0; 
	static Scanner scanner  = new Scanner(System.in);
	
	public static void main(String[] args) {
		//Contact[] contact = new Contact[100];
		
		while(true) {
			Mainpage(); // ���� ������ �޼ҵ� ȭ
			int select = scanner.nextInt();
			
			if (select == 1) {
				AddContact();
			}
			else if (select == 2) {
				Search();
			}
			else if (select == 3) {
				Delete();
			}
			else if (select 
					== 4) {
				ShowAll();
			}
			else if (select 
					== 5) {
				break;
			}
			else { // ����ó�� ( ���� ó���� ���...?)
				System.out.println("�߸��� �Է� �Դϴ�..."); 
			}
			
			
		}
		
		
	}
	
	public static void Mainpage() {
		System.out.println("=====================================================");
		System.out.println("1. ���  |  2. �˻�  |  3. ����  |  4. ��ü�˻�  |  5. ����");
		System.out.println("=====================================================");
		System.out.println("���Ͻô� ����� �����ϼ��� >"); 
	}
	
	
	public static void AddContact() {
		if(contactList.size()>=100) {
			System.out.println("�� �̻� ����� �� �����ϴ�.."); // 100 ����� ���
			return;
		}
		System.out.println("==================");
		System.out.println("����ó ����� �����մϴ�");
		System.out.println("==================");
		
		Contact contact = new Contact();
		
		System.out.println("�̸��� �Է��ϼ���>");
		contact.setName(scanner.next());
		//contact[contactNum].setNa           me(name); -> �� ���ͷ� �ڵ��ϸ� ������ �����?
		
		System.out.println("��ȣ�� �Է��ϼ���>1");
		contact.setPhoneNumber(scanner.next());
		//contact[contactNum].setPhoneNumber(phoneNum);
		
//		int number = contactNum + 1; 
//		Contact contactAdd = new Contact(number, name, phoneNum);
		
		contactList.add(contact);
		
		
		System.out.println((contactList.size()) + "���� ��ϵǾ����ϴ�");
		
//		contact[contactNum] = contactAdd;
		
//		contactNum++; 
	}

	public static void Search() {
		if(contactList.size() == 0) {
			System.out.println("��ϵ� ����ó�� �����ϴ�");
			return;
		}
		System.out.println("==================");
		System.out.println("����ó �˻��� �����մϴ�");
		System.out.println("==================");

		System.out.println("�̸��� �Է��ϼ���>");
		String name = scanner.next();
		
		String cname;
		
		Contact contact = new Contact();
		
		for(int i = 0; i<contactList.size(); i++) {
			contact = (Contact) contactList.get(i);
			if(name.equals(contact.getName())) {
				contact.Show();
				return;
			}
		}
		System.out.println("������ �̸��� �����ϴ�");
	}

	public static void Delete() {
		if(contactList.size() == 0) {
			System.out.println("��ϵ� ����ó�� �����ϴ�");
			return;
		}
		System.out.println("==================");
		System.out.println("����ó ������ �����մϴ�");
		System.out.println("==================");

		System.out.println("�̸��� �Է��ϼ���>");
		String name = scanner.next();
		
		String cname;
		
		Contact contact = new Contact();
		
		for(int i = 0; i<contactList.size(); i++) {
			contact = (Contact) contactList.get(i);
			if(name.equals(contact.getName())) {
				contactList.remove(i);
				System.out.println("������ �Ϸ�Ǿ����ϴ�");
				return;
			}
		}
		System.out.println("������ �̸��� �����ϴ�");
	}
	
	public static void ShowAll() {
		if(contactList.size() == 0) {
			System.out.println("��ϵ� ����ó�� �����ϴ�");
			return;
		}
		Contact contact = new Contact();
		
		for(int i = 0; i<contactList.size(); i++) {
			contact = (Contact) contactList.get(i);
			System.out.println((i+1) + "��");
			contact.Show();
			System.out.println("\n");
		}
	}
}
