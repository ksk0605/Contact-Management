import java.util.Scanner;
import java.util.ArrayList;


public class Main {

	static ArrayList contactList = new ArrayList(); // 이런걸 전역이라고 하나요? c랑은 좀 다른 느낌이네요
/*
	for(int i=0; i < 100 ; i++){
		contact[i] = new Contact(0, "홍길동", "010-0000-0000");
	}
*/
//	static int contactNum = 0; 
	static Scanner scanner  = new Scanner(System.in);
	
	public static void main(String[] args) {
		//Contact[] contact = new Contact[100];
		
		while(true) {
			Mainpage(); // 메인 페이지 메소드 화
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
			else { // 예외처리 ( 문자 처리는 어떻게...?)
				System.out.println("잘못된 입력 입니다..."); 
			}
			
			
		}
		
		
	}
	
	public static void Mainpage() {
		System.out.println("=====================================================");
		System.out.println("1. 등록  |  2. 검색  |  3. 삭제  |  4. 전체검색  |  5. 종료");
		System.out.println("=====================================================");
		System.out.println("원하시는 기능을 선택하세요 >"); 
	}
	
	
	public static void AddContact() {
		if(contactList.size()>=100) {
			System.out.println("더 이상 등록할 수 없습니다.."); // 100 명까지 등록
			return;
		}
		System.out.println("==================");
		System.out.println("연락처 등록을 시작합니다");
		System.out.println("==================");
		
		Contact contact = new Contact();
		
		System.out.println("이름을 입력하세요>");
		contact.setName(scanner.next());
		//contact[contactNum].setNa           me(name); -> 왜 세터로 코딩하면 에러가 날까요?
		
		System.out.println("번호를 입력하세요>1");
		contact.setPhoneNumber(scanner.next());
		//contact[contactNum].setPhoneNumber(phoneNum);
		
//		int number = contactNum + 1; 
//		Contact contactAdd = new Contact(number, name, phoneNum);
		
		contactList.add(contact);
		
		
		System.out.println((contactList.size()) + "번에 등록되었습니다");
		
//		contact[contactNum] = contactAdd;
		
//		contactNum++; 
	}

	public static void Search() {
		if(contactList.size() == 0) {
			System.out.println("등록된 연락처가 없습니다");
			return;
		}
		System.out.println("==================");
		System.out.println("연락처 검색을 시작합니다");
		System.out.println("==================");

		System.out.println("이름을 입력하세요>");
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
		System.out.println("동일한 이름이 없습니다");
	}

	public static void Delete() {
		if(contactList.size() == 0) {
			System.out.println("등록된 연락처가 없습니다");
			return;
		}
		System.out.println("==================");
		System.out.println("연락처 삭제를 시작합니다");
		System.out.println("==================");

		System.out.println("이름을 입력하세요>");
		String name = scanner.next();
		
		String cname;
		
		Contact contact = new Contact();
		
		for(int i = 0; i<contactList.size(); i++) {
			contact = (Contact) contactList.get(i);
			if(name.equals(contact.getName())) {
				contactList.remove(i);
				System.out.println("삭제가 완료되었습니다");
				return;
			}
		}
		System.out.println("동일한 이름이 없습니다");
	}
	
	public static void ShowAll() {
		if(contactList.size() == 0) {
			System.out.println("등록된 연락처가 없습니다");
			return;
		}
		Contact contact = new Contact();
		
		for(int i = 0; i<contactList.size(); i++) {
			contact = (Contact) contactList.get(i);
			System.out.println((i+1) + "번");
			contact.Show();
			System.out.println("\n");
		}
	}
}
