public class AddOneE {
    public static int[] addOne(int[] anArray) {
        anArray = new int[2];
        return anArray;
    }
    public static void main(String[] args) {
        int[] a = { 0, 1 };
        a = addOne(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}