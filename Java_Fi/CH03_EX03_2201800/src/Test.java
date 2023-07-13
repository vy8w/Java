
public class Test {
	public static void main(String[] args) {
		//논리연산자
		System.out.println(true && false);//false
		System.out.println((3>2) || !(5<2));//true
		System.out.println(!true ^ !(2<3));//false
		System.out.println(false && !(2!=2));//false
		System.out.println((5>=5) || false);//true
		System.out.println(true ^ false);//true
		
		//논리연산자 vs. 비교연산자
		//비트연산자를 이용한 논리연산
		int a=3, b=3, c=3;
		System.out.println(false & (a++>3));//false
		System.out.println(true | (b++>3));//true
		System.out.println(true ^ (++c>3));//true
		System.out.println(a);//4
		System.out.println(b);//4
		System.out.println(c);//4
		
		//논리연산자를 이용한 논리연산 (short circuit 적용)
		a=3; b=3; c=3;
		System.out.println(false && (a++>3));//false
		System.out.println(true || (b++>3));//true
		System.out.println(true ^ (++c>3));//false
		System.out.println(a);//3
		System.out.println(b);//3
		System.out.println(c);//4
	}

}
