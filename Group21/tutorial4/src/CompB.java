class Num {
  int value;
  public Num(int v) {
    value = v;
  }
}

class CompB {
  public static void main(String[] args) {
    Num a = new Num(5);
    Num b = new Num(5);
    System.out.println(a == b);
  }
}