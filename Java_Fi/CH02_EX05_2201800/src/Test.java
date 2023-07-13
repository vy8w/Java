
public class Test {
	public static void main(String[] ar) {
		//업캐스팅(upcasting)
		long a = 3;
		double b = 3.5F;
		float c = 6;
		
		//다운캐스팅(downcasting)
		int d = (int)3.9;
		float e = (float)5.8;
		short f = 3; //생략가능 (예외적으로 다운캐스팅 가능한 케이스)
		byte g = (byte)130;
		
		System.out.println(a); //3
		System.out.println(b); //3.5
		System.out.println(c); //6.0
		System.out.println(d); //3
		System.out.println(e); //5.8
		System.out.println(f); //3
		System.out.println(g); //-126
	}
}
