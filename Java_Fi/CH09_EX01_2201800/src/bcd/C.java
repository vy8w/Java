package bcd;

import abc.A; //ctrl+shift+o=자동import

public class C {
	void cde() {
		//객체생성
		A a = new A();
		//멤버사용
		System.out.println(a.a);
		//다른 패키지에서는 public 멤버만 사용 가능
//		System.out.println(a.b);
//		System.out.println(a.c);
//		System.out.println(a.d);
	}

}
