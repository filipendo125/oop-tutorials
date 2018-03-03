public class AddOneD {
    public static void addOne(int[] anArray) {
        anArray = new int[2];
    }
    public static void main(String[] args) {
        int[] a = { 0, 1 };
        addOne(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}