
public class Test {
	public static void main(String[] args) {
		//if제어문
		
		//중괄호의 생략
		int a=3;
		if(a>5) {
			System.out.println("실행1");
			System.out.println("실행2");
		}		
		if(a>5) 
			System.out.println("실행3");
			System.out.println("실행4");
		//type1
		if(a<4) {
			System.out.println("실행5");
		}
		if(a<2) {
			System.out.println("실행6");
		}
		
		//type2
		a=3;
		if(a>2) {
			System.out.println("실행7");
		}
		else {
			System.out.println("실행8");
		}
		
		
		a=3;
		int b;
		if(a>2) {
			b=10;
		}
		else {
			b=20;
		}
		System.out.println(b); //10
		//b=(a>2)?10:20;
		//System.out.println(b);//10
		
		//type3-1
		int s=85;
		if(s>=90) {
			System.out.println("A학점");
		}
		else if(s>=80) {
			System.out.println("B학점");
		}
		else if(s>=70) {
			System.out.println("C학점");
		}
		else {
			System.out.println("F학점");
		}
				
		//type3-2
		s=85;
		if(s>=70) {
			System.out.println("C학점");
		}
		else if(s>=80) {
			System.out.println("B학점");
		}
		else if(s>=90) {
			System.out.println("A학점");
		}
		else {
			System.out.println("F학점");
		}
		
		//type3-3
		s=85;
		if(70<=s && s<80) {
			System.out.println("C학점");
		}
		else if(80<=s && s<90) {
			System.out.println("B학점");
		}
		else if(s>=90) {
			System.out.println("A학점");
		}
		else {
			System.out.println("F학점");
		}
		
	}

}
