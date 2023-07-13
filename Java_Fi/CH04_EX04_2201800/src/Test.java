
public class Test {
	public static void main(String[] args) {
		//switch<->if
		
		//#미션1
		int a=8;
		switch(a) {
		case 10:			
			System.out.println("A"); break;
		case 9:
		case 8:
			System.out.println("B"); break;
		case 7:
			System.out.println("C");
		case 6:
			System.out.println("D"); break;
		}
		//#미션1을 if로 변환
		
		if(a==10) {
			System.out.println("A");
		}
		else if(a==8 || a==9) {
			System.out.println("B");
		}
		else if(a==7) {
			System.out.println("C");
			System.out.println("D");
		}
		else if(a==6) {
			System.out.println("D");
		}
		
		
		
		//#미션2 : 다음을 switch로 변환 (단 case는 5개 이내로 사용할 것)
		a=85;
		if(a>=90) {
			System.out.println("A");
		}
		else if(a>=80) {
			System.out.println("B");
		}
		else if(a>=70) {
			System.out.println("C");
		}
		else {
			System.out.println("F");
		}
		
		//#미션2을 switch로 변환
		switch(a/10) {
		case 10:
		case 9:
			System.out.println("A"); break;
		case 8:
			System.out.println("B"); break;
		case 7:
			System.out.println("C"); break;
		default:
			System.out.println("F");
		}
		
		
		
		
	}
}
