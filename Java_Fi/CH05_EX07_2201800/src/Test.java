
public class Test {
	public static void main(String[] args) {
		
		//2차원 배열 원소출력
//		1 2
//		3
//		4 5 6
		
		int[][] a = {{1,2},{3},{4,5,6}};
		
		//일반for문(length사용)
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.println(a[i][j]);
			}
		}
		
		
		
		
		//for each문
		for(int[] m : a) {
			for(int k: m) {
				System.out.println(k);
			}
		}
		
	}
}

