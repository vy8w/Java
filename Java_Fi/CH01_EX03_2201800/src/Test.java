
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
		
		//printf() : print_format의 약자
		System.out.printf("이름은 김동형, 나이는 100, 몸무게는 10.3\n");
		System.out.printf("이름은 홍길동, 나이는 200, 몸무게는 22.5\n");
		System.out.println("이름은 " + "홍길동" + ", 나이는 "+ "200");
		System.out.printf("이름은 %s, 나이는 %d, 몸무게는 %f\n", "김동형", 100, 10.3);
		System.out.printf("이름은 %s, 나이는 %d, 몸무게는 %f\n", "홍길동", 200, 22.5);
	}
}
