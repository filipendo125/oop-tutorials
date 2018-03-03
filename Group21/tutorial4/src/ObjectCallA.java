class Number {
   int x;
}

public class ObjectCallA {

   public static void main ( String[] args ) {
      Number a = new Number();
      a.x=4;
      System.out.println(a.x);
      Number b=a;
      b.x=5;
      System.out.println(b.x);
      System.out.println(a.x);
   }
}