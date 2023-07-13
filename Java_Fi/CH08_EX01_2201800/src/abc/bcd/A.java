package abc.bcd;
import cde.def.B;

public class A {
	void abc() {
		// 클래스 B의 객체 생성 (다른 패키지)
//		B b = new B(); // 오류 이름만 사용하는 것은 불가능
		// #해결방법1. 풀네임 사용
		cde.def.B b1 = new cde.def.B();
		// #해결방법2. import 후 이름만 사용하기
		B b = new B();
		
		// 클래스 C의 객체 생성 (같은 패키지)
		C c = new C();
	}

}
