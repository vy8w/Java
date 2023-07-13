

public class Test {
	public static void main(String[] args) {
		//for 반복 제어문
		int a;
		for(a=0; a<3; a++) {
			System.out.println(a);
		}
		for(int i=0; i<3; i++) {
			System.out.println(i);
		}
		
		//다음 코드에서 문자 A가 출력되는 회수를 써라.
		for(int i=0; i<10; i++) { //10번
			System.out.println("A");
		}
		for(int i=1; i<=10; i++) {
			System.out.println("A");
		}
		for(int i=10; i>0; i--) {
			System.out.println("A");
		}
		for(int i=0; i<10; i+=2) {
			System.out.println("A");
		}
		for(int i=0; i<10; i+=3) {
			System.out.println("A");
		}		
		for(int i=10; i>0; i-=2) {
			System.out.println("A");
		}
		for(int i=0; i<5; i++) {
			System.out.println("A");
		}
		for(int i=5; i>0; i++) {
			System.out.println("A");
		}
		
		//무한루프
//		for(int i=0; ;i++) { //무한번
//			System.out.println("A");
//		}
		for(; ;) { //무한번
			System.out.println("A");
		}
		
	}
}










