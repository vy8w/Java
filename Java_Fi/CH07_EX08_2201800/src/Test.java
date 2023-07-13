// 
//생성자
class A{
	int m;
	void work() {
		System.out.println(m);
	}
//	A(){ 컴파일러가 자동으로 추가해주는 기본생성자
//		
//	}
}

class B{
	int m;
	void work() {
		System.out.println(m);
	}
	B(){
		
	}
}

class C{
	int m;
	void work() {
		System.out.println(m);
	}
	C(int a){
		m=a;
	}
}




public class Test {
	public static void main(String[] args) {
		//#객체생성
		A a = new A();
		//#멤버사용
		a.work();
		
		//#객체생성
		B b = new B();
		//#멤버사용
		b.work();
		
		//#객체생성
//		C c = new C();//기본생성자가 없어서 오류
		C c = new C(3);
		//#멤버사용
		c.work();//
		
	}
}






