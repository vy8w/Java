
public class Test {
	public static void main(String[] args) {
		//continue 제어키워드
		//다음코드에서 출력의 횟수를 써라.
		for(int i=0; i<10; i++) { //6번 
			if(i>5) {
				continue;
			}
			System.out.println(i);
		}
		
		for(int i=0; i<10; i++) { //10번 
			System.out.println(i);
			if(i==6) {
				continue;
			}	
		}
		
		for(int i=0; i<5; i++) { //3+3+3+3+3=15번 
			for(int j=0; j<4; j++) {
				if(j==2) {
					continue;
				}
				System.out.println("A");
			}
		}
		
		for(int i=0; i<5; i++) { //4+4+0+4+4=16번 
			for(int j=0; j<4; j++) {
				if(i==2) {
					continue;
				}
				System.out.println("A");
			}
		}
		
		for(int i=0; i<5; i++) { //3+0+3+3+3=12번 
			for(int j=0; j<4; j++) {
				if(i==1 || j==2) {					
					continue;
				}
				System.out.println("A");
			}
		}
		
		for(int i=0; i<5; i++) { //3=3번 
			for(int j=0; j<4; j++) {
				if(j==2) {		
					i=10;
					continue;
				}
				System.out.println("A");
			}
		}
		
		abc: for(int i=0; i<5; i++) { //2+2+2+2+2=10번 
			for(int j=0; j<4; j++) {
				if(j==2) {					
					continue abc;
				}
				System.out.println("A");
			}
		}
		
	}
}
