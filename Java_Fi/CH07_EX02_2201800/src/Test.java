//내부구성요소 (필드)
//필드의 초기값

class A{
   boolean a;
   int b;
   double c;
   String d;
   void print() {
      System.out.println(a);
      System.out.println(b);
      System.out.println(c);
      System.out.println(d);      
   }
}

public class Test {
   public static void main(String[] args) {
      //#1.객체생성
      A a = new A();
      //#2.메서드출력
      a.print();
      
   }
}