//
//생성자 오버로딩
class A{
	A(){
		System.out.println("첫번째 생성자");
	}
	A(int a){
		System.out.println("두번째 생성자");
	}
	A(int a, int b){
		System.out.println("세번째 생성자");
	}
	A(double a){
		System.out.println("네번째 생성자");
	}
}

public class Test {
	public static void main(String[] args) {
		//객체 생성
		A a1 = new A();
		A a2 = new A(3);
		A a3 = new A(1,2);
		
		A a4 = new A(5.8);
		
		
	}
}
