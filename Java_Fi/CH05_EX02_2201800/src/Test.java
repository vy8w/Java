
public class Test {
	public static void main(String[] args) {
		//1차원 배열 생성 및 초기화 3가지 방법
		
		// a ----> [1.1, 2.2, 3.3]
		//방법1
		double[] a;
		a = new double[3];
		a[0]=1.1;
		a[1]=2.2;
		a[2]=3.3;
		
		//방법2
		double[] b;
		b = new double[] {1.1, 2.2, 3.3};
		
		//방법3
		double[] c = {1.1, 2.2, 3.3}; //선언과 값의 대입 분리불가 
		
	}
}
