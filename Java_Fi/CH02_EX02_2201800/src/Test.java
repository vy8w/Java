
public class Test {
	public static void main(String[] ar) {
		//변수의 생명주기
		int a;
		{
			int b;
			a=3;
			b=5;
			System.out.println(a);
			System.out.println(b);
		}
		System.out.println(a);
//		System.out.println(b); //오류. 메모리에서 이미 사라짐
	}

}
