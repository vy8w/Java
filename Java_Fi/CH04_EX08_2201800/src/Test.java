
public class Test {
	public static void main(String[] args) {
		//break 제어키워드
		//다음코드에서 출력의 횟수를 써라.
		for(int i=0; i<10; i++) { //6번 
			if(i>5) {
				break;
			}
			System.out.println(i);
		}
		
		for(int i=0; i<10; i++) { //7번
			System.out.println(i);
			if(i==6) {
				break;
			}	
		}
		
		for(int i=0; i<5; i++) { //2+2+2+2+2=10번
			for(int j=0; j<4; j++) {
				if(j==2) {
					break;
				}
				System.out.println("A");
			}
		}
		
		for(int i=0; i<5; i++) { //4+4+0+4+4=16번
			for(int j=0; j<4; j++) {
				if(i==2) {
					break;
				}
				System.out.println("A");
			}
		}
		
		for(int i=0; i<5; i++) { //2+0+2+2+2=8번
			for(int j=0; j<4; j++) {
				if(i==1 || j==2) {					
					break;
				}
				System.out.println("A");
			}
		}
		
		//아래 코드에서 break을 만났을때 
		//2중 for문을 한번에 탈출하도록 코드를 수정하라
		for(int i=0; i<5; i++) { //3번
			for(int j=0; j<4; j++) {
				if(j==2) {		
					i=10;
					break;
				}
				System.out.println("A");
			}
		}
		
		abc: for(int i=0; i<5; i++) { //3번
			for(int j=0; j<4; j++) {
				if(j==2) {					
					break abc;
				}
				System.out.println("A");
			}
		}
		
	}
}



































