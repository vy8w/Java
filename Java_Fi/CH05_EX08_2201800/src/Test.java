
public class Test {
	public static void main(String[] ar) {
		//넘어온 메인메서드 매개변수 길이 확인하기
		System.out.println(ar.length);
		
		System.out.println(ar[0]); //abc
		System.out.println(ar[1]); //bcd
		System.out.println(ar[2]); //"2"
		System.out.println(ar[3]); //"3.5"
		
		System.out.println(ar[2]+1); //21
		System.out.println(ar[3]+1.2); //3.51.2
		
		//String --> 기본자료형 (Wrapper class 이용)
		//Boolean, Byte, Short, Integer, Long, Float, Double, Character
		
		System.out.println(Integer.parseInt(ar[2])+1); //3
		System.out.println(Double.parseDouble(ar[3])+1.2); //3.51.2
	}

}
