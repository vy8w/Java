package abc;

public class B {
	void bcd() {
		//객체생성
		A a = new A();
		//멤버 사용
		System.out.println(a.a);
		System.out.println(a.b);
		System.out.println(a.c);
//		System.out.println(a.d);
		//같은 패키지라도 private 멤버는 사용 불가
	}

}
