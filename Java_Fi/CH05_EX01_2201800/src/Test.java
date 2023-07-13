
public class Test {
	public static void main(String[] args) {
		//배열의 선언
		int[] a1;
		int a2[];
		
		//배열의 객체 생성 (heap 메모리 강제 초기화)
		int[] a = new int[3];
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		a[0]=3;		a[1]=4; 		a[2]=5;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		
		double[] b = new double[3];
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		
		b[0]=3.5;		b[1]=4.5; 		b[2]=5.5;
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		
		String[] c = new String[3];
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
		
		c[0]="땡큐";		c[1]="베리"; 		c[2]="감사";
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
		
		
		
	}
}



