import java.util.Scanner;


public class Main {

	static Contact[] contact = new Contact[100]; // �̷��� �����̶�� �ϳ���? c���� �� �ٸ� �����̳׿�
/*
	for(int i=0; i < 100 ; i++){
		contact[i] = new Contact(0, "ȫ�浿", "010-0000-0000");
	}
*/
	static int contactNum = 0; 
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
		if(contactNum>=100) {
			System.out.println("�� �̻� ����� �� �����ϴ�.."); // 100 ����� ���
			return;
		}
		System.out.println("==================");
		System.out.println("����ó ����� �����մϴ�");
		System.out.println("==================");
		
		System.out.println("�̸��� �Է��ϼ���>");
		String name = scanner.next();
		//contact[contactNum].setName(name); -> �� ���ͷ� �ڵ��ϸ� ������ �����?
		
		System.out.println("��ȣ�� �Է��ϼ���>");
		String phoneNum = scanner.next();
		//contact[contactNum].setPhoneNumber(phoneNum);
		
		int number = contactNum + 1; 
		Contact contactAdd = new Contact(number, name, phoneNum);
		System.out.println(number + "���� ��ϵǾ����ϴ�");
		contact[contactNum] = contactAdd;
		
		contactNum++; 
	}

	public static void Search() {
		if(contactNum == 0) {
			System.out.println("��ϵ� ����ó�� �����ϴ�");
			return;
		}
		System.out.println("==================");
		System.out.println("����ó �˻��� �����մϴ�");
		System.out.println("==================");

		System.out.println("�̸��� �Է��ϼ���>");
		String name = scanner.next();
		
		String cname;
		
		for(int i = 0; i<contactNum; i++) {
			cname = contact[i].getName();
			if(cname.equals(name)) {
				contact[i].Show();
				return;
			}
		}
		System.out.println("������ �̸��� �����ϴ�");
	}

	public static void Delete() {
		if(contactNum == 0) {
			System.out.println("��ϵ� ����ó�� �����ϴ�");
			return;
		}
		System.out.println("==================");
		System.out.println("����ó ������ �����մϴ�");
		System.out.println("==================");

		System.out.println("�̸��� �Է��ϼ���>");
		String name = scanner.next();
		
		String cname;
		
		for(int i = 0; i<contactNum; i++) {
			cname = contact[i].getName();
			if(cname.equals(name)) {
				if(i ==0) {
					contactNum--;
					return;
				}
				for(int j = i; j<contactNum; j++ ) {
					contact[j] = contact[i+1];
					contact[j].setNumber(j);
				}
				contactNum--;
				System.out.println("������ �Ϸ�Ǿ����ϴ�");
				return;
			}
		}
		System.out.println("������ �̸��� �����ϴ�");
	}
	
	public static void ShowAll() {
		if(contactNum == 0) {
			System.out.println("��ϵ� ����ó�� �����ϴ�");
			return;
		}

		for(int i = 0; i<contactNum; i++) {
			contact[i].Show();
		}
	}
}
