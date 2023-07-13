
public class Test {
	public static void main(String[] args) {
		//삼항연산자
		int a=3;
		int b=(a<2)?10:20;
		System.out.println(b);//20
		
		a=3;
		a=(a>1)?30:40;
		System.out.println(b);//30
		
		a=3;
		b=5;
		int c = (a<2)?(b>2)?10:20:(b>5)?30:40;
		System.out.println(c);//40
	}

}
