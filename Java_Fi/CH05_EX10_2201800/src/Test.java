import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		//String 메서드
		String a = "Hello Java Hello";
		//length()
		System.out.println(a.length());//16
		//chatAt()
		System.out.println(a.charAt(2));//
		//indexOf(), lastIndexOf()
		System.out.println(a.indexOf("llo"));
		System.out.println(a.indexOf("llo", 5));
		System.out.println(a.lastIndexOf("llo"));
		System.out.println(a.lastIndexOf("llo", 10));
		//String.valueOf() : 기본자료형 -> 문자열 (정적(static) 메서드)
		System.out.println(String.valueOf(2.1)+3.3);
		//concat()
		System.out.println("안녕".concat("하세요"));
		
		String b = "Hello Java";
		//toLowerCase(), toUpperCase()
		System.out.println(b.toLowerCase());
		System.out.println(b.toLowerCase());
		//repalce()
		System.out.println(b.replace("Hello", "안녕"));
		//substring()
		System.out.println(b.substring(1,4));
		//split()
		String[] c = "abc,bcd,cde,def".split(",");
		System.out.println(Arrays.toString(c));
		//trim()
		System.out.println("   abc   ".trim());
		
		//equals(), equalsIgnoreCase()
		String aa = new String("Java");
		String bb = new String("Java");
		String cc = new String("java");
		System.out.println(aa==bb);
		System.out.println(bb==cc);
		System.out.println(cc==aa);
		System.out.println(aa.equals(bb));
		System.out.println(bb.equals(cc));
		System.out.println(cc.equals(aa));
		System.out.println(cc.equalsIgnoreCase(aa));
		
		// 미션1. 다음 파일명에서 확장자를 제외한 파일 이름만 출력하라.
		// (단, 파일 이름의 길이는 다를 수 있다 + 반드시 한 줄 코드로 완성)
		String m1 = "abcde.jpg";
		System.out.println(m1.substring(0, m1.lastIndexOf(".")));
		
		// 미션2. 다음 코드에서 이름과 나이를 출력하는 코드를 작성하라.(이름 한 줄, 나이 한 줄)
		String m2 = "소설에 나오는 [홍길동]의 나이는 [16]세이다";
		// 이름
		System.out.println(m2.substring(m2.indexOf("[")+1, m2.indexOf("]")));
		
		// 미션3. 다음 문자열에서 사용 금액만 출력하라(한 줄 완성)
		String m3 = "신한카드 결제금액 500원 입니다.";
				
		
		
		
		
		
	}
}