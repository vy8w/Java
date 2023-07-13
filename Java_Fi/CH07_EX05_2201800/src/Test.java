//
import java.util.Arrays;

//기본자료형 매개변수 전달 + 참조자료형 매개변수 전달

public class Test {
	
	public static void main(String[] args) {
		int a=7;
		abc(a);//17
		System.out.println(a);//7
		
		int[] b = {1,2,3};
		bcd(b);
		System.out.println(Arrays.toString(b)); //[4,5,6]
	}
	public static void abc(int a) {
		a=a+10;
		System.out.println(a);
	}
	public static void bcd(int[] b) {
		b[0]=4;
		b[1]=5;
		b[2]=6;
		System.out.println(Arrays.toString(b)); //[4,5,6]
	}
	
}
