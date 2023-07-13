
import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		//String 클래스의 객체생성방법 2가지
		String a = new String("안녕"); //new로 객체생성
		String b = "안녕"; //리터럴로 객체 생성
		
		//String 클래스의 2가지 특징
		//특징1: 객체내부의 값을 변경할 수 없다. 
		//일반적인 참조자료형은 내부데이터 변경가능
		int[] c = new int[] {3,4,5};
		int[] d = c;
		c[0]=6; c[1]=7; c[2]=8;
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(d));
		//String의 경우
		String e = new String("안녕");
		String f = e;
		e="방가";
		System.out.println(e); //방가
		System.out.println(f); //안녕
		
		//특징2: 리터럴로 객체를 입력한 경우 문자열이 동일하면 객체를 공유함
		String aa = new String("Hello");		
		String bb = new String("Hello");
		String cc = "Hello";
		String dd = "Hello";
		String ee = "hello";
		
		System.out.println(aa==bb); //
		System.out.println(aa==cc);
		System.out.println(aa==dd);
		System.out.println(aa==ee);
		System.out.println(bb==cc);
		System.out.println(bb==dd);
		System.out.println(bb==ee);
		System.out.println(cc==dd); //true
		System.out.println(cc==ee);
		System.out.println(dd==ee);
		
		
		
		
				
	}
}
