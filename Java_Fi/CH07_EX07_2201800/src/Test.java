import java.util.Arrays;

//가변길이 매개변수

public class Test {
	public static void main(String[] args) {
		abc();
		abc(1);
		abc(1,2);
		abc(1,2,3);
		abc(1,2,3,4);
		abc(1,2,3,4,5);
		abc(1,2,3,4,5,6);
		abc(1,2,3,4,5,6,7);
		
	}
	public static void abc(int... m) { //모든 매개변수를 더하는 메서드
		int sum=0;
		for(int i=0; i<m.length; i++) {
			sum+=m[i];
		}		
		System.out.println(sum);		
	}
}

