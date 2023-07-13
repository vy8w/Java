
public class Test {
	public static void main(String[] args) {
		//length, 원소값 출력
		double[] a = {1.1, 2.2, 3.3, 4.4};
		System.out.println(a.length); //4
		//...100줄
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		//for each
		for(double b:a) {
			System.out.println(b);
		}
		
	}
}
