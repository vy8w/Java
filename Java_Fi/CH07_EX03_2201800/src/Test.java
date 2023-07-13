//클래스의 외부에서 멤버 호출하기
class A{
	int m=3;
	int n=5;
	void abc() {
		System.out.println("안녕");
	}
	void bcd() {
		System.out.println("방가");
	}
}
public class Test {
	public static void main(String[] args) {
		//#1.객체 생성
		A a = new A();
		
		//#2.멤버 사용
		System.out.println(a.m);
		System.out.println(a.n);
		a.abc();
		a.bcd();
		
	}
}
