//클래스 내부에서 자기 멤버 호출
class A{
	int m=3;
	int n=5;
	void abc() {
		System.out.println("안녕");
		System.out.println(m);
		System.out.println(n);
	}
	void bcd() {
		abc();
		System.out.println("방가");
	}
}
public class Test {
	public static void main(String[] args) {
		//#1. 객체 생성
		A a = new A();
		//#2. 멤버 사용
		a.abc();
		a.bcd();
	}

}
