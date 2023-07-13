//메서드 오버로딩

public class Test {
	public static void main(String[] args) {
		
		abc();
		abc(2.8);		
		abc("안녕");
		
		abc(3);
		abc(2,3);
		abc(1,2,3);
		abc(1,2,3,4);
		abc(1,2,3,4,5);
		abc(1,2,3,4,5,6);
		abc(1,2,3,4,5,6,7);
		abc(1,2,3,4,5,6,7,8);
		
		
	
		
		
		
	}
	public static void abc(String a) {
		
	}
	public static void abc() {
		System.out.println("1");
	}
	public static void abc(double a) {
		System.out.println("2");
	}
	public static void abc(int a) {
		System.out.println("3");
	}
	public static void abc(int a, int b) {
		System.out.println("4");
	}
	public static void abc(int a, int b, int c) {
		System.out.println("5");
	}
	public static void abc(int a, int b, int c, int d) {
		System.out.println("6");
	}
	public static void abc(int a, int b, int c, int d, int e) {
		System.out.println("7");
	}
	public static void abc(int a, int b, int c, int d, int e, int f) {
		System.out.println("8");
	}
	public static void abc(int a, int b, int c, int d, int e, int f, int g) {
		System.out.println("9");
	}
	public static void abc(int a, int b, int c, int d, int e, int f, int g, int h) {
		System.out.println("10");
	}
	
}

