
public class Test {
	public static void main(String[] args) {
		//시프트연산자
		//산술시프트(<<, >>)
		System.out.println(7<<1);//14
		System.out.println(7<<2);//28
		System.out.println(-7<<1);//-14
		System.out.println(-7<<2);//-28
		System.out.println(7>>1);//3
		System.out.println(7>>2);//1
		System.out.println(-7>>1);//-4
		System.out.println(-7>>2);//-2
		
		//논리시프트 (>>>) : 각 비트에서의 값 추출때 사용
		int a = 0b10110011;
		System.out.println((a>>>0)&1);//1 
		System.out.println((a>>>1)&1);//1
		System.out.println((a>>>2)&1);//0
		System.out.println((a>>>3)&1);//0
		System.out.println((a>>>4)&1);//1
		System.out.println((a>>>5)&1);//1
		System.out.println((a>>>6)&1);//0
		System.out.println((a>>>7)&1);//1
		
	}
}
