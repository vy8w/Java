public class Test {
	public static void main(String[] args) {
		//switch : 소괄호 안에는 정수, 문자, 문자열만 가능
		int a=8;
		switch(a) {
		case 10:
			System.out.println("A"); 
			break;
		case 9:
			System.out.println("B"); 
			break;
		case 8:
			System.out.println("C"); 
			break;
		default:
			System.out.println("F");
		}
		
		char b='B';
		switch(b) {
		case 'A':
			System.out.println("A"); 
			break;
		case 'B':
			System.out.println("B"); 
			break;
		case 'C':
			System.out.println("C"); 
			break;
		default:
			System.out.println("F");
		}
		
		String str="베리";
		switch(str) {
		case "땡큐":
			System.out.println("A"); 
			break;
		case "베리":
			System.out.println("B"); 
			break;
		case "감사":
			System.out.println("C"); 
			break;
		default:
			System.out.println("F");
		}
		
	}
}