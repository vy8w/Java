
public class Test {
	public static void main(String[] args) {
		//while <-> for
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
		//위의 코드를 while로 변경하라.
		int a=0;
		while(a<10) {
			System.out.println(a);
			a++;
		}
		
		//아래 코드에서 A가 출력되는 횟수를 써라
		a=0;
		while(a<10) { //10번
			System.out.println("A");
			a++;
		}
		for(int i=0; i<10; i++) {
			System.out.println("A");
		}
				
		a=0;
		while(a<10) { //5번
			System.out.println("A");
			a+=2;
		}
		for(int i=0; i<10; i+=2) {
			System.out.println("A");
		}
		
		a=10;
		while(a>0) { //10번
			System.out.println("A");
			a--;
		}
		for(int i=10; i>0; i--) {
			System.out.println("A");
		}
		
		a=10;
		while(a>0) { //5번
			System.out.println("A");
			a-=2;
		}
		for(int i=10; i>0; i-=2) {
			System.out.println("A");
		}
		
		a=0;
		while(a<10) { //10번 (1,2,...10)
			a++;
			System.out.println(a);
		}
		for(int i=1; i<=10; i++) { //10번 (1,2,...10)
			System.out.println(i);
		}
		
		
	}
}

