
public class Test {
	public static void main(String[] ar) {
		//참,거짓
		boolean a = true;
		boolean b = false;
		System.out.println(a);
		System.out.println(b);
		
		//정수 4가지
		byte c = -3;
		short d = 5;
		int e = -7;
		long f = 9L; //int->long (업캐스팅이라 L 생략가능)
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
		
		//실수 2가지
		float g = 2.8F; //double->float으로 바꾸는 다운캐스팅은 직접해야 함
		double h = 5.8;
		double i = 5; //int->double로 바꾸는 업캐스팅으로 캐스팅 생략 가능
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
	}
}

