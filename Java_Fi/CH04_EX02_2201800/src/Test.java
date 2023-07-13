public class Test {
	public static void main(String[] args) {
		//switch<->if
		int a=8;
		if(a>=9) {
			System.out.println("A");
		}
		else if(a==8) {
			System.out.println("B");
		}
		else if(a==7) {
			System.out.println("C");
		}
		else {
			System.out.println("D");
		}
		
		a=8;
		switch(a) {
		case 10:
		case 9:
			System.out.println("A"); break;			
		case 8:
			System.out.println("B"); break;
		case 7:
			System.out.println("C"); break;
		default:
			System.out.println("D");
		}
		
		
		
	}
	
}










