
public class Test {
	public static void main(String[] args) {
		//String 클래스 메서드2
				String a = "Hello!";
				
				//toLowerCase(), toUpperCase()
				System.out.println(a.toLowerCase());//hello!
				System.out.println(a.toUpperCase());//HELLO!
				
				//replace()
				System.out.println(a.replace("ll","mm"));//hemmo!
				
				//substring()
				String b ="안녕하세요, 반갑습니다";
				System.out.println(b.substring(1,5));//녕하세요
				
				//split()
				String c = "abc,bcd-cde";
				String[] d = c.split(",|-");
				//System.out.println(Arrays.toString(d));//[abc, bcd, cde]
				
				//trim()
				String e = "     abc     ";
				System.out.println(e.trim());
				
				//equals(), equalsIgnoreCase()
				String aa = new String("Java");
				String bb = new String("Java");
				String cc = "Java";
				String dd = "Java";
				String ee = "java";
				
				System.out.println(aa==bb);//false
				System.out.println(aa==cc);//false
				System.out.println(aa==dd);//false
				System.out.println(aa==ee);//false
				System.out.println(bb==cc);//false
				System.out.println(bb==dd);//false
				System.out.println(bb==ee);//false
				System.out.println(cc==dd);//true
				System.out.println(cc==ee);//false
				System.out.println(dd==ee);//false
				
				System.out.println(aa.equals(bb));//true
				System.out.println(aa.equals(cc));//true
				System.out.println(aa.equals(dd));//true
				System.out.println(aa.equals(ee));//false
				System.out.println(bb.equals(cc));//true
				System.out.println(bb.equals(dd));//true
				System.out.println(bb.equals(ee));//false
				System.out.println(cc.equals(dd));//true
				System.out.println(cc.equals(ee));//false
				System.out.println(dd.equals(ee));//false
				
				System.out.println(cc.equalsIgnoreCase(ee));//true
				System.out.println(dd.equalsIgnoreCase(ee));//true
				
//				미션1. 
//				"abc-bcddasggsaastega.hwp"에서 확장명을 제외하고 파일이름을 출력하라. (단,파일이름의 길이는 다를수 있다.)
				String aaa = "abc-bcddasggsaastega.hwp";
				System.out.println(aaa.substring(0, aaa.lastIndexOf(".")));
				
//				미션2. 
//				"영화 [홍길동]에서 주인공의 나이는 [16]살이다."에서 이름과 나이를 각각 한줄의 코드로 출력하라.
				//이름
				String bbb="영화 [홍길동]에서 주인공의 나이는 [16]살이다.";
				System.out.println(bbb.substring(bbb.indexOf("[")+1, bbb.indexOf("]")));
				
//				미션3. 
//				"신한은행 결제금액 500원입니다."에서 사용금액을 한줄의 코드로 출력하라note  
	}
}
