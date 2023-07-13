package bcd;

import abc.A;

public class D extends A{
	void def() {
		System.out.println(a);
		System.out.println(b);
		//자식클래스인경우는 다른 패키지라도 protected는 사용 가능
//		System.out.println(c);
//		System.out.println(d);
		
	}

}
