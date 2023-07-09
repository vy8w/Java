
public class Test {
	public static void main(String[] ar) {
		//println()
		System.out.println("화면출력");
		System.out.println("화면"+"출력");
		System.out.println(3.8);
		System.out.println(5);
		System.out.println("화면"+3);
		System.out.println("화면"+3+5);
		System.out.println(3+5+"화면");
		
		System.out.println(); //
		
		//print()
				System.out.print("화면출력");
				System.out.print("화면"+"출력");
				System.out.print(3.8);
				System.out.print(5);
				System.out.print("화면"+3);
				System.out.print("화면"+3+5);
				System.out.print(3+5+"화면");
				
				System.out.println();
				System.out.println();
				
				//print() : print format의 약자
				System.out.printf("이름은 표정인, 나이는 10, 몸무게는 20.3\n");
				System.out.printf("이름은 커피, 나이는 2, 몸무게는 4.3\n");
//				System.out.println("이름은 " + "커피" + ", 나이는 " + "4" );
				System.out.printf("이름은 %s, 나이는 %d, 몸무게는 %f\n", "표정인", 10, 20.3);
				System.out.printf("이름은 %s, 나이는 %d, 몸무게는 %f\n", "커피", 2, 4.3);
	}

}
