
public class Test {
	public static void main(String[] args) {
		//산술연산자
		System.out.println(7+4);
		System.out.println(7-4);
		System.out.println(7*4);
		System.out.println(7/4);
		System.out.println(7%4);
				
		//증감연산자
		int a=3;
		int b=a++;
		System.out.println(a); //4
		System.out.println(b); //3
				
		a=3;
		b=++a;
		System.out.println(a); //4
		System.out.println(b); //4
				
		a=3;
		System.out.println(a++); //3
		System.out.println(++a); //5
				
		a=3;
		b=4;
		int c = a++ + ++b;
		System.out.println(a); //4
		System.out.println(b); //5
		System.out.println(c); //3+5=8 
	}

}
