//내부구성요소(필드)
//필드 vs. 지역변수 1

class A{
	int m;
	int n;
	void print() {
		int k=7; //지역변수는 출력을 위해서 반드시 초기화하여야 함
		System.out.println(m);
		System.out.println(n);
		System.out.println(k);
	}
}

public class Test {
	public static void main(String[] args) {
		//#1.객체생성
		A a = new A();
		//#2.메서드 호출
		a.print();
		
	}
}
